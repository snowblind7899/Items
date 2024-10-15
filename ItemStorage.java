public class ItemStorage { //object for storing and managing all available Item objects
    private Item[] items;
    private final int max_size = 50;
    private int itemIndex = 0;

    public ItemStorage(){ 
        items = new Item[max_size];
    }

    public void addItem(Item item){
        if(itemIndex >= max_size){
            System.out.println("Too many items, remove some before adding more");
        } else {
            items[itemIndex] = item;
            itemIndex++;
        }
    }

    public void removeItem(int index){
        if(itemIndex <= 0){
            System.out.println("No items to remove");
        } else {
            for(int i = index; i < itemIndex;i++){
                items[i-1] = items[i];
            }
            items[itemIndex] = null;
            itemIndex--;
        }
    }

    public void showStorage(){
        if(itemIndex == 0){
            System.out.println("\nNothing offered for auction");
        } else {
            System.out.println("\nThe following items will be listed for auction:");
            for(int i = 0; i < itemIndex;i++){
                System.out.print((i+1) + ") ");
                items[i].printAttributes();
                System.out.println();
            }
        }
    }

    public Item getItem(int value){
        return items[value];
    }

    public int getNumItems(){
        return this.itemIndex;
    }
}
