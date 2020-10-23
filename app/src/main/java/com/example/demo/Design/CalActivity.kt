package com.example.demo.Design

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demo.R
import kotlinx.android.synthetic.main.activity_cal.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class CalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal)

        btnone.setOnClickListener { clearresult("1",true) }
        btntwo.setOnClickListener { clearresult("2",true) }
        btnthree.setOnClickListener { clearresult("3",true) }
        btnfour.setOnClickListener { clearresult("4",true) }
        btnfive.setOnClickListener { clearresult("5",true) }
        btnsix.setOnClickListener { clearresult("6",true) }
        btnseven.setOnClickListener { clearresult("7",true) }
        btneight.setOnClickListener { clearresult("8",true) }
        btnnine.setOnClickListener { clearresult("9",true) }
        btnzero.setOnClickListener { clearresult("0",true) }
        btndote.setOnClickListener { clearresult(".",true) }

        btnpluse.setOnClickListener { clearresult("+",false) }
        btnminus.setOnClickListener { clearresult("-",false) }
        btnmult.setOnClickListener { clearresult("*",false) }
        btndivide.setOnClickListener { clearresult("/",false) }
        btnopen.setOnClickListener { clearresult("(",false) }
        btnclose.setOnClickListener { clearresult(")",false) }

        btnac.setOnClickListener {
            tvvalue.text=""
            tvresult.text=""
        }

        btnback.setOnClickListener {
            val String = tvvalue.text.toString()
            if (String.isNotEmpty()){
                tvvalue.text=String.substring(0,String.length-1)
            }
           tvresult.text=""
        }

        btnequal.setOnClickListener {
            try {
                val value = ExpressionBuilder(tvvalue.text.toString()).build()
                var result = value.evaluate()
                var longresult = result.toLong()
                if (result == longresult.toDouble()){
                    tvresult.text = longresult.toString()
                }
            }catch (e:Exception){

            }
        }
    }

    fun clearresult(Str : String , Clear : Boolean){
        if (tvresult.text.isNotEmpty()){
            tvvalue.text = ""
        }
        if(Clear){
            tvresult.text=""
            tvvalue.append(Str)
        }else{
            tvvalue.append(Str)
            tvresult.text=""
        }
    }
}