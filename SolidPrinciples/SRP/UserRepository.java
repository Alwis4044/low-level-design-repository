package SolidPrinciples.SRP;

// Data Responsibility
public class UserRepository {
    public void save(User user){
        System.out.println("Saving user to database");
    }
}
