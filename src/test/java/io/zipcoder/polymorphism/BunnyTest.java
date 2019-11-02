package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BunnyTest {

    @Test
    public void speak() {
        Bunny bunny = new Bunny("Clover");
        String actual = bunny.speak();
        String expected = "Whats up doc?";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void nameBunnyTest(){
        Bunny bun = new Bunny("Hoover");
        String actual = bun.getName();
        String expected = "Hoover";
        Assert.assertEquals(expected,actual);


    }


}