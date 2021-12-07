import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class cart_gen {
    public static void main(String[] args) throws FileNotFoundException
    {
        String[] ProdCode = new String[100];
        String[] StoreID = new String[100];
        String[] ProdPrice = new String[100];
        int count = 0;
        int cartstart = 1000001;
        int custStart= 100000001;
        String line = "";
        String splitBy = ",";
        String FileName ="C:\\Users\\stanw\\OneDrive\\Documents\\College Classes\\05_Fall 2021\\CSC6710\\Data\\Book2.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(FileName));

            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] Values = line.split(splitBy);    // use comma as separator
                //System.out.println("Product Code ID: " + Values[0] + ", Store ID:" + Values[1]);
                ProdCode[count] = Values[0];
                StoreID[count] = Values[1];
                ProdPrice[count] = Values[2];
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i=0;i<100;i++){
            int rstore,rprod;
            Random r1 = new Random();
            int jran = r1.nextInt(4)+1;
            int cartID = cartstart+i;
            int custID = custStart+r1.nextInt(100)+1;
            rstore = r1.nextInt(99);
            for (int j=0;j<jran;j++){
                rprod = r1.nextInt(99);
                int rqty = r1.nextInt(2)+1;
                double nPrice = rqty*Double.valueOf(ProdPrice[rprod]);
                System.out.println(cartID+","+custID+","+StoreID[rstore]+","+ProdCode[rprod]+","+rqty+","+nPrice);
                //Change this line for matching data entry
            }

        }
    }

}
