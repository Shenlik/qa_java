package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        when(feline.getKittens()).thenReturn(22);

        var lion = new Lion("Самец", feline);

        assertEquals(22, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        when(feline.getFood(anyString())).thenReturn((List.of("Омлет", "Чай")));

        var lion = new Lion("Самец", feline);

        assertEquals((List.of("Омлет", "Чай")), lion.getFood());
    }
}