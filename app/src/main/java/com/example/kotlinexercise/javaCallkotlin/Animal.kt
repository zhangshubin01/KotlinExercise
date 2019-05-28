package com.example.kotlinexercise.javaCallkotlin

object Animal {
    @JvmField
    var car1: String? = null

    private var car2: Int = 0

    private var car3: Double = 0.toDouble()

    private var iscar4: Boolean = false

   const val car5 = "car5"

    fun getCar1(): String? {
        return car1
    }

    fun setCar1(car1: String) {
        this.car1 = car1
    }

    fun getCar2(): Int {
        return car2
    }

    fun setCar2(car2: Int) {
        this.car2 = car2
    }

    fun getCar3(): Double {
        return car3
    }

    fun setCar3(car3: Double) {
        this.car3 = car3
    }

    fun isCar4(): Boolean {
        return iscar4
    }

    fun setIsCar1(car4: Boolean) {
        this.iscar4 = car4
    }

    fun `is`(): String {

        return "111111111"
    }

    fun Lists(): List<String>? {

        return null
    }
}