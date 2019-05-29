package com.example.kotlinexercise.oodm

/**
 * 在子类中使用冒号“：”进行继承
 */
open class Banana(age :Int) :Fruit(age), Eat {

    /**
     * 通过override标记实现重写
     * override重写的函数也是open的，
     * 如果希望它不被重写（前提是这个类可以被继承），可以在前面增加final标签
     * 子类 通过override关键字重写父类的方法 如果不使用override 则无法使用run 方法
     */
    override fun color() {
         //super.color()
        // 当一个类同时继承且实现了多个接口时，
        // 如果重写的方法在父类和接口中都有定义，
        // 那么可以通过super<>的方式进行继承
//        super<Fruit>.color();

        super<Eat>.color();
    }




}