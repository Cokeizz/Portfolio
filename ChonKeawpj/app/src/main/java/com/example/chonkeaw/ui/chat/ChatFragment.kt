package com.example.chonkeaw.ui.chat

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chonkeaw.R
import com.example.chonkeaw.databinding.FragmentChatBinding
import com.example.chonkeaw.ui.chat.ChatViewModel
import com.example.chonkeaw.ui.feed.model.adt
import com.example.chonkeaw.ui.feed.model.rv_data
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.fragment_chat.*
import kotlinx.android.synthetic.main.fragment_feed.*


class ChatFragment : Fragment() {

    private lateinit var chatViewModel: ChatViewModel
    private var _binding: FragmentChatBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        chatViewModel =
            ViewModelProvider(this).get(ChatViewModel::class.java)

        _binding = FragmentChatBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textChat
        chatViewModel.text.observe(viewLifecycleOwner, Observer {
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
        val userId = Firebase.auth.currentUser?.uid.toString()

        //val dataRef = Firebase.database.getReference().child("User")



        userRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = snapshot.child("FT2EiJlO9RcAFgz4MWEsLuDpInv1").child("Bio").getValue<String>()
                val d = Log.d(ContentValues.TAG, "Value is: " + value )

                val rv_dataLists = mutableListOf<rv_data>()
                for(i in 0 until snapshot.child(userId).child("Chat").childrenCount){

                    var feedName = snapshot.child(userId).child("Chat").children.elementAt(i.toInt()).getValue<String>().toString()//Use Name
                    var useName = snapshot.child(feedName).child("Name").getValue<String>().toString()

                    var feedBio = snapshot.child(feedName).child("Bio").getValue<String>().toString()   //Use Bio


                    rv_dataLists.add(rv_data(R.drawable.ic_launcher_foreground,useName,feedBio))
                }

                val adt = adt(rv_dataLists)
                rvChat.adapter = adt

            }
            override fun onCancelled(error: DatabaseError) {
                Log.w(ContentValues.TAG, "Failed to read value.", error.toException())
            }
        })

        rvChat.layoutManager = LinearLayoutManager(this@ChatFragment.context)
        val div = DividerItemDecoration(this@ChatFragment.context, DividerItemDecoration.VERTICAL)
        rvChat.addItemDecoration(div)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}