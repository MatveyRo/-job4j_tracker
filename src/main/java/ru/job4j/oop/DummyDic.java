package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String word = eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic data = new DummyDic();
        String eng = data.engToRus("code");
        System.out.println("Неизвестное слово. " + eng);
    }
}
