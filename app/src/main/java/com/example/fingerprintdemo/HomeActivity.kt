package com.example.fingerprintdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fingerprintdemo.databinding.ActivityHomeBinding

class HomeActivity:AppCompatActivity() {

    lateinit var binding:ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}