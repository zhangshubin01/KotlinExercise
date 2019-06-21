/**
 *
 */
@file:JvmName("DemoUtils")
@file:JvmMultifileClass
package com.example.kotlinexercise.javaCallkotlin

/**
 * 包级函数  在kotlin直接定义的顶级函数
 *
 * 都会编译为 静态方法 静态变量
 */

/**
 * const val 可见性为public final static，可以直接访问
 */
const val MAX = 239
fun bar(){
    println("这只是一个bar方法")
}