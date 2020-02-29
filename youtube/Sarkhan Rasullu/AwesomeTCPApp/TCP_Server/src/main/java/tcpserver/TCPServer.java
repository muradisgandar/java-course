/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserver;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import lombok.SneakyThrows;
import util.FileUtility;

/**
 *
 * @author murad_isgandar
 */
public class TCPServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        readAsBytes();
    }

    @SneakyThrows
    public static void readAsBytes() {

        ServerSocket ourFirstSocket = new ServerSocket(6789);

        while (true) {
            System.out.println("Yeni mushteri uchun gozleyirem...");
            Socket connection = ourFirstSocket.accept();
            System.out.println("Yeni mushteri geldi..");
            
            DataInputStream dataStream = new DataInputStream(connection.getInputStream());
            
            byte[] arr = readMessage(dataStream);
            FileUtility.writeBytes(arr, "/home/murad_isgandar/Desktop/ram1234.jpeg");
        }

    }

    @SneakyThrows
    public static byte[] readMessage(DataInputStream din) {
        int msgLen = din.readInt();
        byte[] msg = new byte[msgLen];
        din.readFully(msg);
        return msg;
    }

    @SneakyThrows
    public static void readAsString(){

        ServerSocket ourFirstSocket = new ServerSocket(6789);

        while (true) {
            System.out.println("Yeni mushteri uchun gozleyirem...");
            Socket connection = ourFirstSocket.accept();
            System.out.println("Yeni mushteri geldi..");
            InputStream is = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader bReader = new BufferedReader(reader);

            String messageFromClient = bReader.readLine();
            System.out.println("Mushteri deyir ki, " + messageFromClient);
        }
    }

}
