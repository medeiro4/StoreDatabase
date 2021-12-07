import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class csvReader {
    public static void main(String[] args) throws FileNotFoundException
    {
        //These methods are all utilized to create insert statements using Java.


        //createCustomer();
        //createStore();
        //createProduct();
        //createInventory();
        //createTax();
        //createTaxID();
        //createPublisher();
        //cartDetail();
        //shopCart();
    }

    //Creates the taxed table
    public static void createTaxID(){
        int count = 0;
        String line = "";
        String splitBy = ",";
        String FileName ="//Users//stanvd//Documents//School//CSc6710//Data//GameStop Data - TaxID.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(FileName));

            while ((line = br.readLine()) != null)
            {

                String[] Values = line.split(splitBy);    // use comma as separator
                //System.out.println("Product Code ID: " + Values[0] + ", Store ID:" + Values[1]);
                System.out.print("(");
                System.out.print(Values[0]+","+Values[1]+","+Values[2]);
                System.out.println("),");
                count++;
                //System.out.println("Column 1: " + Values[0] + "Col 2:" + Values[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Creates the publisher table
    public static void createPublisher() {
        int count = 0;
        String line = "";
        String splitBy = ",";
        String FileName = "//Users//stanvd//Documents//School//CSc6710//Data//GameStop Data - Publisher.csv";

        try {
            for(BufferedReader br = new BufferedReader(new FileReader(FileName)); (line = br.readLine()) != null; ++count) {
                String[] Values = line.split(splitBy);
                System.out.print("(");
                System.out.print(Values[0] + ",'" + Values[1]+"'");
                System.out.println("),");
            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }

    //creates the cart_detail table
    public static void cartDetail() {
        int count = 0;
        String line = "";
        String splitBy = ",";
        String FileName = "//Users//stanvd//Documents//School//CSc6710//Data//GameStop Data - ShoppingCartDetail.csv";

        try {
            for(BufferedReader br = new BufferedReader(new FileReader(FileName)); (line = br.readLine()) != null; ++count) {
                String[] Values = line.split(splitBy);
                System.out.print("(");
                System.out.print(Values[0] + "," + Values[1]+"," + Values[2]+","+Values[4]+","+Values[5]+",'"+Values[7]+"'::date");
                System.out.println("),");
            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }

    //Creates the shopping_cart table
    public static void shopCart() {
        int count = 0;
        String line = "";
        String splitBy = ",";
        String FileName = "//Users//stanvd//Documents//School//CSc6710//Data//GameStop Data - ShopCart.csv";

        try {
            for(BufferedReader br = new BufferedReader(new FileReader(FileName)); (line = br.readLine()) != null; ++count) {
                String[] Values = line.split(splitBy);
                System.out.print("(");
                System.out.print(Values[0] + "," + Values[1]+",'"+Values[2]+"'::date");
                System.out.println("),");
            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }

    //Creates the zip_tax table
    public static void createTax(){
        int count = 0;
        String line = "";
        String splitBy = ",";
        String FileName ="//Users//stanvd//Documents//School//CSc6710//Data//GameStop Data - Tax Rates.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(FileName));

            while ((line = br.readLine()) != null)
            {

                String[] Values = line.split(splitBy);    // use comma as separator
                //System.out.println("Product Code ID: " + Values[0] + ", Store ID:" + Values[1]);
                System.out.print("(");
                System.out.print(Values[0]+","+Values[1]);
                System.out.println("),");
                count++;
                //System.out.println("Column 1: " + Values[0] + "Col 2:" + Values[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Creates the product table
    public static void createProduct(){
        int count = 0;
        String line = "";
        String splitBy = ",";
        String FileName ="//Users//stanvd//Documents//School//CSc6710//Data//GameStop Data - Products.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(FileName));

            while ((line = br.readLine()) != null)
            {

                String[] Values = line.split(splitBy);    // use comma as separator
                //System.out.println("Product Code ID: " + Values[0] + ", Store ID:" + Values[1]);
                System.out.print("(");
                System.out.print(Values[0]+",'"+Values[1]+"','"+Values[2]+"','"+Values[3]+"','"+Values[4]+"','"+Values[5]+"','"+Values[6]+"'");
                System.out.println("),");
                count++;
                //System.out.println("Column 1: " + Values[0] + "Col 2:" + Values[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //creates the store table
    public static void createStore(){
        int count = 0;
        String line = "";
        String splitBy = ",";
        String FileName ="//Users//stanvd//Documents//School//CSc6710//Data//GameStop Data - Store Data.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(FileName));

            while ((line = br.readLine()) != null)
            {

                String[] Values = line.split(splitBy);    // use comma as separator
                //System.out.println("Product Code ID: " + Values[0] + ", Store ID:" + Values[1]);
                System.out.print("(");
                System.out.print(Values[0]+",'"+Values[1]+"','"+Values[2]+"','"+Values[3]+"',"+Values[4]+",'"+Values[5]+"','"+Values[6]+"'");
                System.out.println("),");
                count++;
                //System.out.println("Column 1: " + Values[0] + "Col 2:" + Values[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //creates the belongs_to table
    public static void createInventory(){
        int count = 0;
        String line = "";
        String splitBy = ",";
        String FileName ="//Users//stanvd//Documents//School//CSc6710//Data//GameStop Data - Inventory.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(FileName));

            while ((line = br.readLine()) != null)
            {

                String[] Values = line.split(splitBy);    // use comma as separator
                System.out.print("(");
                System.out.print(Values[0]+","+Values[1]+","+Values[2]+","+Values[3]+","+Values[4]+","+Values[5]);
                System.out.println("),");
                count++;
                //System.out.println("Column 1: " + Values[0] + "Col 2:" + Values[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //creates the shoppers_program table
    public static void createCustomer(){

            int count = 0;
            String line = "";
            String splitBy = ",";
            String FileName ="//Users//stanvd//Documents//School//CSc6710//Data//GameStop Data - Customer Data.csv";

            try {
                BufferedReader br = new BufferedReader(new FileReader(FileName));

                while ((line = br.readLine()) != null)
                {

                    String[] Values = line.split(splitBy);    // use comma as separator
                    //System.out.println("Product Code ID: " + Values[0] + ", Store ID:" + Values[1]);
                    System.out.print("(");
                    System.out.print(Values[0]+",'"+Values[1]+"','"+Values[2]+"','"+Values[3]+"'::date,'"+Values[4]+"','"+Values[5]+"','"+Values[6]+"',"+Values[7]+","+Values[8]+","+Values[9]+","+Values[10]);
                    System.out.println("),");
                    count++;
                    //System.out.println("Column 1: " + Values[0] + "Col 2:" + Values[1]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}
