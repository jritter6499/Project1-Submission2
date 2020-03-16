/**
 * Honor Pledge: I Pledge...JR
 * CPSC 240 02
 * Takes the input from user about BikeParts.
 * Returns input to the screen along with items <20$
 *
 * @author Joseph Ritter
 * @version 1.0
 * @since 2020-1-29
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    /**
     * Takes input from user.
     * Saves input to string array
     * Prints String array
     * Parses String array and adds it to BikeParts array
     * Prints items <20$
     */

    public static void main(String[] args) throws IOException {
        double time = 0.0;
        Warehouse liveDatabase = new Warehouse();
        try {
            liveDatabase.updateLiveDB("warehouseDB.txt");
        } catch (FileNotFoundException e) {
            System.out.println("warehouseDB.txt does not exist");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        liveDatabase.getBP();

        Scanner input = new Scanner(System.in);

        Warehouse inventory = null;

        String userIn = "";
        while (!(userIn.equals("Quit"))) {
            time += 1.0;

            System.out.println("Enter: enter part");
            System.out.println("Read: Read a file into inventory.");
            System.out.println("Sell: Sell a part");
            System.out.println("Display: Display a part");
            System.out.println("SortName: Sort parts by part name");
            System.out.println("SortNumber: Sort parts by part number");
            System.out.println("Quit: exits");
            System.out.println("Enter your choice: ");
            userIn = input.nextLine();

            if (userIn.equalsIgnoreCase("Enter")) {

            } else if (userIn.equalsIgnoreCase("Read")) {
                System.out.println("Please Type the fileName: ");
                //inventory = new Warehouse(input.nextLine());

            } else if (userIn.equals("Sell")) {

            } else if (userIn.equalsIgnoreCase("Display")) {

            } else if (userIn.equalsIgnoreCase("SortName")) {

            } else if (userIn.equalsIgnoreCase("SortNumber")) {

            } else if (userIn.equals("Quit")) {
                liveDatabase.saveToWarehouseDB();
                System.exit(0);
            }
        }
    }
}