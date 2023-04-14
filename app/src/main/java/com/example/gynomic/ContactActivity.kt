package com.example.gynomic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class ContactActivity : AppCompatActivity() {
    lateinit var myContacts:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        myContacts=findViewById(R.id.mListView)
        myContacts.setOnItemClickListener { adapterView, view, i, l ->
            val name= adapterView.getItemAtPosition(i).toString()
            Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
        }
    }
}