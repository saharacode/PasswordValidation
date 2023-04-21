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

    @Test
    void containsUpperCase_True() {
        // given
        String pw = "Pw";
        // when
        boolean actual = Main.containsUpperCase(pw);
        // then
        assertTrue(actual);
    }

    @Test
    void containsUpperCase_False() {
        // given
        String pw = "pw";
        // when
        boolean actual = Main.containsUpperCase(pw);
        // then
        assertFalse(actual);
    }

    @Test
    void containsLowerCase_True() {
        // given
        String pw = "Pw";
        // when
        boolean actual = Main.containsLowerCase(pw);
        // then
        assertTrue(actual);
    }

    @Test
    void containsLowerCase_False() {
        // given
        String pw = "PW";
        // when
        boolean actual = Main.containsLowerCase(pw);
        // then
        assertFalse(actual);
    }

    @Test
    void containsBadWords_True() {
        // given
        String pw = "Passwort123456";
        // when
        boolean actual = Main.containsBadWords(pw);
        // then
        assertTrue(actual);
    }

    @Test
    void containsBadWords_False() {
        // given
        String pw = "sdfghsfhdfTR4636364643";
        // when
        boolean actual = Main.containsBadWords(pw);
        // then
        assertFalse(actual);
    }

    @Test
    void checkPW_True() {
        // given
        String pw = "Jfde45fgr5467zt";
        // when
        boolean actual = Main.checkPW(pw);
        // then
        assertTrue(actual);
    }

    @Test
    void checkPW_False() {
        // given
        String pw = "johann123456789";
        // when
        boolean actual = Main.checkPW(pw);
        // then
        assertFalse(actual);
    }


}