import java.util.Scanner;
/**
 * Program that manages grocery items with parallel arrays.
 */
public class GrocerySystem {

    /**
     * Builds initial inventory and runs user menu.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Bananas";
        itemPrices[0] = 1.49;
        itemStocks[0] = 15;

        itemNames[1] = "Apples";
        itemPrices[1] = 2.99;
        itemStocks[1] = 10;

        itemNames[2] = "Eggs";
        itemPrices[2] = 3.50;
        itemStocks[2] = 12;
        
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("1. View");
            System.out.println("2. Restock");
            System.out.println("3. Exit");

            choice = scanner.nextInt();

            if (choice == 1) {
                printInventory(itemNames, itemPrices, itemStocks);
            } 
            else if (choice == 2) {
                System.out.println("Which item would you like to restock?: ");
                String target = scanner.next();
                System.out.println("How many are you restocking?: ");
                int amount = scanner.nextInt(); 
                restockItem(itemNames, itemStocks, target, amount);
            } 
            else if (choice == 3) {
                System.out.println("Exiting program.");
                break;
            } 
            else {
                System.out.println("Please enter either 1, 2 or 3. Try again.");
            }
        }
        scanner.close();
    }


/**
* Nick Reyes Task 1: Inventory Display
* Program displays items in inventory that are not empty
* @param names array for item names
* @param prices array for item prices 
* @param stocks array for item stock amounts
*/

public static void printInventory(String[] names, double [] prices, int[] stocks)
{
    System.out.println("Inventory:");

    //Required for loop for display
    for(int i = 0; i < names.length; i++) {
        if(names[i] != null) {

            System.out.println("Item: " + names[i] + ", Price: $" +
                prices[i] + ", Stock: " + stocks[i]);

        }else {

            }
        }
    }

        /**
     * Andre Henriques Task 2: Restock and Search
     * Finds an item and increases its stock.
     * @param names array for item names
     * @param stocks array for item stock amounts
     * @param target item to restock
     * @param amount amount to add
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount)
    {
        boolean found = false;

        for(int i = 0; i < names.length; i++) {
            if(names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                System.out.println("Restocked " + names[i] + 
                    ". New stock: " + stocks[i]);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Item not found.");
        }
    }
}
