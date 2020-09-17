package com.android.whatsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.whatsapp.auth.LoginActivity
import com.google.firebase.auth.FirebaseAuth

class SplashActivity : AppCompatActivity() {
    val auth by lazy {
        FirebaseAuth.getInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (auth.currentUser == null) {
            finishAffinity()
            startActivity(Intent(this, LoginActivity::class.java))
        } else {
            finishAffinity()
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}