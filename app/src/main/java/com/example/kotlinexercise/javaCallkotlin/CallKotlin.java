package com.example.kotlinexercise.javaCallkotlin;

import kotlin.jvm.internal.Intrinsics;

import java.io.IOException;

/**
 * 调用 kotlin
 */
public class CallKotlin {
    /**
     * 调用属性
     */
    public final void demo1() {
        new Animal().getCar1();
        String str = new Animal().car1;

        int i2 = DemoUtils.MAX;

        int i = Animal.VERSION;

//        Dome3.car5 = new Animal();

        new Animal().is();
//      Animal.car1;
    }

    /**
     * 调用包级函数
     */
    public final void demo2() {
        //
//          new DomeKt().bar();
        DemoUtils.bars();
        DemoUtils.bar();


    }

    /**
     * 调用静态方法
     */
    public final void demo3() {
        //
//          new DomeKt().bar();
        Animal.callStatic();

        Dome3.callStatic();


    }

    /**
     * 调用重载方法
     */
    public final void demo4() {
        //
//          new DomeKt().bar();

//        new DemoUtils().bar();

        new Animal().gitList("");
        new Animal().gitList("", 0);
        new Animal().gitList("", 0, "");


//        Dome3.callStatic();


    }

    /**
     * 异常
     */
    public final void demo5() {

        try {
            new Animal().demo();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
