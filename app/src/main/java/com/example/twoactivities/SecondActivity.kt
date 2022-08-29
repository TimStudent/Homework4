package com.example.twoactivities

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.twoactivities.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val view = binding.root
        setContentView(view)
        val intent = intent
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        binding.textMessage.text=message



    }

    fun returnReply(view: View) {

    }
}