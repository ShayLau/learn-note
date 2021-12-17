package com.decorate;

/**
 * <p>Description: </p>

 *
 * 
 * @version 0.0.1
 * @date 2020/5/8
 */
public class DecorateTest {
    public static void main(String[] args) {

        Component component = new ComponentImpl();
        //装饰组件
        ComponentDecorate componentDecorate=new ComponentDecorate(component);
        componentDecorate.say();

        ComponentDecorate1 componentDecorate1=new ComponentDecorate1(component);

        componentDecorate1.say();


    }
}
