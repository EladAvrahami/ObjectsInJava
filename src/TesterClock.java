public class TesterClock
{
    //MAIN זה יפנה לקלאס אחר בשם Clock
    // נפתח עמוד קלאס חדש בשם טסטר ונרשום
        public static void main(String[] args) {
            Clock c1=new Clock();
            c1.setSec(58);
            c1.setMin(58);
            c1.setHours(23);
            c1.show();
            c1.tick();
            c1.show();
        }
}
