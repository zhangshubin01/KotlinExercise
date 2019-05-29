package com.example.kotlinexercise.oodm

/**
 * Kotlin和Java一样，不支持同时继承多个父类，也就是说继承只能存在一个父类。但是一个类可以同时实现多个接口。

Kotlin的接口和Java只能有抽象方法不同，Kotlin的接口可以有抽象的方法和实现的方法：

接口没有构造函数,接口的实现和继承一样使用冒号: 实现多个接口用，逗号隔开：
 */
interface Eat {

     fun color() {

        print("这是接口")
    }

}