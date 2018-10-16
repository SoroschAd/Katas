public class MainMethod {


    public static String fizzBuzz(int zahl) {

        String output = "";

        if (zahl % 3 == 0) {

            output += "Fizz";
        }
        if (zahl % 5 == 0) {

            output += "Buzz";

        }

        return output.isEmpty()? String.valueOf(zahl):output;

    }

    }

