package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void lengthPW_greater10_True() {
        // given
        String pw = "passwordwithmorethan10letters";
        // when
        boolean actual = Main.lengthPW(pw);
        // then
        assertTrue(actual);
    }

    @Test
    void containsInt_True() {
        // given
        String pw = "pw1";
        // when
        boolean actual = Main.containsInt(pw);
        // then
        assertTrue(actual);
    }

    @Test
    void containsInt_False() {
        // given
        String pw = "pw";
        // when
        boolean actual = Main.containsInt(pw);
        // then
        assertFalse(actual);
    }


}