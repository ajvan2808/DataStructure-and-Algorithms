package common_coding_question;

/*
* Write a program that print 1 to 10
* But for multiples of 3 print Fizz instead of numbers
* And for multiples of 5 print Buzz
* Multiples of the two print FizzBuzz
*/

public class FizzBuzz {
    public void printFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {System.out.println(i);}
        }
    }
}
