package ru.netology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        String host = "netology.homework";
        int port = 8089;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String questionName = in.readLine();
            System.out.println(questionName);
            out.println("Mike");

            String questionChild = in.readLine();
            System.out.println(questionChild);
            out.println("no");
            System.out.println(in.readLine());

            String questionAge = in.readLine();
            System.out.println(questionAge);
            out.println("30");

            String questionVideoGame = in.readLine();
            System.out.println(questionVideoGame);
            out.println("no");
            System.out.println(in.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}