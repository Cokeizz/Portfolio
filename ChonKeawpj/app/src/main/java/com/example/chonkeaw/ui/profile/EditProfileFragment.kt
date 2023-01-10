package com.example.chonkeaw.ui.profile


import android.content.Intent
import android.os.Bundle

import android.widget.Button
import androidx.activity.OnBackPressedCallback

import androidx.appcompat.app.AppCompatActivity
import com.example.chonkeaw.Guide
import com.example.chonkeaw.MainActivity

import com.example.chonkeaw.R
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.fragment_editprofile.*


class EditProfileFragment : AppCompatActivity() {

    var Btn_Editprofile : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_editprofile)

        val user = Firebase.auth.currentUser
        val data = Firebase.database.getReference().child("User")

        val actionBar = supportActionBar
        actionBar!!.title = "Edit Profile"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)


        data.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val name = snapshot.child(user?.uid.toString()).child("Name")
                val bio = snapshot.child(user?.uid.toString()).child("Bio")
                etName.setText(name.getValue<String>())
                etBio.setText(bio.getValue<String>())

                etSave_btn.setOnClickListener {
                    snapshot.child(user?.uid.toString()).child("Name").ref.setValue(etName.text.toString())
                    snapshot.child(user?.uid.toString()).child("Bio").ref.setValue(etBio.text.toString())
                }

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }


        })




    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}