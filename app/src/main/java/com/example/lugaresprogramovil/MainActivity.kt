package com.example.lugaresprogramovil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =  ActivitiMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        FirebaseApp.initializeApp(this)
        auth = Firebase.auth

        binding.bt_login.setOnClickListener{
            haceLogin();
        }

        binding.bt_register.setOnClickListener{
            haceRegister();
        }

    }

    private fun haceLogin(){
        TODO("Not implemented")
    }

    private fun haceRegister(){
        TODO("Not implemented")
    }
}