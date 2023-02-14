package com.example.unittestexample

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var preferredLanguage:TextView
    private lateinit var english:Button
    private lateinit var french:Button
    private lateinit var german:Button
    private lateinit var hindi:Button
    private lateinit var urdu:Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preferredLanguage = findViewById(R.id.preferred_language)
        english = findViewById(R.id.english)
        french = findViewById(R.id.french)
        german = findViewById(R.id.german)
        hindi = findViewById(R.id.hindi)
        urdu = findViewById(R.id.urdu)

        getButton()

    }

    @SuppressLint("SetTextI18n")
    private fun getButton() {
        english.setOnClickListener {
            if (preferredLanguage.text == ""){
                preferredLanguage.text = "English"
            }
            preferredLanguage.text = "English"
        }

        french.setOnClickListener {
            if (preferredLanguage.text == ""){
                preferredLanguage.text = "French"
            }
            preferredLanguage.text = "French"
        }

        german.setOnClickListener {
            if (preferredLanguage.text == ""){
                preferredLanguage.text = "German"
            }
            preferredLanguage.text = "German"
        }

        hindi.setOnClickListener {
            if (preferredLanguage.text == ""){
                preferredLanguage.text = "Hindi"
            }
            preferredLanguage.text = "Hindi"
        }

        urdu.setOnClickListener {
            if (preferredLanguage.text == ""){
                preferredLanguage.text = "Urdu"
            }
            preferredLanguage.text = "Urdu"
        }
    }
}

