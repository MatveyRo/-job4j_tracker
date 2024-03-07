package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
public class StartUI {

        public static void main(String[] args) {
        Item date = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = formatter.format(date.getCreated());
        System.out.println(currentDateTimeFormat);
    }
}
