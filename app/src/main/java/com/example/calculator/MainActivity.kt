package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add(view: View) {
        val firstNum = et_firstnum.editableText.toString().toInt()
        val secondNum = et_secondnum.editableText.toString().toInt()
        val plus = firstNum + secondNum
        answer.text = "Answer is = $plus"
    }
    fun subtract(view: View) {
        val firstNum = et_firstnum.editableText.toString().toInt()
        val secondNum = et_secondnum.editableText.toString().toInt()
        val subtract = firstNum - secondNum
        answer.text = "Answer is = $subtract"
    }
    fun multiply(view: View) {
        val firstNum = et_firstnum.editableText.toString().toInt()
        val secondNum = et_secondnum.editableText.toString().toInt()
        val multiply = firstNum * secondNum
        answer.text = "Answer is = $multiply"
    }
    fun div(view: View) {
        val firstNum = et_firstnum.editableText.toString().toInt()
        val secondNum = et_secondnum.editableText.toString().toInt()
        val div = firstNum + secondNum
        answer.text = "Answer is = $div"
    }
}