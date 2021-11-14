public class MyCarP47
{
    int speed=0,carNum;

    //כתובשיטות Get לשני תכונות המכונית
    public int getSpeed() {
        return speed;
    }

    public int getCarNum() {
        return carNum;
    }

    //הגדרתי Set רק למס המכונית משום שהמהירות משתנה מרגע לרגע
    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
    //פונקציה המעלה מהירות ב1
    public void moreSpeed(){
        speed+=1;
        System.out.println("The speed of the car "+carNum+"is: "+speed);
    }
    //פונקציה המאיטה ב1
    public void lessSpeed(){
        speed-=1;
        System.out.println("The speed of the car "+carNum+"is: "+speed);
    }
    //עצירת המכונית בהדרגה
    //( speed=getSpeed();speed>0;speed-=1){return;}
    public void stopCar(){
            while (speed!=0){
               speed-=1;
            }
        System.out.println("the car number is"+carNum+"and it stopped");
    }
}
