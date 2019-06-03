package com.example.kotlinexercise.javaCallkotlin

object Dome3 {
    /**
     * 在命名对象或者伴生对象中的一个延迟初始化的属性具有与属性 setter 相同可见性的静态幕后字段。
     * 在 Animal 类中的 public static 非-final 字段
     */
    lateinit var car5 : Animal

    @JvmStatic fun callStatic() {}
}