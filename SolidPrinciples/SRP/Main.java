package SolidPrinciples.SRP;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alwis Shaji", "alwis123@gmail.com");

        UserRepository repo = new UserRepository();
        repo.save(user);

        EmailService emailService = new EmailService();
        emailService.sendMail(user);
    }
}
