package de.neuefische;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean pw_valid = false;

        while(!pw_valid){
            System.out.println("Please enter your password and press ENTER:");
            String pw = scanner.nextLine();
            pw_valid = checkPW(pw);
        }
        System.out.println("The chosen password is valid.");


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

    public static boolean checkPW(String pw){
        boolean valid_length = lengthPW(pw);
        boolean valid_int = containsInt(pw);

        if (valid_length && valid_int){
            return true;
        }
        return false;

    }
}