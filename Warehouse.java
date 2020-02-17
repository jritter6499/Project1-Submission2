import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Warehouse {
    BikePart[] bikeParts;
    int[] quantity;

    public Warehouse() {

    }
    public Warehouse(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            Scanner input = new Scanner(fileIn);
            int lineNum = input.nextInt();
            System.out.println(lineNum);
            String[] lines = new String[lineNum];
            bikeParts = new BikePart[lineNum];

            // get all lines from file
            for (int i = 0; i < lineNum; i++) {
                lines[i] = input.next();
            }

            // loop through each line and create bike object
            // add object to array of bikeParts
            for (int i = 0; i < lineNum; i++) {
                String[] temp = lines[i].split(",");
                BikePart a = new BikePart();
                a.setPartName(temp[0]);
                a.setPartNumber(Integer.parseInt(temp[1]));
                a.setPrice(Double.parseDouble(temp[2]));
                a.setSalesPrice((Double.parseDouble(temp[3])));
                a.setOnSale(Boolean.valueOf(temp[4]));

                // inventory number
                quantity[i] = Integer.parseInt(temp[5]);
                bikeParts[i] = a;
            }

            //for (int i = 0; i < lineNum; i++) {
                //if (bikeParts[i].getPrice() < 20) {
                    //System.out.println(bikeParts[i]);
                //}
            //}
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public String sell(double partNum, double time) {
        for (int i=0; i<bikeParts.length; i++) {
            if (partNum == bikeParts[i].getPartNumber() && bikeParts[i].getQuantity() > 0) {
                bikeParts[i].setQuantity(bikeParts[i].getQuantity()-1);
                return bikeParts[i].getPartName() + "was sold at " + time;
            }
        } return "error";
    }

    public void SortName(BikePart[] unsorted) {
        Arrays.sort(unsorted);
        System.out.println(Arrays.toString(unsorted));
    }

    public BikePart[] getParts() {
        return bikeParts;
    }

/*    public void SortNum() {
        ArrayList<String> sortedNumbers = new ArrayList<String>();
        for (int i=0; i<lineNum; i++)
            sortedNumbers[i] = bikeParts[i].getPartName();
        Arrays.sort(sortedNumbers);
    }*/
}
