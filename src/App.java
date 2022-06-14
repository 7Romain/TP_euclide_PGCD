import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        int num1 = Integer.valueOf(JOptionPane.showInputDialog(null, "Entrez un chiffre entier supérieur à zéro."));
        int num2 = Integer
                .valueOf(JOptionPane.showInputDialog(null, "Entrez un autre chiffre entier supérieur à zéro."));
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
        }
        if (reste == 0) {
            System.out.println(String.format(
                    "Le Plus Grand Commun Diviseur de %s et de %s calculé avec la méthode d'Euclide est : %s", num1,
                    num2, max));

        }

    }
}
