package com.example.demo.Design

import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.widget.RadioButton
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.demo.R
import kotlinx.android.synthetic.main.activity_demo.*


open class DemoActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        btnsubmit.setOnClickListener {

            var value = radioGroup.checkedRadioButtonId
            var radioButton = findViewById<RadioButton>(value)
            tvtext.text = radioButton.text

            if (rb1.isChecked) {
                val face = Typeface.createFromAsset(
                    assets,
                    "syncopate.ttf"
                )
                tvtext.setTypeface(face)
            } else if (rb2.isChecked) {
                val face = Typeface.createFromAsset(
                    assets,
                    "akronim.ttf"
                )
                tvtext.setTypeface(face)
            } else if (rb3.isChecked) {
                val face = Typeface.createFromAsset(
                    assets,
                    "syncopate.ttf"
                )
                tvtext.setTypeface(face)
            }
            else if (rb4.isChecked) {
                val face = Typeface.createFromAsset(
                    assets,
                    "allan.ttf"
                )
                tvtext.setTypeface(face)
            }
        }
    }
}