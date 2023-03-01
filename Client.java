import java.io.*;
import java.net.*;
import java.util.Scanner;
import javax.crypto.*;
import java.security.*;

public class Client {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter server IP address: ");
            String ipAddress = scanner.nextLine();
            int port = 12345; // port number
            Socket socket = null;
            try {
                socket = new Socket(ipAddress, port);
            } catch (ConnectException e) {
                System.out.println("Error: server is down");
                System.exit(0);
            }
            System.out.println("Enter one of the options:");
            System.out.println("1) open mode");
            System.out.println("2) secure mode");
            System.out.println("3) quit application");
            int option = scanner.nextInt();
            if (option == 3) {
                System.exit(0);
            }
            System.out.print("Enter a word: ");
            String word = scanner.next();
            OutputStream outputStream = socket.getOutputStream();
            if (option == 2) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(128);
                SecretKey secretKey = keyGenerator.generateKey();
                Cipher cipher = Cipher.getInstance("AES");
                cipher.init(Cipher.ENCRYPT_MODE, secretKey);
                byte[] encryptedWord = cipher.doFinal(word.getBytes());
                PrintWriter writer = new PrintWriter(outputStream, true);
                writer.println(encryptedWord);
            } else {
                PrintWriter writer = new PrintWriter(outputStream, true);
                writer.println(word);
            }
            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String response = reader.readLine();
            System.out.println("Server response: " + response);
            socket.close();
        }
    }
}
