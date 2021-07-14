package com.alevel;
// Конкретные декораторы добавляют что-то своё к базовому
// поведению обёрнутого компонента.
public class ClockfaceDecorator extends BaseDecorator{
    String clockFace;
    public ClockfaceDecorator(ClockInterface component, String clockFace){
        super(component);
        this.clockFace=clockFace;
    }

    @Override
    public void clockDescription() {
        component.clockDescription();
       System.out.println("Clocks have "+clockFace+ " clockface. ");

    }

}
