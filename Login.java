import java.util.Scanner;

class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class Login {
    public static void main(String[] args) {

        User Testuser = new User("TestUser", "1234");
        Scanner input = new Scanner(System.in);
        Integer attempts = 0;
        String user;
        String password;

        do {

            System.out.print("Enter a user: ");
            user = input.nextLine();
            System.out.print("Enter a password: ");
            password = input.nextLine();

            if (user.compareTo(Testuser.getName()) == 0 && password.compareTo(Testuser.getPassword()) == 0) {
                System.out.println("Login successfull");
                break;
            } else {
                System.out.println("Login Error");
            }

            attempts++;
        } while (attempts < 3);
        if (attempts == 3) {
            System.out.println("Maximum attempts reached. User blockeds");
        }
        input.close();
    }

}
