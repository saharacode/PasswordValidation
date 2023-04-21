package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void lengthPW_greater10() {
        // given
        String pw = "passwordwithmorethan10letters";
        // when
        boolean actual = Main.lengthPW(pw);
        // then
        assertTrue(actual);
    }
}