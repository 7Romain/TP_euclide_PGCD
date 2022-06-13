import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        int num1 = 21;// Integer.valueOf(JOptionPane.showInputDialog(null, "Entrez un chiffre entier
                      // supérieur à zéro."));
        int num2 = 15; // Integer.valueOf(JOptionPane.showInputDialog(null, "Entrez un autre chiffre
                       // entier supérieur à zéro."));
        int max;
        int petit;
        int reste;

        do {
            if (num1 > num2) {
                petit = num2;
                max = num1;
            } else {
                max = num2;
                petit = num1;
            }

            reste = max % petit;
            petit = max;
            max = reste;
        } while (reste != 0 || reste != 1);

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
