import java.util.Scanner;

public class Tester
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Login myLogin=new Login();

        System.out.println(myLogin.myPassword);
        System.out.println("enter your password: ");
        int myPassword= s.nextInt();

        myLogin.checkLogin(myPassword);
    }
}
