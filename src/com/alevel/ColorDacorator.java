package com.alevel;

public class ColorDacorator extends BaseDecorator{
    String color;
       public ColorDacorator(ClockInterface component, String color){
           super(component);
           this.color=color;

    }

    @Override
    public void clockDescription() {
        component.clockDescription();
        System.out.println("Clocks have "+color+" background color. ");

    }

}
