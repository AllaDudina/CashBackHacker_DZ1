package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldServiceIfAmountBelowBoundary() {

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldServiceIfAmountEqualBoundary() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
}

