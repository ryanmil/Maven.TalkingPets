package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {
    @Test
    public void dogTest() {
        Dog dog = new Dog("Woofie");
        String actual =  dog.speak();
        String expected = "Woof";
        Assert.assertEquals(expected,actual);


    }

}
