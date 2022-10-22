package Servidores;

import java.io.DataInputStream; //Se utiliza para comunicar los servidores
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {

        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;

        final int PUERTO = 4500;

        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");

            while (true){

                sc = servidor.accept();//devuelve el sohet del cliente
                System.out.println("Cliente conectado");

                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                String mensaje = in.readUTF(); //se queda a la espera de que el cliente le mande algo

                System.out.println(mensaje);

                out.writeUTF("Hola ANANANANNA");

                sc.close(); //estoy cerrando el cliente, no el servidor
                System.out.println("Cliente desconectado");

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
