package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void catSpeakTest() {
        Cat cat = new Cat("Kitty");
        String actual = cat.speak();
        String expected = "Meow";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameCatTest() {
        Cat kitty = new Cat("Meowth");
        String actual = kitty.getName();
        String expected = "Meowth";
        Assert.assertEquals(expected, actual);
    }
}