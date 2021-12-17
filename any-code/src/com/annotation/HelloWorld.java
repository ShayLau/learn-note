package com.annotation;

import java.lang.annotation.Annotation;

public class HelloWorld {

    @Demo(num = 10,str = "🔨")
    public void say(){
        System.out.println("Hello World");
    }

}

class run{

    public static void main(String[] args) {

        try{
            Annotation[] annotation = Class.forName("com.annotation.HelloWorld").getMethod("say").getAnnotations();
            for (Annotation a: annotation) {
                if(a instanceof Demo){
                    //System.out.println("Demo注解的默认值："+((Demo) a).num());
                    System.out.println("Demo 是个"+((Demo) a).str());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}