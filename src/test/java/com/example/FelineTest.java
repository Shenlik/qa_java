package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
            var felineNew = new Feline();

            assertEquals(List.of("Животные", "Птицы", "Рыба"), felineNew.eatMeat());
    }

    @Test
    public void getFamily() {
        var felineNew = new Feline();

        assertEquals("Кошачьи",felineNew.getFamily());
    }

    @Test
    public void getKittens() {
        var felineNew = new Feline();

        assertEquals(1,felineNew.getKittens());
    }

    @Test
    public void testGetKittens() {
        var felineNew = new Feline();

        assertEquals(33,felineNew.getKittens(33));
    }
}