package com.kata.kata.domain;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class KeywordTest {
    
    @Test
    void test() {
        assertDoesNotThrow(() -> new Keyword("keyword"));
    }
}
