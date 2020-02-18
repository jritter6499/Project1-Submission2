import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Warehouse {
    BikePart[] bikeParts;
    int[] quantity;

    public Warehouse() {

    }
    public Warehouse(String fileIn) throws FileNotFoundException, IOException {
        BufferedReader reader;
        List<BikePart> inventory = new ArrayList();
        try {
            reader = new BufferedReader(new FileReader(fileIn));
            String[] breaker = {"", "", "", "", ""};
            String line = reader.readLine();
            while (line != null) {
                breaker = line.split(",");
                String a = breaker[0];
                String b = breaker[1];
                double c = Double.parseDouble(breaker[2]);
                double d = Double.parseDouble(breaker[3]);
                boolean e = Boolean.parseBoolean(breaker[4]);
                inventory.add(new BikePart(a, b, c, d, e));
                line = reader.readLine();
            }
            reader.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        FileWriter writer = new FileWriter("warehouseDB.txt");
        for (BikePart bp: inventory) {
            writer.write(
                    bp.getPartName() + ", "
                            + bp.getPartNumber() + ", "
                            + bp.getPrice() + ", "
                            + bp.getSalesPrice() + ", "
                            + bp.getOnSale() + ", "
                            + System.lineSeparator());
        }
        writer.close();
        System.out.println("warehouseDB successfully processed");
    }

    //public String sell(String partNum, double time) {
      //  for (int i=0; i<bikeParts.length; i++) {
        //    if (partNum = bikeParts[i].getPartNumber() && bikeParts[i].getQuantity() > 0) {
          //      bikeParts[i].setQuantity(bikeParts[i].getQuantity()-1);
            //    return bikeParts[i].getPartName() + "was sold at " + time;
            //}
        //} return "error";

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
