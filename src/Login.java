public class Login
{
public int password;
public final int myPassword=12345;

public void checkLogin(int myPassword){
    if (password==myPassword){
        System.out.println("user logged in....");
    }else {
        System.out.println("who are you?");
    }
}
}
