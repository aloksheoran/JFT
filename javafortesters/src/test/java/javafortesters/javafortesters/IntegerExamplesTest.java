package javafortesters.javafortesters;

import org.junit.Assert;
import org.junit.Test;

public class IntegerExamplesTest {

    @Test
   public void integerExploration () {

        Integer four = new Integer(4);
        Assert.assertEquals("int value returns int 4",4,four.intValue());

    }

    @Test
    public void hexExplore() {

        Integer s = new Integer(11);
        Assert.assertEquals("11 becomes b", "b",s.toHexString(11));
    }

}
