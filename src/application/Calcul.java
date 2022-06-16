package application;

public class Calcul {
    public int calcuerPGCD(int num1, int num2) {

        int max;
        int petit;
        int reste = 2;

        max = Math.max(num1, num2);
        petit = Math.min(num1, num2);
        while (reste != 0 && reste != 1) {

            reste = max % petit;
            max = petit;
            petit = reste;

        }

        if (reste == 1) {
            System.out.println(String.format(
                    "Le Plus Grand Commun Diviseur de %s et de %s calculé avec la méthode d'Euclide est : %s", num1,
                    num2, reste));
            return reste;

        }
        if (reste == 0) {
            System.out.println(String.format(
                    "Le Plus Grand Commun Diviseur de %s et de %s calculé avec la méthode d'Euclide est : %s", num1,
                    num2, max));

        }
        return max;

    }
}
