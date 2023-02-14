import java.util.ArrayList;

public class ShoppingCart {
   
   private static String custName;
   private static String curDate;
   private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();
   
   public ShoppingCart() {
      custName = "none";
      curDate = "January 1, 2022";
   }
   
   public ShoppingCart(String customerName, String currentDate) {
      custName = customerName;
      curDate = currentDate;
   }
   
   public static String getCustomerName() {
      return custName;
   }
   
   public static String getDate() {
      return curDate;
   }
   
   public void addItem(ItemToPurchase item) {
      cartItems.add(item);
   }
   
   public void removeItem(String itemName) {
    boolean found = false;
    int i = 0;
    while (i < cartItems.size() && (!found)) {
       if (cartItems.get(i).getName().equals(itemName)) {
          cartItems.remove(i);
          found = true;
       }
       i++;
    }
    if (!found) {
       System.out.println("Item not found in cart. Nothing removed.");
    }
}
 

   public void modifyItem(ItemToPurchase itemName) {
      System.out.println("TODO: FINISH modifyItem Method");
   }
   
   public int getNumItemsInCart() {
      int total = 0;
      for (ItemToPurchase item : cartItems) {
        total += item.getQuantity();
      }
      return total;
   }
   
   public int getCostOfCart() {
      System.out.println("TODO: FINISH getCostOfCart Method");
      return 0;
   }
   
   public void printTotal() {
      System.out.println("OUTPUT SHOPPING CART");
      System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
      System.out.println("Number of Items: " + (getNumItemsInCart() - 1));
      if (getNumItemsInCart() == 0) {
         System.out.println("\nSHOPPING CART IS EMPTY");
         System.out.println("\nTotal: $0");
      }
      else {
        int totalCost = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println(cartItems.get(i).printItemCost());
            totalCost += cartItems.get(i).getTotalCost();
        }
        System.out.println("Total: $" + totalCost);
      }
      /* Example Print 
      John Doe's Shopping Cart - February 1, 2022
      Number of Items: 8
      
      Nike Romaleos 2 @ $189 = $378
      Chocolate Chips 5 @ $3 = $15
      Powerbeats 2 Headphones 1 @ $128 = $128
      
      Total: $521
      */
   }
   
   public void printDescriptions() {
      System.out.println("TODO: FINISH printDescriptions Method");
      /* Example Print 
      John Doe's Shopping Cart - February 1, 2022

      Item Descriptions
      Nike Romaleos: Volt color, Weightlifting shoes
      Chocolate Chips: Semi-sweet
      Powerbeats 2 Headphones: Bluetooth headphones
      */
   }
}