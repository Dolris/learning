package com.codespace.task12;

public class Runner {
    public void run() {
        MyPhoneBook mpb = new MyPhoneBook();
        mpb.addPhoneNumber("Телефон Мобіл Сотович", "+38012365214");
        mpb.addPhoneNumber("Мобіл Телефон Сотович", "+38012365215");
        mpb.addPhoneNumber("Сото Телефон Мобілович ", "+38012365216");
        mpb.addPhoneNumber("Сото Мобіл Телефонович", "+38012365217");
        mpb.addPhoneNumber("Мобіл Сото Телефонович", "+38012365218");
        mpb.addPhoneNumber("Телефон Мобіл Сотович", "+38012365219");
        mpb.addPhoneNumber("Мобіл Телефон Сотович", "+38012365220");
        mpb.addPhoneNumber("Сото Телефон Мобілович ", "+38012365221");
        mpb.addPhoneNumber("Сото Мобіл Телефонович", "+38012365222");
        mpb.addPhoneNumber("Мобіл Сото Телефонович", "+38012365223");
        mpb.printPhoneBook();
        System.out.println("====================");
        mpb.sortByName();
        System.out.println("====================");
        mpb.sortByPhone();
    }
}
