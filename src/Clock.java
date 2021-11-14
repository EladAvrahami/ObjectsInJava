public class Clock
{
private int hours,min,sec;

    public void setHours(int h) {
        if (h<0||h>23)
        {hours=0;}
        else {hours=h; }
    }

    public void setMin(int m) {
        if (m<0||m>59){min=0;}
        else {min=m;}
    }

    public void setSec(int s) {
        if (s<0||s>59){sec=0;}
        else {sec=s;}
    }


    public void show(){
       /* if (hours<10)
        {
            System.out.print("0"+hours+":");//אם המס השעות חד סיפרתי תציג 0 לפני ולאחריו נקודותיים לפריד דקות
        }
        else{ System.out.print(hours+":");}

        if (min<10) { System.out.println("0"+min+":"); }
        else{ System.out.println();}

        if (sec<10){
            System.out.println("0"+sec); }
        else {
            System.out.println(sec);
        }*/
        //במקום לרשום כל מה שבהערה למעלה ניתן לכתוב כך :
        System.out.println(addZero(hours)+":"+addZero(min)+":"+addZero(sec));
    }
    private String addZero(int num){
        return num<10?("0"+num):""+num;
    }

    public void tick(){
        sec+=1;
        min=min+sec/60;
        hours=hours+min/60;

        sec%=60;
        min%=60;
        hours%=24;

    }

    public void reset(){
        hours=min=sec=0;
    }
}




