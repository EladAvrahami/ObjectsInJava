import java.util.Scanner;

public class digitsInNumber
{
    public static void main(String[] args)
    {


        Scanner scan=new Scanner(System.in);
        int userNumber=0;
        System.out.println("enter your number: ");
        userNumber= scan.nextInt();
        printResult(getDigitArray(userNumber));
    }


    public static int[] getDigitArray(int userNumber)
    {
        int returnArray[]=new int[10];
        while (userNumber>0){
            returnArray[userNumber%10]+=1;//מה שבתוך הסוגרייםימצא לי את הספרה האחרונה במספר הארוך שהזנתי
            // הספרה הזאת מסמלת תא במערך בשם "מערך חוזר" ואל התא הזה תוסיף 1
            //כלומר סך כל האפשרויות לספרה הוא מ0-9 תמצא מהי הספרה (מודולו המס שהזנתי) ותוסיף ךתא שלה במערך החדש 1 (כלומר תבצע ספירה )
            userNumber/=10;
        }
        return returnArray;
    }

    public static void printResult(int[] digitArray)
    {
        for (int index=0;index<digitArray.length;index+=1)
        {
            if (digitArray[index]>0) {
                System.out.printf("%d:%d\n", index, digitArray[index]);
                //אינדקס(שהוא גם מקום ההספרה במערך) יסמל את המס
                //דיגיטאריי[אינדקס] זה בעצם הערך שבתוך התא של הספרה שנמצאת במספר שהקלדנו
            }
        }
    }
}
