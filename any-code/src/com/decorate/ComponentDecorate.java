package com.decorate;

/**
 * <p>Description: </p>

 *
 * 
 * @version 0.0.1
 * @date 2020/5/8
 */
public class ComponentDecorate implements Component {

    private Component component;

    public ComponentDecorate(Component component) {
        this.component = component;
    }

    @Override
    public void say() {
        component.say();
    }
}
