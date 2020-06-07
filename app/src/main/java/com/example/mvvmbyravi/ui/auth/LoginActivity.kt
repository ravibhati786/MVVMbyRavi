package com.example.mvvmbyravi.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmbyravi.R

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStarted() {

    }

    override fun onSuccess() {

    }

    override fun onFailure(message: String) {

    }
}
