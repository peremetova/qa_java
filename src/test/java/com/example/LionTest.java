package com.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


@RunWith(Parameterized.class)
public class LionTest extends TestCase {

    private String sex;
    private boolean hasMane;

    @Mock
    Feline feline;

    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Пол льва {0}")
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood(Mockito.anyString());
    }
}