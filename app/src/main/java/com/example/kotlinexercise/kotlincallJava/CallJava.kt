package com.example.kotlinexercise.kotlincallJava

class CallJava {
    /**
     * 调用 java List
     */
    fun demo(): List<Int> {
        val list = ArrayList<Int>()
        for (item in list) {
            list.add(item)
        }
        return list
    }

    /**
     * 调用 java 属性
     */
    fun demo2(){
        //调用 属性
        print("\n"+Car().car1)
        print("\n"+Car().car2)
        print("\n"+Car().car3)
        print("\n"+Car().isCar4)
        print("\n"+Car.car5)
    }
    /**
     * 调用 java 方法
     */
    fun  demo3(){

        // void 方法
        Car().get1()
        //有返回值
        val va = Car().Lists()
        // 静态方法
        Car.get2()

        Car().get3("")

    }
    /**
     * kotlin 中作为关键字  在java用作 标识符
     */
    fun  demo4(){

        print("\n"+Car().`is`())
    }

    /**
     * 调用 java 方法  空安全类型
     */
    fun  demo5(){

        //允许编译，没有问题
        var nullable: MutableList<String> ?  =  Car().Lists()
        //允许编译，运行时可能失败
        var notNull: MutableList<String>  =  Car().Lists()
    }

    /**
     * 数据传递
     */
    fun  demo6(){
        // 传递数组
        val array = intArrayOf(0, 1, 2, 3)
        Car().removeIndices(array)

        //传递 可变参数 加一个 * 号，展开操作符
        Car().removeIndicesVarArg(*array)


        // 传递 集合
        var lists = ArrayList<Int>()
        lists.add(1)
        lists.add(1)
        lists.add(1)
        lists.add(1)
        Car().removeIndices(lists)
    }

    /**
     * 对象调用
     */
    fun demo7(){
       val  v = Car().get4() as java.lang.Object
       v.wait()

       val vs = Car.get5()  as Car
       vs.get4()

       val vss = Car.get5()
       (vss as Car).get4()

    }

}
