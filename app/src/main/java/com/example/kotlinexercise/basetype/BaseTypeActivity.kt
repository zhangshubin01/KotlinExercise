package com.example.kotlinexercise.basetype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinexercise.R

class BaseTypeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_type)
    }






    companion object {

        fun  gg(){
            val a: Int = 10000
            println(a === a) // 输出“true”
            val boxedA: Int? = a
            val anotherBoxedA: Int? = a
            println(boxedA === anotherBoxedA) // ！！！输出“false”！！！
        }
    }

}
