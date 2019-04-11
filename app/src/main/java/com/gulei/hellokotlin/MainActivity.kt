package com.gulei.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import com.gulei.hellokotlin.kbean.Person

class MainActivity : AppCompatActivity() {
    internal lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv)
        Person()
        print("Hello,Kotlin!")
        //字符串拼接打印
        print("最大值打印返回值表达式为${max(3, 4)}")

        val maxValue = max(1, 2)
        print("最大值打印变量方法为$maxValue")

        print("表达式中可以添加双引号字符串打印为${if (max(1,2)>3) "条件成立" else "条件不成立"}")
    }

    fun print(msg: String) {
        Log.e("gulei", msg)
    }

    //带返回值的方法
    fun max(a: Int, b: Int): Int {
        return if (a > b) {
            a
        } else {
            b
        }
    }


}
