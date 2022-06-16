package fenetres;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
    public JTextField nb1 = new JTextField("nombre 1");
    public JTextField nb2 = new JTextField("nombre 2");

    JLabel pgcd = new JLabel(resultatCalcul);

    public void action() {

        int nb1input = Integer.valueOf(nb1.getText());
        int nb2input = Integer.valueOf(nb2.getText());
        Calcul calcul;
        calcul = new Calcul();
        resultatCalcul = String.valueOf(calcul.calcuerPGCD(nb1input, nb2input));
        pgcd.setText(String.format("Le PGCD entre %s et %s est : %s.", nb1input, nb2input, resultatCalcul));
        pgcd.setVisible(true);
    }

    public MaFenetre(String title) throws HeadlessException {

        super(title);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(300, 105);
        this.setLocationRelativeTo(null);
        JPanel contentePane = (JPanel) this.getContentPane();
        contentePane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        nb1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e1) {

            }

            @Override
            public void mouseEntered(MouseEvent e1) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent e1) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e1) {
                nb1.selectAll();

            }

            @Override
            public void mouseReleased(MouseEvent e1) {

            }
        });

        // nb2.requestFocus();
        nb2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // nb2.selectAll();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // nb2.selectAll();

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                nb2.selectAll();

            }
        });
        // contentePane.revalidate();
        // contentePane.repaint();
        contentePane.add(nb1);
        nb1.selectAll();
        contentePane.add(nb2);
        nb2.selectAll();
        nb2.requestFocus();

        btnCalculer.addActionListener((event) -> action());
        contentePane.add(btnCalculer);

        contentePane.add(pgcd);
        pgcd.setVisible(false);

    }

    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        MaFenetre maFenetre = new MaFenetre("Calcul du PGCD");
        maFenetre.setResizable(false);
        // maFenetre.pack();

        maFenetre.setVisible(true);

    }

}
