package com.example.chonkeaw.ui.feed

import android.content.ContentValues
import android.graphics.BitmapFactory
import android.media.Image
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.drawable.toIcon
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chonkeaw.R
import com.example.chonkeaw.databinding.FragmentFeedBinding
import com.example.chonkeaw.ui.feed.model.adt
import com.example.chonkeaw.ui.feed.model.rv_data
import com.example.chonkeaw.ui.feed.model.viewholder
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.fragment_feed.*
import kotlinx.android.synthetic.main.rv_row.*
import kotlinx.android.synthetic.main.rv_row.view.*
import java.io.File
import java.util.*

class FeedFragment : Fragment() {

    private lateinit var feedViewModel: FeedViewModel
    private var _binding: FragmentFeedBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,

        ): View? {


        feedViewModel =
            ViewModelProvider(this).get(FeedViewModel::class.java)

        _binding = FragmentFeedBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textFeed
        feedViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it


        })

        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //var imgV : ImageView
        ///REALTIME DATABASE GET BIO **********

        val rootRef = Firebase.database.getReference()
        val userRef = rootRef.child("User")

        userRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = snapshot.child("FT2EiJlO9RcAFgz4MWEsLuDpInv1").child("Bio").getValue<String>()
                val d = Log.d(ContentValues.TAG, "Value is: " + value )
                val storageRef = FirebaseStorage.getInstance().reference.child("image/im1.png")


               val rv_dataLists = mutableListOf<rv_data>()
                for(i in 0 until snapshot.childrenCount){
                   // var feedName = snapshot.children.elementAt(i.toInt()).children.elementAt(2).getValue<String>().toString() //Use Name
                    var feedName = snapshot.children.elementAt(i.toInt()).child("Name").getValue<String>().toString()
                    var feedBio =  snapshot.children.elementAt(i.toInt()).children.elementAt(0).getValue<String>().toString() //Use Bio
                    rv_dataLists.add(rv_data(R.drawable.ic_launcher_foreground,feedName,feedBio))
                }

                val adt = adt(rv_dataLists)
                rv.adapter = adt

            }
            override fun onCancelled(error: DatabaseError) {
                Log.w(ContentValues.TAG, "Failed to read value.", error.toException())
            }
        })

        rv.layoutManager = LinearLayoutManager(this@FeedFragment.context)
        val div = DividerItemDecoration(this@FeedFragment.context, DividerItemDecoration.VERTICAL)
        rv.addItemDecoration(div)


    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}