public class Kata_2
{

    public static void main(String[] args) {

        int[] x = {1, -2, 3, 4, 5, -6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        countPositivesSumNegatives(x);
    }

    public static int[] countPositivesSumNegatives(int[] input)
    {
        int[] resultat = new int[2];
        // resultat[0] resultat[1]
        int a = 0; // antallet af positive
        int b = 0; // summen af b

        for (int i=0; i<input.length; i++ ) {
            if (input[i]>0) {
                a++;
                System.out.println(input[i] + " er større end 0, og det er nummer " + a);
            }

            if (input[i]<0) {
                b = b + input[i];
                System.out.println(input[i] + " er mindre end 0, og summen er " + b);
            }
        }

        resultat[0] = a;
        resultat[1] = b;
        return resultat; // [antallet af positive, summen af de negative]
    }
}