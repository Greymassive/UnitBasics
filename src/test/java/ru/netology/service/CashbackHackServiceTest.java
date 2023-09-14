package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;


public class CashbackHackServiceTest {
    CashbackHackService ch = new CashbackHackService();

   @Test
   public void ifRemainLessThanBoundary() {
       int amount = 800;

       int actual = ch.remain(amount);
       int expected = 200;

       Assert.assertEquals(actual,expected);
    }

    @Test
    public void ifRemainEqualToBoundary() {
        int amount = 1000;

        int actual = ch.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ifRemainMoreThanBoundary() {
        int amount = 1200;

        int actual = ch.remain(amount);
        int expected = 800;

        Assert.assertEquals(actual,expected);
    }

}
