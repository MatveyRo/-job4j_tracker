package ru.job4j.polymorphism;

public class Bus implements Transport {

    public int prise;
    public int fuel;

    public Bus(int prise, int fuel) {
        this.prise = prise;
        this.fuel = fuel;
    }

    @Override
    public void drive() {

    }

    @Override
    public void passengers() {
        System.out.println("Число пассажиров: ");
    }

    @Override
    public int fillUp(int price) {
        System.out.println("Колличество топлива: " + fuel);
        System.out.println("Цена: " + prise);
        return 0;
    }
}
