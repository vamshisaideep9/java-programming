package switch_statements;

public class Main {
    
    public static void main(String[] args) {
        
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You're an admin!");
                break;
            case "moderator":
                System.out.println("You're a  moderator");
            
            default:
                System.out.println("You're a guest!");
        }
    }
}
