package com.ds2.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ds2.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
<<<<<<< HEAD
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{CalculateTip()}
=======
        setContentView(R.layout.activity_main)
        binding.calculateButton.setOnClickListener { calculateTip() }
        //setContentView(binding.root)
>>>>>>> 72f00869967b9db75a4f495cb00c9dbdcc679e41

    }

    fun CalculateTip()
    {
        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDouble()

        val selectId = binding.tipOptions.checkedRadioButtonId
        val tipPercentage = when (selectId)
        {
            R.id.optionTwentyPercent -> 0.20
            R.id.optionEighteenPercent -> 0.18
            else -> 0.15
        }

        var tip = tipPercentage * cost
        val roundUp = binding.roundUpSwitch.isChecked

        if (roundUp)
        {
            tip = kotlin.math.ceil(tip)
        }

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = tip.toString()
    }
}