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
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};

        for (int i = 0; i < numbers.length; i++){

            if (pw.contains(numbers[i])){
                valid = true;
                break;
            }

        }

        return valid;
    }
}