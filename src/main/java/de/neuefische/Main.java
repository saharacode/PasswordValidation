package de.neuefische;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean lengthPW(String pw){
        boolean valid = false;

        if (pw.length()>10){
            valid = true;
        }
        return valid;
    }

    public static boolean containsInt(String pw){
        boolean valid = false;
        return valid;
    }
}