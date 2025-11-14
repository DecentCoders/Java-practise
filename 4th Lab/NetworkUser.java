import java.util.Scanner;
public class NetworkUser {
    private String userId;
    private String password;
    private String email;
    public NetworkUser(String userId, String password, String email) {
        this.userId = userId;
        this.password = password;
        this.email = email;
    }
    public NetworkUser(String userId, String password) {
        this(userId, password, userId + "@gameschool.com");
    }
    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "NetworkUser{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Do you want to enter a custom email? (yes/no): ");
        String choice = scanner.nextLine();

        NetworkUser user;
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter email address: ");
            String email = scanner.nextLine();
            user = new NetworkUser(userId, password, email);
        } else {
            user = new NetworkUser(userId, password);
        }

        System.out.println("\nUser created successfully:");
        System.out.println(user);

        scanner.close();
    }
}
