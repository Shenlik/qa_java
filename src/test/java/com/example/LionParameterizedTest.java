package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean expectedResult;

    private final List<String> correctSexList = List.of("Самец","Самка");

    public LionParameterizedTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object [][] getCorrectHasManeValue() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"jjj",false}
        };
    }
    @Test
    public void hasManeTest() throws Exception {
        if(correctSexList.contains(sex)){
            Lion lion = new Lion(sex, new Feline());
            boolean actualResult = lion.doesHaveMane();
            Assert.assertEquals("...", expectedResult, actualResult);
        }
    }


    @Test
    public void shouldBeException() throws Exception {

        if(correctSexList.contains(sex)){
            Lion lion = new Lion(sex, new Feline());
        }
        else {
            Throwable exception = assertThrows(Exception.class, () ->{
                Lion lion = new Lion(sex, new Feline());
            });
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }

    }


}