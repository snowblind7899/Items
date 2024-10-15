import java.util.Scanner;

public class Menu { //user interface
    public static final Scanner input = new Scanner(System.in); 
    boolean exit = false;
    ItemStorage inventory = new ItemStorage();

    public void show() throws Exception{
        while(!exit){
            System.out.println();
            System.out.println("1)Add new item");
            System.out.println("2)View items");
            System.out.println("3)Remove an item");
            System.out.println("4)Save and exit");
            System.out.println("5)Exit without saving");

            int choice = input.nextInt();
            switch(choice){ 
                case 1:
                    System.out.print("What type of item would you like to add? (book, car, collectible, coin): ");
                    input.nextLine();
                    String type = input.nextLine();
                    Item item = ItemFactory.createItem(type);
                    item.setAttributes();
                    inventory.addItem(item);
                    break;
                case 2:
                    inventory.showStorage();
                    break;
                case 3:
                    inventory.showStorage();
                    System.out.print("Which item would you like to remove? ");
                    int index = input.nextInt();
                    inventory.removeItem(index);
                    break;
                case 4:
                    CsvWriter.writeCSV(inventory);
                    exit = true;
                    break;
                case 5:
                    exit = true;
                    break;
                default: 
                    throw new Exception("invalid choice");
            } 
        }
    }
}
