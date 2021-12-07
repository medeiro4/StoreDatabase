import java.util.GregorianCalendar;
import java.util.Random;


public class db_customer {
    public static void main(String[] args){

        //csvGEN();
        //ccNumGen();
        //taxRate(100);
        //DOBGen();
        //ccEXPGen();
    }

    public static String RandomDOB(){
        GregorianCalendar gc = new GregorianCalendar();
        int year = randBetween(1960, 2010);
        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        return gc.get(gc.MONTH) + "-" + (gc.get(gc.DAY_OF_MONTH) + 1) + "-" + gc.get(gc.YEAR);
    }
    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

    public static void DOBGen(){
        for(int i=0;i<100;i++){
            System.out.println(RandomDOB());
        }

    }

    public static void csvGEN(){
        for (int y = 0; y<100; y++) {
            for (int i = 0; i < 3; i++) {
                Random rand = new Random();
                System.out.print(rand.nextInt(10));
            }
            System.out.println();
        }
    }

    public static void ccNumGen(){
        for (int y = 0; y<100; y++) {
            for (int i = 0; i < 16; i++) {
                Random rand = new Random();
                System.out.print(rand.nextInt(10));
            }
            System.out.println();
        }
    }

    public static void ccEXPGen(){
        for (int y = 0; y<100; y++) {

            Random rand = new Random();
            System.out.print(rand.nextInt(12)+1); //Random month
            System.out.print(", "+(rand.nextInt(4)+22)); //Expire year between 22 to 25
            System.out.println();
        }
    }

    public static void taxRate(int val){
        double rate;
        for (int y = 0; y<val; y++) {
            Random rand = new Random();
            rate = 3.5 + rand.nextDouble()*11;
            System.out.println(rate);
        }
    }
}
