package com.kiran.kiran

import android.app.backup.BackupAgent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toolbar
import com.kiran.kiran.R.id.tvName

class MainActivity2 : AppCompatActivity() {
    lateinit var tvName:TextView
    lateinit var tvAge: TextView
    lateinit var tvHeight:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tvName=findViewById(R.id.tvName)
        tvAge= findViewById(R.id.tvAge)
        tvHeight= findViewById(R.id.tvHeight)
        var Name = intent.getStringExtra("Name")
        var Age = intent.getStringExtra("Age" )
        var Height = intent.getStringExtra("Height")
        System.out.println("Name $Name Age $Age Height $Height")


        tvName.setText("your name is $Name")
        tvAge.setText("your age is $Age")
        tvHeight.setText("your height is $Height")
        System.out.println("name $Name")
        System.out.println("age $Age")
        System.out.println("height $Height")
    }
}