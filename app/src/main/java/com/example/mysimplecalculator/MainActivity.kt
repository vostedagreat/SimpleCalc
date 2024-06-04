package com.example.mysimplecalculator

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var myAnswer: TextView? = null
    var myFirstNumber: EditText? = null
    var mySecondNumber: EditText? = null
    var buttonAdd: Button? = null
    var buttonSubtract: Button? = null
    var buttonDivide: Button? = null
    var buttonMultiply: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myAnswer = findViewById(R.id.mTvAnswer)
        myFirstNumber = findViewById(R.id.mEdtFnum)
        mySecondNumber = findViewById(R.id.mEdtSnum)
        buttonAdd = findViewById(R.id.mBtnAdd)
        buttonSubtract = findViewById(R.id.mBtnSubtract)
        buttonDivide = findViewById(R.id.mBtnDivide)
        buttonMultiply = findViewById(R.id.mBtnMultiply)
        //Set on click listeners to button
        buttonAdd!!.setOnClickListener {
            //Receive data from the edit text
            var firstNumber = myFirstNumber!!.text.toString().trim()
            var secondNumber = mySecondNumber!!.text.toString().trim()

        }
        buttonSubtract!!.setOnClickListener {

        }
        buttonDivide!!.setOnClickListener {

        }
        buttonMultiply!!.setOnClickListener {

        }
    }
}



    }
}