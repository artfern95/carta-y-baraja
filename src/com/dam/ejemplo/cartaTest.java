package com.dam.ejemplo;

import org.junit.Assert;
import org.junit.Test;

public class cartaTest {

    @Test
    public void testCarta(){

        carta cartatest = new carta(12);

        System.out.println(cartatest.toString());

        Assert.assertEquals("copas",cartatest.getValorPalo());
    }
}