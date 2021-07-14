package com.alevel;

// Один из конкретных компонентов реализует базовую функциональность.
public class KonkretniyClockComponent implements ClockInterface {

String brand;
public KonkretniyClockComponent(String brand){
    this.brand =brand;
}
    @Override
    public void clockDescription() {
        System.out.println("В 1922-м году немец Франц Хермле основал clock-компанию "+brand+".");
    }


}
