package src;

public class GCD {

    public static void main(String[] args) {
        int result = computeRecursive(1112, 695);
        System.out.println(result);
    }

    public static int compute(int x, int y) {

        int smallest = x < y ? x : y; // if (x>y) { biggest = x; } else { biggest = y;}

        int result = 1;
        for (int i = 1; i <= smallest; i++) {
            if (x % i == 0 && y % i == 0) {
                result = i;
            }
        }
        return result;
    }

    public static int computeRecursive(int x, int y) {
        // base case
        System.out.println(x + " - " + y);
        if (x % y == 0) { return y; } else {return computeRecursive(y, x % y);}
    }

}