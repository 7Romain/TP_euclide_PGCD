package fenetres;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import application.Calcul;

public class MaFenetre extends JFrame {
    int nb1int = 15;
    int nb2int = 21;

    String resultatCalcul = "Résultat";
    JButton btnCalculer = new JButton("Calculer");
    JTextField nb1 = new JTextField("nombre 1");
    JTextField nb2 = new JTextField("nombre2");
    JLabel pgcd = new JLabel(resultatCalcul);

    public void action() {

        int nb1input = Integer.valueOf(nb1.getText());
        int nb2input = Integer.valueOf(nb2.getText());
        Calcul calcul;
        calcul = new Calcul();
        resultatCalcul = String.valueOf(calcul.calcuerPGCD(nb1input, nb2input));

        pgcd.setText(String.format("Le PGCD entre %s et %s est : %s.", nb1input, nb2input, resultatCalcul));
    }

    public MaFenetre(String title) throws HeadlessException {

        super(title);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(270, 105);
        this.setLocationRelativeTo(null);
        JPanel contentePane = (JPanel) this.getContentPane();
        contentePane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        nb1.selectAll();
        contentePane.add(nb1);

        contentePane.add(nb2);

        btnCalculer.addActionListener((event) -> action());
        contentePane.add(btnCalculer);

        contentePane.add(pgcd);

    }

    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        MaFenetre maFenetre = new MaFenetre("Calcul du PGCD");
        maFenetre.setResizable(false);
        maFenetre.setVisible(true);

    }

}
