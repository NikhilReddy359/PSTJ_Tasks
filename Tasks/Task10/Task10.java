import java.util.*;

class LoginSystem {
    static boolean login(String user, String pass) {
        if (user == null || pass == null)
            throw new IllegalArgumentException();

        if (user.length() < 3 || user.length() > 20)
            return false;

        if (pass.length() < 6 || pass.length() > 20)
            return false;

        return user.equals("admin") && pass.equals("admin123");
    }
}

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            String user = sc.next();
            String pass = sc.next();

            try {
                System.out.println(LoginSystem.login(user, pass)
                        ? "SUCCESS"
                        : "FAILURE");
            } catch (Exception e) {
                System.out.println("FAILURE");
            }
        }
    }
}
