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
import java.util.Scanner;

public class Main {
    /**
     * Takes input from user.
     * Saves input to string array
     * Prints String array
     * Parses String array and adds it to BikeParts array
     * Prints items <20$
     */

    public static void main(String[] args) {
        double time = 0.0;
        Scanner input = new Scanner(System.in);

        Warehouse inventory = null;

        String userIn = "";
        while (!(userIn.equals("Quit"))) {
            time+=1.0;

                //System.out.println("Enter: enter part");
                System.out.println("Read: Read a file into inventory.");
                System.out.println("Sell: Sell a part");
                System.out.println("Display: Display a part");
                System.out.println("SortName: Sort parts by part name");
                System.out.println("SortNumber: Sort parts by part number");
                System.out.println("Quit: exists");
                System.out.println("Enter your choice: ");
                userIn = input.nextLine();

                // Read in the inventory file
                if (userIn.equals("Read")) {
                    System.out.println("Please Type the fileName: ");
                    inventory = new Warehouse(input.nextLine());
                } else if(userIn.equals("Enter")) {
                    System.out.println("Inventory full");
                } else if(userIn.equals("Sell")) {

                } else if (userIn.equals("SortName")) {
                    inventory.SortName(inventory.getParts());
                }
            }


        }

    }
