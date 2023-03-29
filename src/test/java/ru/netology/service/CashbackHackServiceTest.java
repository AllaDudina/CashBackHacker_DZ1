package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldServiceIfAmountBelowBoundary() {

        int actual = service.remain(800);
        int expected = 200;

        assertEquals(actual, expected);

    }
    @Test
    public void shouldServiceIfAmountEqualBoundary() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}