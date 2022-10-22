package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICliente extends JFrame{
    private JTextField txtCliente;
    private JButton btnEnviar;
    private JPanel ClientPanel;

    public GUICliente() {

        setContentPane(ClientPanel);
        setTitle("Cliente");
        setSize(900, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnEnviar.addActionListener(new ActionListener() {
            /**
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(txtCliente.getText());

            }
        });
    }


}
