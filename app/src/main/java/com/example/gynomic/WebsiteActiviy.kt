package com.example.gynomic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActiviy : AppCompatActivity() {
    lateinit var myWeb:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website_activiy)
        myWeb=findViewById(R.id.mWebView)
        var webSettings=myWeb.settings
        webSettings.javaScriptEnabled=true
        myWeb.loadUrl("https://www.emobilis.co.ke")
    }
}