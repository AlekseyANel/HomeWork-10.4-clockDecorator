package com.alevel;
// Родитель всех декораторов содержит код обёртывания.
abstract class BaseDecorator implements ClockInterface {
    protected ClockInterface component;
    //protected String color;
    //String clockFace;
    public BaseDecorator(ClockInterface component/*, String color*/){
        this.component=component;
        //this.color=color;
    }


    @Override
    public void clockDescription() {
    component.clockDescription();
    }


}
