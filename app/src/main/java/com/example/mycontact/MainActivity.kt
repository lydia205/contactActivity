package com.example.mycontact

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val firstName ="GRACE"
        val lastName ="Quenn"
        val address ="cape town"
        val isMale="false"
        val dayOfBirth="06"
        val monthOfBirth="june"
        val yearOfBirth="2007"
        Log.d("Hey I am ", firstName + " " + lastName + "and I live in " + address +
                " and I was born on "+ dayOfBirth + " " + monthOfBirth + " " + yearOfBirth)

        val age = 19
        val yearsTo100 = 100 - age
        val ageInMonth = age *12
        val ageInDays=age*365
        val remainder =age%5

        println("Age: $age")
        println("You will be 100 in $yearsTo100 years")
        println("Your age in months: $ageInMonth")
        println("your age in days: $ageInDays")
        println("your remaindre :$remainder")
        
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}