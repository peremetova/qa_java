package com.example;

import junit.framework.TestCase;

import java.util.List;

public class FelineTest extends TestCase {

    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(1 , feline.getKittens());
    }

    public void testGetKittensWithParam() {
        Feline feline = new Feline();
        assertEquals(5 , feline.getKittens(5));
    }
}