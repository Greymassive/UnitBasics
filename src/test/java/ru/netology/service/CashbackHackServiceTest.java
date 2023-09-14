package ru.netology.service;
import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
    CashbackHackService ch = new CashbackHackService();

    @Test
    public void ifRemainLessThanBoundary() {
        int amount = 800;

        int expected = 200;
        int actual = ch.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifRemainEqualToBoundary() {
        int amount = 1000;

        int expected = 0;
        int actual = ch.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifRemainMoreThanBoundary() {
        int amount = 1500;

        int expected = 500;
        int actual = ch.remain(amount);

        Assert.assertEquals(expected, actual);
    }


}
