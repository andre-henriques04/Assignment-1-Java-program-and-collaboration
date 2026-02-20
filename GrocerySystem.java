/**
 * Program that manages grocery items with parallel arrays.
 */
public class GrocerySystem {

    /**
     * Builds initial inventory.
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
    }
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
}
