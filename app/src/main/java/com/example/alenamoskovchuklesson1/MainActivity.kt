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
        val person4 = Person("Sofi", 16)

        val listForExcursion: MutableList<Person> = mutableListOf(person1, person2, person3)
        listForExcursion.add(person4)

        with(person1) {
            when (age) {
                in 0..17 -> println("$name : Не допускается до экскурсии")
            }
        }

        println("few changes")

    }
}
