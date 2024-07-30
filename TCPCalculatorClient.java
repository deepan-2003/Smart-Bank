import java.io.*;
import java.net.*;

public class TCPCalculatorClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Enter an expression (e.g., 2 + 3):");
            String expression = userInput.readLine();
            out.println(expression);

            String response = in.readLine();
            System.out.println("Result: " + response);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}