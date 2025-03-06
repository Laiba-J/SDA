import java.util.Scanner;

public class UserManager {
    private UserRepository userRepository;

    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Enter your email: ");
        // Create a User object with username, password, and email
        User user = new User(username, password);
        userRepository.addUser(user);
        System.out.println("User registered successfully!");
    }

    public User getUserByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }
}