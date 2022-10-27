package GUI;

import javax.swing.*;

public class GUIServidor extends JFrame {
    private JButton btnSeleccionar;
    private JPanel ServerPanel;

    public GUIServidor() {

        setContentPane(ServerPanel);
        setTitle("Servidor");
        setSize(500, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
