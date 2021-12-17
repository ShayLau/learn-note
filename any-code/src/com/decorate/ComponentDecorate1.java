package com.decorate;

/**
 * <p>Description: </p>

 *
 * 
 * @version 0.0.1
 * @date 2020/5/8
 */
public class ComponentDecorate1 extends ComponentDecorate {


    public ComponentDecorate1(Component component) {
        super(component);
    }

    @Override
    public void say() {
        super.say();
        this.sayHelloWorld();
    }

    private void sayHelloWorld() {
        System.out.println("Hello World");
    }
}
