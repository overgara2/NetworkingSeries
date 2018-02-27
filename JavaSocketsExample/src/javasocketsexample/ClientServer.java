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
public class ClientServer {
    public static void main (String[] args) throws Exception {
        ClientServer client = new ClientServer();
        client.run();
    }
    
    public void run() throws Exception {
        Socket socket = new Socket("localhost", 444);
        PrintStream PS = new PrintStream(socket.getOutputStream());
        PS.println("Hello");
        
        InputStreamReader ISR = new InputStreamReader(socket.getInputStream());
        BufferedReader BR = new BufferedReader(ISR);
        
        String message = BR.readLine();
        System.out.println(message);        
    }
}
