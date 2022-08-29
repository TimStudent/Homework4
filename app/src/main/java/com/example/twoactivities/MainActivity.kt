package com.example.twoactivities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val LOG_TAG = MainActivity::class.java.simpleName
    companion object {
        val EXTRA_MESSAGE = "com.example.twoactivities.extra.MESSAGE"
    }

    private var mMessageEditText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMessageEditText = findViewById(R.id.editTextMain)
    }

    fun launchSecondActivity(view: View) {
        Log.d(LOG_TAG,"Button Clicked")
        val message = mMessageEditText?.text.toString()
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }
}