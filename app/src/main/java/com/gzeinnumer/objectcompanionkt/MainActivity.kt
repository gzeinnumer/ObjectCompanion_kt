package com.gzeinnumer.objectcompanionkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Person.callMe()
        Person1.callMe()
    }
}

class Person{
    //static
    companion object Test{
        fun callMe() = println("Aku di panggil")
    }
}

class Person1{
    //static
    companion object {
        fun callMe() = println("Aku di panggil")
    }
}

