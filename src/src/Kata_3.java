package src;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 14/04/2021
 */

public class Kata_3 {

    public static void main(String[] args) {

        int tal = 30;

        int gcd = 1;

        for (int i = 2; i < tal; i++) {

            if (tal % i == 0) { gcd = i;
                System.out.println("Det nye GCD er " + i);
            }

        }

    }
}
