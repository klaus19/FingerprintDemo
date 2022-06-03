package com.example.fingerprintdemo

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

  lateinit var toast: Toast
fun AppCompatActivity.toast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

inline fun<reified T : AppCompatActivity>AppCompatActivity.navigateTo(){
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}