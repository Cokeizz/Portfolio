package com.example.chonkeaw.ui.feed.model

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.chonkeaw.R
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.rv_row.view.imgFileIcon

class viewholder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var imgFileIcon = itemView.findViewById<ImageView>(R.id.imgFileIcon)
    var tvFileType =itemView.findViewById<TextView>(R.id.tvFileType)
    var tvFileDescription = itemView.findViewById<TextView>(R.id.tvFileDescription)
    var chonkeawBtn = itemView.findViewById<Button>(R.id.CK_btn)

//var data = Firebase.database.getReference().child("User")


    init {
        itemView.setOnClickListener{
            Toast.makeText(itemView.context,tvFileType.text,Toast.LENGTH_LONG).show()
        }
        chonkeawBtn.setOnClickListener {
            Toast.makeText(chonkeawBtn.context,tvFileType.imeActionId.toString(),Toast.LENGTH_LONG).show()

        }

    }



}