import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Warehouse {
    private List<BikePart> liveDatabase;

    public Warehouse() {
        liveDatabase = new ArrayList<BikePart>();
    }

    /**
     * Pulls the contents of a warehouse file into the live data structure.
     *
     * @param fileName Name of the warehouse file.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void updateLiveDB(String fileName) throws FileNotFoundException, IOException {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String[] breaker = {"", "", "", "", "", ""};
            String line = reader.readLine();
            while (line != null) {
                breaker = line.split(",");
                String a = breaker[0];
                String b = breaker[1];
                double c = Double.parseDouble(breaker[2]);
                double d = Double.parseDouble(breaker[3]);
                boolean e = Boolean.parseBoolean(breaker[4]);
                Integer f = Integer.parseInt(breaker[5]);
                liveDatabase.add(new BikePart(a, b, c, d, e, f));
                line = reader.readLine();
            }
            reader.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    /**
     * Saves the contents of the live data structure to the warehouseDB.txt file.
     *
     * @throws IOException
     */
    public void saveToWarehouseDB() throws IOException {
        FileWriter writer = new FileWriter("warehouseDB.txt");
        for (BikePart bp : liveDatabase) {
            writer.write(
                    bp.getPartName() + ","
                            + bp.getPartNumber() + ","
                            + bp.getPrice() + ","
                            + bp.getSalesPrice() + ","
                            + bp.getOnSale() + ","
                            + bp.getQuantity()
                            + System.lineSeparator());
        }
        writer.close();
        System.out.println("Live database saved to warehouseDB.txt");
    }

    //private int findBikePart()

    public void updateBikePart(int x, Double price, Double salesPrice, Boolean onSale, Integer quantity) {
    //    liveDatabase.indexOf();
        if (price != null) {
      //      bp.setPrice(price);
        }
        if (salesPrice != null) {
        //    bp.setSalesPrice(salesPrice);
        }
        if (onSale != null) {
          //  bp.setOnSale(onSale);
        }
        if (quantity != null) {
            //bp.setQuantity(quantity);
        }
    }

    public List<BikePart> getBP() {
        return liveDatabase;
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

    //public BikePart[] getParts() {
    //  return bikeParts;

}

/*    public void SortNum() {
        ArrayList<String> sortedNumbers = new ArrayList<String>();
        for (int i=0; i<lineNum; i++)
            sortedNumbers[i] = bikeParts[i].getPartName();
        Arrays.sort(sortedNumbers);
    }*/