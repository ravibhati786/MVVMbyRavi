package com.example.mvvmbyravi.ui.auth

interface AuthListener {

    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}