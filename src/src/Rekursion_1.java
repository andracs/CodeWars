/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 19/04/2021
 */
package src;

public class Rekursion_1 {

    public static void main(String[] args) {
        selvsving(1);
    }

    private static void selvsving(int x) {
        if (x==101) {return;} // Base case stop case
        System.out.println("Er i selvsving" + x);
        selvsving(x++);
    }
}
