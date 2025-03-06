public interface UserRepository {
    void addUser(User user);
    User getUserByUsername(String username);
}