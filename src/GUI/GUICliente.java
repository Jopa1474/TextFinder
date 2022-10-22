package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class GUICliente extends JFrame{
    final String HOST="127.0.0.1";
    final int PUERTO = 4500;
    DataInputStream in;
    DataOutputStream out;
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
                //System.out.println(txtCliente.getText());
                try {
                    Socket sc = new Socket(HOST, PUERTO);

                    in = new DataInputStream(sc.getInputStream());
                    out = new DataOutputStream(sc.getOutputStream());

                    out.writeUTF(txtCliente.getText());

                    String mensaje = in.readUTF();

                    System.out.println(mensaje);

                    sc.close();


                } catch (IOException ee) {
                    throw new RuntimeException(ee);
                }

            }
        });
    }


}
