/*
 * This program will print the numbers from 1 to 100.
 * For multiples of 3 print “Fizz” instead of the number.
 * For the multiples of five print “Buzz”.
 * For numbers which are multiples of both 3 and 5 print “FizzBuzz”.
 */

public class FizzBuzz {
    public static void main(String[] args){
        final int MAX = 101;
        String[] message = new String[MAX];

        for (int i = 0; i < MAX; i++) {

            if ((i > 0) && ((i % 3) == 0)) {
                message[i] = "fizz";
                if ((i % 5) == 0)
                    message[i] = "fizzbuzz";
            }
            else if ((i > 0) && ((i % 5) == 0))
                message[i] = "buzz";
            else
                message[i] = Integer.toString(i);
        }

        // only print from 1 to 100
        for (int i = 1; i < MAX; i++)
            System.out.println(message[i]);
    }
}
