package com.gulei.hellokotlin.kbean

/**
 * Created by gl152 on 2019/2/1.
 */
class Person {
    //val只读属性有一个get
    val name: String = ""
    //var可写属性有get和set
    var isMarried: Boolean = false
        get() {//可以自定义get和set
            return false
        }


}