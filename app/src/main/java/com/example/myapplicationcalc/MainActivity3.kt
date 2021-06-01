package com.example.myapplicationcalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        knopka1.setOnClickListener{
        val a : Double = gradustext.text.toString().toDouble() //var a : Double = EditText1.text.toString().toDouble()
        val b = (a*3.141592653589793238462643383279502884197169399375105820974944592307816406286)/180
        radianitext.text = b.toString()
        }
        knopka2.setOnClickListener{
        val c : Double = kilometritext.text.toString().toDouble()
            val d = c*0.62
            militext.text = d.toString()
        }
        knopka3.setOnClickListener {
            val e : Double = metritext.text.toString().toDouble()
            val f = e*3.28
            phutitext.text = f.toString()
        }
        knopka4.setOnClickListener {
            val g : Int = desattext.text.toString().toInt()
            shesttext.text = g.toString(16)
        }
        knopka5.setOnClickListener {
            val h : Int = desat2text.text.toString().toInt()
            dvoichtext.text = h.toString(2)
        }
        knopka6.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}