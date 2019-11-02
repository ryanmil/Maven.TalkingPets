package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void dogTest() {
        Dog dog = new Dog("Woofie");
        String actual = dog.speak();
        String expected = "Woof";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void nameDogTest() {
        Dog doggie = new Dog("Porkchop");
        String actual = doggie.getName();
        String expected = "Porkchop";
        Assert.assertEquals(expected, actual);
    }
}