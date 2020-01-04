/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpclient;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author murad_isgandar
 */
public class TCPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost", 6789);
        DataOutputStream outToStream = new DataOutputStream(clientSocket.getOutputStream());
        
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        byte[] bytes = readBytesFromFile(text);
        outToStream.write(bytes);
        
        //System.out.println("text: "+text);
        clientSocket.close();
        
    }
    
    private static byte [] readBytesFromFile(String filePath){
        
        byte[] bytesArray = null;
        
        try(FileInputStream fileInputStream = new FileInputStream(filePath)) {
            File file  = new File(filePath);
            bytesArray = new byte[(int)file.length()];
            //read file into byte[]
            fileInputStream.read(bytesArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return bytesArray;
        
    }
    
    //Read using File NIO
    
//    public static  byte[] readFileAsByte(String fileName) throws IOException {
//        Path path = Paths.get(fileName);
//        return Files.readAllBytes(path);
//
//    }
    
    
    
    
    
    
    
    
}
