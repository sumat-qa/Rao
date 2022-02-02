package com.test.even;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class StringBalanceTest {

    private StringBalance balance = new StringBalance();

    @Test
    @DisplayName("Validate is not null")
    void shouldNotBeNull() {
        String value = null;
        assertFalse(balance.isBalanced(value), "should not be null");
    }

    @Test
    @DisplayName("Check string is balanced")
    void shouldbalanceSimpleString() {
        String value = "ab(c)(d())";
        assertTrue(balance.isBalanced(value), "string is balanced");
    }

    @Test
    @DisplayName("String is not balanced")
    void shouldCompressCombinationString() {
        String value = "((x()())";
        assertFalse(balance.isBalanced(value), "string is not balanced");
    }

}