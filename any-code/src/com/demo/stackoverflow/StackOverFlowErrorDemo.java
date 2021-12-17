package com.demo.stackoverflow;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归演示栈溢出分析Java内存模型
 *
 * 
 */
public class StackOverFlowErrorDemo {

    public static void main(String[] args) {

        Calculate calculate = new Calculate();

        int result = calculate.add(1);

        System.out.println(result);

        Object o;
        List list=new ArrayList();

    }

}

/**
 * 计算内部类
 *
 * 
 */
class Calculate {

    /**
     * 递归新增方法
     * 为了方便测试栈溢出的情况，请输入一个大于0的{@code num}参数
     * 
     */
    public int add(int num) {
        if (num == -1) {
            return num;
        }
        num += num;
        add(num);
        return -1;
    }

}