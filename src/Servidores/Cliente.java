package Servidores;

import GUI.GUICliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Clase que crea el servidor del cliente
 * @author https://www.youtube.com/watch?v=3wJTI9LMOsk&t=6s&ab_channel=DiscoDurodeRoer
 *
 */

public class Cliente {
    public static void main(String[] args) {

        final String HOST="127.0.0.1";
        final int PUERTO = 4500;
        DataInputStream in;
        DataOutputStream out;

        GUICliente clienteFrame = new GUICliente();

        try {
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF("Hola ANANANAN desde el cliente");

            String mensaje = in.readUTF();

            System.out.println(mensaje);

            sc.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
