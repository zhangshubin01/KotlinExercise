package com.example.kotlinexercise.basetype;

/**
 * 基础类型  练习
 * @author
 * @date
 */
object BaseTypeEXercise {
    val  c : Long = 4334L
    val a :Double = 123.5e10
    val f: Float = 123.4f
    val dss = 100_00_00

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010


    fun  gg(){
        val a: Int = 10000
        println(a === a) // 输出“true”
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA === anotherBoxedA) // ！！！输出“false”！！！
    }


    fun ggs(){
        val a: Int = 10000
        println(a == a) // 输出“true”
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA == anotherBoxedA) // 输出“true”
    }


}
