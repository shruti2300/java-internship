import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Map<String, String> credentials = new HashMap<>();
        credentials.put("admin", "admin123");
        credentials.put("john", "john@2025");
        credentials.put("guest", "guest123");

        Scanner sc = new Scanner(System.in);

        System.out.println("===== LOGIN SYSTEM =====");
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (credentials.containsKey(username)) {
            String correctPassword = credentials.get(username);

            if (correctPassword.equals(password)) {
                System.out.println("\nLogin Successful! Welcome, " + username + ".");
            } else {
                System.out.println("\nLogin Failed! Incorrect password.");
            }
        } else {
            System.out.println("\nLogin Failed! Username not found.");
        }

        sc.close();
    }
}
