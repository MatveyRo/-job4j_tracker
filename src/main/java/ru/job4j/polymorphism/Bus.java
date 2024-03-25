package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {
    }

    @Override
    public int passengers() {
        return 0;
    }

    @Override
    public int fillUp(int price) {
        return 0;
    }
}
