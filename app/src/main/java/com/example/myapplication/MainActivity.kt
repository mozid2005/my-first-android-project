package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnINcrease.setOnClickListener {
            val text = binding.textView.text.toString().toInt() + 1
            binding.textView.text = "$text"
        }


        binding.btnDecrease.setOnClickListener {
            val text = binding.textView.text.toString().toInt() - 1
            binding.textView.text = "$text"
        }

        binding.btnReset.setOnClickListener {
            binding.textView.text = "0"
        }



    }
}