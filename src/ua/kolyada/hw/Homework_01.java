package ua.kolyada.hw;

public class Homework_01 {
    public static void main(String[] args) {
        String myFirstName = "Oleg";
        String myLastName = "Kolyada";
        int myFirstNameLength = myFirstName.length();
        int string, value;
        System.out.println("Your name is" + " " + myFirstName + " " + myLastName);
        if (myFirstNameLength > 7) {
            System.out.println("Your first name has more than 7 symbols");
        }
        else if (myFirstNameLength == 7) {
            System.out.println("Your first name has exactly 7 symbols");
        }
        else {
            System.out.println("Your first name has less than 7 symbols");
        }
        for (string = 0, value = 5; string <= 10; string ++, value+=2) {
            System.out.println("String number" +" " +string +" " +"value" +" " +value);
        }
    }
}