

package com.example.kotlinexercise.javaCallkotlin

import java.io.IOException
import java.security.Provider

class Animal{
    /**
     * 如果需要在 Java 中将 Kotlin 属性作为字段暴露，
     * 那就使用 @JvmField 注解对其标注。
     * 该字段将具有与底层属性相同的可见性。
     * 如果一个属性有幕后字段（backing field）、
     * 非私有、没有 open /override 或者 const 修饰符并且不是被委托的属性，
     * 那么你可以用 @JvmField 注解该属性。
     *
     * 使用 @JvmField 标注这样的属性使其成为与属性本身具有相同可见性的静态字段。
     *
     * 相当于 Animal 类中的 public static final 字段
     */
    @JvmField
    var car1: String? = null

    private var car2: Int = 0

    private var car3: Double = 0.toDouble()

    private var iscar4: Boolean = false

    /**
     * （在类中以及在顶层）以 const 声明的属性在 Java 中会成为静态字段
     */
    companion object {
        const val VERSION = 9

        @JvmStatic fun callStatic() {}
    }

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

    /**
     * 如果希望向 Java 调用者暴露多个重载，可以使用 @JvmOverloads 注解
     * 该注解也适用于构造函数、静态方法等。它不能用于抽象方法，包括在接口中定义的方法。
     */
    @JvmOverloads fun gitList(label: String, lineWidth: Int = 1, color: String = "red") {  }

    /**
     * 因为 writeToFile() 没有声明 IOException，我们从 Java 编译器得到了一个报错消息。 为了解决这个问题，要在 Kotlin 中使用 @Throws 注解。
     */
    @Throws(IOException::class)
    fun demo() {
        /*...*/
        throw IOException()
    }
}