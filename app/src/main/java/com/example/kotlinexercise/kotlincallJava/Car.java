package com.example.kotlinexercise.kotlincallJava;

import android.util.Printer;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Car {


    private String car1;

    private int car2;

    private double car3;

    private boolean iscar4;

    public static String car5 = "car5";


    public String getCar1() {
        return car1;
    }

    private String Car;


    public void setCar1(String car1) {
        this.car1 = car1;
    }

    public int getCar2() {
        return car2;
    }

    public void setCar2(int car2) {
        this.car2 = car2;
    }

    public double getCar3() {
        return car3;
    }

    public void setCar3(double car3) {
        this.car3 = car3;
    }

    public boolean isCar4() {
        return iscar4 = true;
    }

    public void setIsCar1(boolean car4) {
        this.iscar4 = car4;
    }

    public String is() {

        return "111111111";
    }

    public List<String> Lists() {

        return null;
    }


    public void get1() {
        System.out.println("这是void 方法");
    }

    public static void get2() {
        System.out.println("这是static 方法");
    }

    public void get3(@NotNull String str) {

    }

    public void get4(int[] indices) {
        for (int in : indices) {
            System.out.println("传递数组" + in);
        }

    }

    public void get5(List<Integer> indices) {
        for (int in : indices) {
            System.out.println("传递数组" + in);
        }

    }

    public void get6(int... indices) {

        for (int in : indices) {
            System.out.println("传递数组" + in);
        }
    }

    public Object get7() {
        return new Object();
    }

    public static Object get8() {
        return new Car();
    }


    public void get9() {

    }
}
