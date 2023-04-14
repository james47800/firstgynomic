package com.example.gynomic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var mCalculator:Button
    lateinit var mContact:Button
    lateinit var mWebsite:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mCalculator=findViewById(R.id.mBtnCalculator)
        mContact=findViewById(R.id.mBtnContact)
        mWebsite=findViewById(R.id.mBtnWebsite)

        mCalculator.setOnClickListener {
            val kikotoo=Intent(this,ContactActivity::class.java)
            startActivity(kikotoo)
        }
        mContact.setOnClickListener {
            val watu=Intent(this,ContactActivity::class.java)
            startActivity(watu)

        }
        mWebsite.setOnClickListener {
            val tovuti=Intent(this,ContactActivity::class.java)
            startActivity(tovuti)
        }
    }
}