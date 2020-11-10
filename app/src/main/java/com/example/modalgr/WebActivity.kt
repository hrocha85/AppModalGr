package com.example.modalgr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        //Habilitando a execução de codigo java script no WebView
        wbvWeb.settings.javaScriptEnabled = true

        //carregando url
        wbvWeb.loadUrl("https://modalgr.com.br/")

        wbvWeb.webViewClient = WebViewClient()

    }
}