/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpclient;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import util.FileUtility;

/**
 *
 * @author murad_isgandar
 */
public class TCPClient {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.1.106", 6789);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        byte[] bytes = FileUtility.readBytes("/home/murad_isgandar/Desktop/index.jpeg");
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);

        socket.close();

    }
}
