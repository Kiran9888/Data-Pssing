package com.kiran.kiran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tvName:TextView
    lateinit var tvAge:TextView
    lateinit var tvHeight:TextView
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvName=findViewById(R.id.tvName)
        tvAge=findViewById(R.id.tvAge)
        tvHeight=findViewById(R.id.tvHeight)
        btn=findViewById(R.id.btn)

        btn.setOnClickListener{
            if (tvName.text.toString().isNullOrEmpty()){
                tvName.error="enter your name"
            }
            else if(tvAge.text.toString().isNullOrEmpty()){
                tvAge.error="enter your age"
            }
            else if(tvHeight.text.toString().isNullOrEmpty()){
                tvHeight.error="enter your height"
            }
            else{
                Toast.makeText(this,"Login",Toast.LENGTH_LONG).show()
                var intent= Intent(this,MainActivity2::class.java)
                startActivity(intent)
            }
        }
    }
}