import java.util.Scanner;

public class MyTesterCarP47
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MyCarP47 car1=new  MyCarP47();
        System.out.println("enter car num :");
        car1.carNum=scanner.nextInt();
        System.out.println("enter car speed :");
        car1.speed=scanner.nextInt();

        System.out.println("how much do you like to accelerate the car?");

    }
}
