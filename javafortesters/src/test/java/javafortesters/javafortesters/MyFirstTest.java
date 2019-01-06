package javafortesters.javafortesters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo () {
     int answer = 2-2;
     assertEquals("2+2=4",0, answer);
    }

}
