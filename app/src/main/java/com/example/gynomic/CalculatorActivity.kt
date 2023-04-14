package com.example.gynomic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var mAnswer: TextView
    lateinit var mFNum: EditText
    lateinit var mSNum: EditText
    lateinit var mAdd: Button
    lateinit var mSub: Button
    lateinit var mMulti: Button
    lateinit var mDiv: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        mAnswer = findViewById(R.id.mTvTitle1)
        mFNum = findViewById(R.id.mEdtFNum)
        mSNum = findViewById(R.id.mEdtSNum)
        mAdd = findViewById(R.id.mBtnAdd)
        mSub = findViewById(R.id.mBtnSub)
        mMulti =findViewById(R.id.mBtnMulti)
        mDiv = findViewById(R.id.mBtnDiv)
        // set on Click listeners to all the buttons.
        mAdd.setOnClickListener {
            //receive the first and second number to compute
            var firstNumber=mFNum.text.toString().trim()
            var secondNumber=mSNum.text.toString().trim()
            if (firstNumber.isEmpty()|| secondNumber.isEmpty()){
                mAnswer.text="Please enter valid numbers"
            }else{
                //Proceed to compute the values
                var jibu = firstNumber.toDouble()+ secondNumber.toDouble()
                mAnswer.text= jibu.toString()
            }
        }
        mSub.setOnClickListener {
//receive the first and second number to compute
            var firstNumber=mFNum.text.toString().trim()
            var secondNumber=mSNum.text.toString().trim()
            if (firstNumber.isEmpty()|| secondNumber.isEmpty()){
                mAnswer.text="Please enter valid numbers"
            }else{
                //Proceed to compute the values
                var jibu = firstNumber.toDouble()- secondNumber.toDouble()
                mAnswer.text= jibu.toString()
            }
        }
        mMulti.setOnClickListener {
//receive the first and second number to compute
            var firstNumber=mFNum.text.toString().trim()
            var secondNumber=mSNum.text.toString().trim()
            if (firstNumber.isEmpty()|| secondNumber.isEmpty()){
                mAnswer.text="Please enter valid numbers"
            }else{
                //Proceed to compute the values
                var jibu = firstNumber.toDouble()* secondNumber.toDouble()
                mAnswer.text= jibu.toString()
            }
        }
        mDiv.setOnClickListener {
//receive the first and second number to compute
            var firstNumber=mFNum.text.toString().trim()
            var secondNumber=mSNum.text.toString().trim()
            if (firstNumber.isEmpty()|| secondNumber.isEmpty()){
                mAnswer.text="Please enter valid numbers"
            }else{
                //Proceed to compute the values
                var jibu = firstNumber.toDouble()/ secondNumber.toDouble()
                mAnswer.text= jibu.toString()
            }
        }
    }
}