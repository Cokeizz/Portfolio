package com.example.chonkeaw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.chonkeaw.ui.profile.ProfileFragment
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile1.*

class Guide : AppCompatActivity() {

    var Bnt_Guide : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_profile1)

        /*Bnt_Guide = findViewById(R.id.Bnt_Guide) as Button

        Bnt_Guide!!.setOnClickListener {
            var intent = Intent(this,ProfileFragment::class.java)
            startActivity(intent)
            finish()

        }*/
        backBtn2.setOnClickListener { startActivity(Intent(this@Guide, ProfileFragment::class.java)) }


        }


}