import java.awt.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.File;

public class db_inventory {
    private String[] ProdCode;
    private String[] StoreID;


    public static void main(String[] args) throws FileNotFoundException
    {
        String[] ProdCode = new String[100];
        String[] StoreID = new String[100];
        String[] ProdPrice = new String[100];
        int count = 0;
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\stanw\\OneDrive\\Documents\\College Classes\\05_Fall 2021\\CSC6710\\Data\\Book2.csv"));

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
            for (int j=0;j<100;j++){
                Random r1 = new Random();
                int prodCount = r1.nextInt(15)+1;
                int prodSold = r1.nextInt(7);
                int prodReturned = r1.nextInt(2);
                System.out.println(StoreID[i]+","+ProdCode[j]+","+ProdPrice[j]+","+prodCount+","+prodSold+","+prodReturned);

            }
        }
    }


    public static void genEmptyTable(){

    }
}
