import java.util.Scanner;

public class tagilclass1 //קלוט מס כלשהו(לא מוגבל בספרות) הצגו כמה פעמים מופיע כל ספרה
    //לדוגמה המס 478113  4:1  7:1  3:2  1:2
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int usernum=0;
        System.out.println("enter a num");
        usernum=scan.nextInt();

        printResult(getDigitArray(usernum));
    }
    public static int[] getDigitArray(int hilanum)
    {
        int returnArray[]=new int[10];
        while (hilanum>0){
            returnArray[hilanum%10]+=1;
            hilanum/=10;
        }
        return returnArray;
    }

    public static void printResult(int[] elad)
    {
        for (int index=0;index<elad.length;index+=1) {
            if (elad[index] > 0) {
                System.out.printf("%d:%d\n", index, elad[index]);
            }

        }
    }

}
