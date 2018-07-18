package com.Catalin;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if(value ==1){
//            System.out.println("Value was 1");
//        } else if (value ==2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
        int switchValue = 1;
        /**Switch statements are comprised of the switch keyword and the value that we want to test
         * (variable name for example)
         */
        switch(switchValue){
            case 1:
                /** this is the equivalent of: if(switchValue == 1).
                 * */
                System.out.println("Value was 1");
                break;
            /**Break terminates the enclosing switch statement and control continues at the line after the
             * switch block.
             */
            case 2:
                System.out.println("Value was 2");
                break;
            /** You can use multiple cases for one variable. The case keyword is followed by the value
             * that you want to assign to test.
             */
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            /** There are situations when you might need to test multiple values, 20, 30 values or more.
             * For these scenarios you can use the above shortcut. This will run the code if the value is
             * equal to any of the 3 cases.
             */
            default:
                /** Default replaces the last "else" and means that in any other case that is not being
                 * covered above, run this code. So there is a default code that will be processed if no
                 * other cases are applicable.
                 */
                System.out.println("Was not 1 or 2");
                break;
            /** Java will process each case starting with the first one and stop running the rest of
             * the cases in the switch statement block if the case is valid and the break keyword was used.
             * If the break keyword is not used, Java will run through the rest of the cases even if it
             * encounters valid or invalid cases.
             * For example if the switchValue is 1, and you have 2 cases for values 1 and 2. If you use
             * the break keyword after a case, Java will stop at the first case, because the value is indeed
             * 1 but if the break is missing, Java will process and print the first case and will move on to
             * the next one, processing and printing case 2 as well even if it is invalid.
             */
            /** Both the if and switch statements are similar and can be used in similar conditions. The main
             * difference is that the if statement is a bit more flexible. For example an if statement can
             * include multiple variables with multiple values, if(value ==1) else if(cat == true) and so on,
             * combining different variables and data types.
             * On the other hand, the switch statement can only verify different values for one variable.
             */
            /** The last break, before the end of the code block is not actually necessary since the code will
             * automatically end, because the code block ends, but it is a good idea to user it anyway so that
             * the code is easier to understand.
             */
            /** The switch statement can deal with 4 primitive data types: byte, short, char, int and
             * String(starting with Java 7).
             */
        }
        String month = "january";
        /** In this case, checking for "january" with a lower case, the result will be the default, because
         * the cases check for values with the first letter in uppercase as stated below.
         * You would not want to create cases for each possible scenario, for example case "jAnuary", JanyaRy
         * etc. so you will be using a method that is part of the String class: .toLowerCase(). This method
         * converts the entire string to lower case, meaning that no matter what uppercase letters you would
         * use, Java will convert the entire String to lower case: January, JANUARY, jAnuary, will all be
         * converted to january.
         * This means that all of the cases must be changed to check for lower case String values as well,
         * instead of checking for Strings with different upper and lower case letters.
         * There is also a String method that converts strings to upper case, toUpperCase().
         */
//        switch(month.toLowerCase()){
        switch(month){
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
        }

        //Challenge
        //Create a new switch statement using char instead of int
        //Create a new char variable
        //Create a switch statement testing for A,B,C,D or E
        //Display a message if any of these are found and then break
        //Add a default which displays a message saying not found

        char alphabetical = 'A';
        switch(alphabetical){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The char value was either A, B, C, D or E");
                break;
                default:
                    System.out.println("Not found");
                    break;
        }
    }
}
