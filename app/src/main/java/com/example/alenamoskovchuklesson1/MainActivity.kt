package com.example.alenamoskovchuklesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun homeWork1(args: Array<String>) {

        data class Person(val name: String, val age: Int)

        val person1 = Person("Kate", 39)
        val person2 = Person("Alex", 25)
        val person3 = Person("Mike", 50)


    }
}
