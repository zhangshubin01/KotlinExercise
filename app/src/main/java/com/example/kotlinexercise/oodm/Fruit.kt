package com.example.kotlinexercise.oodm

/**
 * 在Kotlin中，所有的类会默认继承Any这个父类，
 * 但Any并不完全等同于java中的Object类，因为它只有equals(),hashCode()和toString()这三个方法。
 * 当我们想定义一个父类时，需要使用open关键字
 *
 *
 * kotlin不同于java 多个构造函数是平级的， 而kotlin是分为主构造函数和二级构造函数
   主构造函数包含在类头中 需要init方法实现才行 而二级构造函数在函数体内实现操作
   通过constructor关键字在类头中实现主构造函数 主构造函数可以直接声明属性
 *
 *
 */
abstract class Fruit (age: Int){
    var age = age
    var color:String = ""

    /**
     *  二级构造函数必须要使用constructor
     *
     *  包含二级构造函数 和 主构造函数 注意 二级构造函数不能使用var声明属性
        二级构造函数 通过 this 关键字带你主构造函数
     */
    constructor(age:Int,color:String):this(age){
        this.age = age
        this.color = color
    }



    /**
     * Kotlin中的重写和java中也有所不同，因为Kotlin提倡所有的操作都是明确的，因此需要将希望重写的方法设为open
     */
    open fun color() {

        print("这是父类")
    }

}