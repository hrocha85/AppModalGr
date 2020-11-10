package com.example.modalgr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Abrir a LoginActivity após 3 segundos
        Handler(Looper.getMainLooper()).postDelayed({
            //Iniciar uma intent - transição da tela Splash para a tela Login
            val intentLogin = Intent(this,LoginActivity::class.java)
            startActivity(intentLogin)
            finish()
        }, 3000)

    }

}