package SolidPrinciples.SRP;

// Email Responsibility
public class EmailService {
    public void sendMail(User user){
        System.out.println("Sending email to " + user.getEmail());
    }
}
