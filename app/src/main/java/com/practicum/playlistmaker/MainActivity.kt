package com.practicum.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val butSearch: Button = findViewById<Button>(R.id.search)
        val butSearchClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на картинку!", Toast.LENGTH_SHORT).show()
            } }
        butSearch.setOnClickListener(butSearchClickListener)

        val butLib = findViewById<Button>(R.id.library)
        butLib.setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажали на картинку!", Toast.LENGTH_SHORT).show()
        }
        val butSettings = findViewById<Button>(R.id.settings)
        butSettings.setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажали на картинку!", Toast.LENGTH_SHORT).show()
        }

    }


}