package com.ds2.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ds2.tiptime.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        binding.botaoCalcular.setOnClickListener { calculateTip() }

//        val costOfService = binding.inputEntradaGorjeta
//        costOfService.text = "Hi, ?".toString()
//
//        binding.inputEntradaGorjeta.text = "vixe, mudou!".toString()
    }

    fun calculateTip()
    {
        val stringInEdit = binding.inputEntradaGorjeta.toString()
        val const = stringInEdit.toDouble()

        val selectId = binding.avaliarOpcoes.checkedRadioButtonId

        val tipPercentage = when (selectId)
        {
            R.id.opcaoIncrivel -> 0.20
            R.id.opcaoBom -> 0.18
            else -> 0.15
        }

        /*if (radioButon1)
        {
            val porcentagem = 0.2
        }
        if (radioButon1)
        {
            val porcentagem = 0.18
        }
        if (radioButon1)
        {
            val porcentagem = 0.15
        }

        var resultado = valorDaTextBox * porcentagem

        var tipTotal = binding.tipTotal.*/
    }
}