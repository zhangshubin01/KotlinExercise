package com.example.kotlinexercise.oodm

/**
 * 主构造器主要作用是为初始化块定义参数
 * 因此主构造器更像初始化的一部分
 * 也可以说 初始化块是主构造器的执行体
 *
 * 没有提供主构造器 系统会为这个类提供一个无参数的主构造器
 *
 * 如果提供了 自定义的构造器  系统就不会再提供默认的构造器
 */
open class Car(name: String) {
    var name: String

    /**
     * 主构造器 更像java的初始化块
     *  java 的初始化块不能不能传入参数
     *  kotlin通过主构造器的设计 允许为初始化块传入参数
     *
     *  初始化块 可以使用 主构造器定义的参数
     *  可以执行任何可执行语句
     *
     *
     */
    init {
         this.name = name
        var a = 6
        if(a >4){
            print("初始化块， 局部变量a的值大于4\n")
        }
        print("第一个 初始化块\n")
    }

    init {
        print("第二个 初始化块\n")
    }

    var age:String? = ""

    /**
     * 次构造器 要先调用 主构造器（执行初始化块中的代码）
     *
     * 如果两个构造器中有相同的初始化代码，可以把他们放在初始化中定义
     * 如果这些初始化代码需要参数，则可以放在主构造器中定义。通过把多个构造器中的相同代码提取到初始化块中定义，

     * 能更好的提高初始化代码的复用性，提高整个应用的可维护性
     *
     *
     * kotlin 专业术语：所有的次构造器都要委托调用初始化块
     */
    constructor(name: String,age:String):this(name){
        this.name = name
        this.age = age
    }

    /**
     * 委托了上边的构造器 间接委托了主构造器
     */
    constructor(name: String,age:String,age1:String):this(name,age){

    }


    /**
     * 因为 非抽象方法 默认 final 修饰
     *
     *
     * 如果要取消 kotlin 自动添加的 final 修饰 可用open
     *
     * open 修饰符 与 final 修饰符 是反义词
     *
     */
     fun getList() {

     }

    open fun getLists() {

    }

}