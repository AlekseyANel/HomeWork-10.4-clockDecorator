package com.alevel;

public class Main {

    public static void main(String[] args) {
	ClockInterface clock = new ClockfaceDecorator(new ColorDacorator (new KonkretniyClockComponent("Hermle"), "red"), "Arabic");
	clock.clockDescription();

    }
}
