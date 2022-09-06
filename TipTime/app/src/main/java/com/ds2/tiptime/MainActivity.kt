package com.ds2.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ds2.tiptime.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.botaoCalcular.setOnClickListener{CalculateTip()}

        /*val costOfService = binding.inputEntradaGorjeta
        costOfService.text = "Hi, ?".toString()

        binding.inputEntradaGorjeta.text = "vixe, mudou!".toString()*/
    }

    fun CalculateTip()
    {

    }
}