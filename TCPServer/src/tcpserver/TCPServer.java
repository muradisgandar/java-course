/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author murad_isgandar
 */
public class TCPServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ServerSocket ourFirstSocket = new ServerSocket(6789);
        while (true) {
            Socket connectionSocket = ourFirstSocket.accept();
            System.out.println("cvcxvb");
            InputStreamReader isr = new InputStreamReader(connectionSocket.getInputStream());
            InputStream in = connectionSocket.getInputStream();
            

            // Writing the file to disk
            // Instantiating a new output stream object
            OutputStream output = new FileOutputStream("/home/murad_isgandar/Desktop/gedit");

            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = in.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            // Closing the FileOutputStream handle
            System.out.println("File transfered succesfully!");
            output.close();
            
        }
        
    }
    
    
    

}
