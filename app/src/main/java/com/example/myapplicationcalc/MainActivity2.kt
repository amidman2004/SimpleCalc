package com.example.myapplicationcalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var fstField: Double? = null

        fun setTextFields(str: String) {
            pole.append(str)
        }
        odin.setOnClickListener{
            setTextFields("1")

        }

        dva.setOnClickListener{
            setTextFields("2")

        }
        tri.setOnClickListener{
            setTextFields("3")

        }
        cheture.setOnClickListener{
            setTextFields("4")

        }
        pat.setOnClickListener{
            setTextFields("5")

        }
        chest.setOnClickListener{
            setTextFields("6")

        }
        sem.setOnClickListener{
            setTextFields("7")

        }
        vosem.setOnClickListener{
            setTextFields("8")
        }
        devat.setOnClickListener{
            setTextFields("9")
        }
        zero.setOnClickListener{
            setTextFields("0")
        }
        C.setOnClickListener {
            pole.setText("")
            pole2.setText("")
        }
        plus.setOnClickListener {
            val a : Double = pole.text.toString().toDouble()
            pole2.setText(" +")
            if (a > 0 || a <= 0 ) {
                pole.setText("")
            }
            ravno.setOnClickListener {
                val b : Double = pole.text.toString().toDouble()
                val c = a + b
                pole.text = c.toString()

            }
        }
        umnoj.setOnClickListener {
            val a : Double = pole.text.toString().toDouble()
            pole2.setText(" X")
            if (a > 0 || a <= 0 ) {
                pole.setText("")
            }
            ravno.setOnClickListener {
                val b : Double = pole.text.toString().toDouble()
                val c = a * b
                pole.text = c.toString()

            }
        }
        delenie.setOnClickListener {
            val a : Double = pole.text.toString().toDouble()
            pole2.setText(" /")
            if (a > 0 || a <= 0 ) {
                pole.setText("")
            }
            ravno.setOnClickListener {
                val b : Double = pole.text.toString().toDouble()
                val c = a/b
                pole.text = c.toString()

            }
        }
        minus.setOnClickListener {
            val a : Double = pole.text.toString().toDouble()
            pole2.setText(" -")
            if (a > 0 || a <= 0 ) {
                pole.setText("")
            }
            ravno.setOnClickListener {
                val b : Double = pole.text.toString().toDouble()
                val c = a - b
                pole.text = c.toString()

            }
        }





        perexod.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}