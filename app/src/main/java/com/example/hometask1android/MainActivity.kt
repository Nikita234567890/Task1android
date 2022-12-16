package com.example.hometask1android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.hometask1android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingclass: ActivityMainBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingclass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingclass.root)
        bindingclass.Button1.setOnClickListener {
            var result = bindingclass.edtext.text.toString().toInt()
            bindingclass.resulttext.visibility = View.VISIBLE
            var a = (result + (result /100 *10)).toString()
            bindingclass.resulttext.text = "You must pay $a"
        }
        bindingclass.Button2.setOnClickListener {
            var result = bindingclass.edtext.text.toString().toInt()
            bindingclass.resulttext.visibility = View.VISIBLE
            var a = (result + (result /100 *5)).toString()
            bindingclass.resulttext.text = "You must pay $a"
        }
        bindingclass.Button3.setOnClickListener {
            var result = bindingclass.edtext.text.toString().toInt()
            bindingclass.resulttext.visibility = View.VISIBLE
            var a = (result + (result /100 *2)).toString()
            bindingclass.resulttext.text = "You must pay $a"
        }

    }



}