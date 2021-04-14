package src;

public class GCD {

    public static void main(String[] args) {
        int result = compute(300000, 78);
        System.out.println(result);
    }

    public static int compute(int x, int y) {

        int smallest = x < y ? x : y; // if (x>y) { biggest = x; } else { biggest = y;}

        int result = 1;
        for (int i = 1; i <= smallest; i++) {
            if (x % i == 0 && y % i == 0) {result = i;}
        }
        return result;
    }
}