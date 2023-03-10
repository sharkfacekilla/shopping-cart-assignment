public class ItemToPurchase {
   
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;
    
    public ItemToPurchase() {
       itemName = "none";
       itemPrice = 0;
       itemQuantity = 0;
       itemDescription = "none";
    }
    public ItemToPurchase(String name, int price, int quantity, String description) {
        itemName = name;
        itemPrice = price;
        itemQuantity = quantity;
        itemDescription = description;
    }
    
    public void setName(String name) {
       itemName = name;
    }
    
    public void setPrice(int price) {
       itemPrice = price;
    }
    
    public void setQuantity(int quantity) {
       itemQuantity = quantity;
    }
    
    public void setDescription(String description) {
       itemDescription = description;
    }
    
    public String getName() {
       return itemName;
    }
    
    public int getPrice() {
       return itemPrice;
    }
    
    public int getQuantity() {
       return itemQuantity;
    }
    
    public String getDescription() {
       return itemDescription;
    }
    
    public int getTotalCost() {
       return itemPrice * itemQuantity;
    }
    
    public String printItemCost() {
       return itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemPrice * itemQuantity) + "\n";
    }
    
    public void printItemDescription() {
       System.out.println(itemName + ": " + itemDescription);
    }
 }