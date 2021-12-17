package com.copy;

/**
 * 浅拷贝示例
 *
 * 
 */
public class DataCopy {

    /**
     * 基本数据类型-拷贝
     */
    public void baseDataTypeCopy() {

        int num1 = 10;
        int num2 = num1;

        System.out.println("num1 数据值:" + num1);
        System.out.println("num2 数据值:" + num2);

        System.out.println("修改num1的数据值，查看会不会影响到num2的数据值");

        num1++;

        System.out.println("num1最新数据值:" + num1);
        System.out.println("num2最新数据值:" + num2);
    }


    /**
     * 引用数据类型-引用拷贝
     */
    public void referenceDataTypeCopy() throws CloneNotSupportedException{

        //Student A
        Student stuA = new Student("小A", 18);
        //Student B
        Student stuB =stuA;

        System.out.println("通过copy的方式，初始化学生对象");

        System.out.println(stuA);
        System.out.println(stuB);

        stuA.setName("小C");
        stuA.setAge(28);

        System.out.println("修改StuA的信息，查看StuA和StuB的信息变化");

        System.out.println(stuA);
        System.out.println(stuB);
    }

    /**
     * 引用数据类型-浅拷贝
     */
    public void shallowCopy() throws CloneNotSupportedException{

        //Student A
        Student stuA = new Student("小A", 18);
        //Student B
        Student stuB = (Student) stuA.clone();

        System.out.println("通过copy的方式，初始化学生对象");

        System.out.println(stuA);
        System.out.println(stuB);

        stuA.setName("小C");
        stuA.setAge(28);

        System.out.println("修改StuA的信息，查看StuA和StuB的信息变化");

        System.out.println(stuA);
        System.out.println(stuB);
    }

    /**
     * 引用数据类型-深拷贝
     */
    public void deepCopy() throws CloneNotSupportedException{
        Commodity apple=new Commodity();
        apple.setCommodityName("Apple");

        Order appleOrder=new Order();
        appleOrder.setCommodity(apple);
        appleOrder.setOrderId(1);

        Order appleOrders=(Order)appleOrder.clone();

        System.out.println(appleOrder);
        System.out.println(appleOrders);

        apple.setCommodityName("HongFuShi Apple");

        System.out.println(appleOrder);
        System.out.println(appleOrders);


    }


}

class  DataCopyMain{

    public static void main(String[]args) throws CloneNotSupportedException{
        DataCopy copyDemo=new DataCopy();
        /**
         * 基本数据类型拷贝
         *
         * 运行结果：
         * num1 数据值:10
         * num2 数据值:10
         * 修改num1的数据值，查看会不会影响到num2的数据值
         * num1最新数据值:11
         * num2最新数据值:10
         */
        copyDemo.baseDataTypeCopy();

        /**
         * 引用数据类型-引用拷贝
         *
         * 运行结果：
         * 通过copy的方式，初始化学生对象
         * Student{name='小A', age=18}
         * Student{name='小A', age=18}
         * 修改StuA的信息，查看StuA和StuB的信息变化
         * Student{name='小C', age=28}
         * Student{name='小C', age=28}
         */
        copyDemo.referenceDataTypeCopy();

        /**
         * 引用数据类型-浅拷贝
         *
         * 运行结果：
         * 通过copy的方式，初始化学生对象
         * Student{name='小A', age=18}
         * Student{name='小A', age=18}
         * 修改StuA的信息，查看StuA和StuB的信息变化
         * Student{name='小C', age=28}
         * Student{name='小A', age=18}
         */
        copyDemo.shallowCopy();

        /**
         * 引用数据类型-深拷贝
         *
         * 运行结果：
         * Order{orderId=1, commodity=Commodity{commodityName='Apple'}}
         * Order{orderId=1, commodity=Commodity{commodityName='Apple'}}
         * Order{orderId=1, commodity=Commodity{commodityName='HongFuShi Apple'}}
         * Order{orderId=1, commodity=Commodity{commodityName='Apple'}}
         */
        copyDemo.deepCopy();
    }
}
