package com.example.practice_20200930

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkbox_all.setOnCheckedChangeListener { btn, b ->
            checkbox_01.isChecked = b
            checkbox_02.isChecked = b
            checkbox_03.isChecked = b
        }
    }
}