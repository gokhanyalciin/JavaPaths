package C.KosulluIfadelerVeKodBlokları;
import java.util.Scanner;
public class G_KullanıcıGirisi {
    public static void main(String[] args) {
        String usernameSystem, passwordSystem, changeUsername, changePassword;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        usernameSystem = input.nextLine();
        System.out.print("Please enter your password: ");
        passwordSystem = input.nextLine();
        if ((usernameSystem.equals("username123")) && (passwordSystem.equals("password123."))){
            System.out.println("You are logged in!");
        } else if ((!usernameSystem.equals("username123")) || (!passwordSystem.equals("password123."))){
            System.out.println("Your username or password is incorrect");
            System.out.println("Do you want to change your username or password?");
            System.out.println("1.Username\n2.Password");
            select = input.nextInt();
            if ( select == 1 ){
                System.out.print("Please enter your new username: ");
                input.nextLine();
                changeUsername = input.nextLine();
                if (changeUsername.equals("username123")){
                    System.out.println("Your new username cannot be the same as the old username.");
                }else {
                    System.out.println("Your username has been changed.");
                }
            } else if (select == 2) {
                System.out.println("Please enter your new password: ");
                input.nextLine();
                changePassword = input.nextLine();
                if (changePassword.equals("password123.")){
                    System.out.println("Your new password cannot be the same as the old username.");
                }else {
                    System.out.println("Your password has been changed.");
                }
            }
        }
    }
}