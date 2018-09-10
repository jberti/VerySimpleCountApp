package com.example.jorgeberti.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contador = Contador()

        btnIncrementar.setOnClickListener {
            textView.text = contador.incCount().toString()
        }

        btnZerar.setOnClickListener {
            textView.text = "0"
            contador.resetCount()
        }
    }
}
