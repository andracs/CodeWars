package src;

import java.util.Arrays;

public class Kata_1 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(between(1,4)));
    System.out.println(Arrays.toString(between(-2,2)));
  }

  public static int[] between(int a, int b) {

    int[] x = new int[b-a+1];
    // Løkken løber fra a til b 
    int counter = 0; 
    for (int i = a; i <= b; i++) {
      x[counter] = i;
      counter++;
    }
    
    return x;
  }
}