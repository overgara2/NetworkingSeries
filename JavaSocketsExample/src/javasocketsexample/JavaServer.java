/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasocketsexample;

import java.io.*;
import java.net.*;

/**
 *
 * @author srv_veralab
 */
public class JavaServer {
    public static void main(String[] args) throws Exception {
        JavaServer server = new JavaServer();
        server.run();
    }
    
    public void run() throws Exception {
        ServerSocket serverSocket = new ServerSocket(444);
        Socket socket = serverSocket.accept();
        InputStreamReader ISR = new InputStreamReader(socket.getInputStream());
        BufferedReader BR = new BufferedReader(ISR);
        
        String message = BR.readLine();
        System.out.println(message);
        
        if (message != null)
        {
            PrintStream PS = new PrintStream(socket.getOutputStream());
            PS.println("Message received");
        }
        
    }
}
