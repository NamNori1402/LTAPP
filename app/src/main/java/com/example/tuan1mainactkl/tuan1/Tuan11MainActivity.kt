package com.example.tuan1mainactkl.tuan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.tuan1mainactkl.R

class Tuan11MainActivity : AppCompatActivity() {
    //khai bao cac control
    var txt1:EditText? = null;
    var txt2:EditText? = null;
    var btn1:Button? = null;
    var tv1: TextView?= null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan11_main)
        //anh xa
        txt1 = findViewById(R.id.demo1txt11)
        txt2 = findViewById(R.id.demo1txt2)
        btn1 = findViewById(R.id.demo11btn1)
        tv1 = findViewById(R.id.demo11tv1)
        // su li su kien
        btn1!!.setOnClickListener(View.OnClickListener {
            tinhtong()
        })
    }
    private fun tinhtong(){
        //lay du lieu duoc nhap vao tu edittext
        val str1=txt1!!.text.toString()
        //chuyen sang kieu so
        val so1=str1.toFloat()
        // lay du lieu nhap vao tu edittext2
        val str2=txt2!!.text.toString()
        // chuyenn sang kieu so
        val so2=str2.toFloat()
        // tinh tong
        val tong=so1+so2
        // in kq
        tv1!!.text=tong.toString()
    }
}