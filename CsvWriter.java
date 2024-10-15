import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {
    private static String[][] values = new String[13][50];
    private static String[][] buildArray(ItemStorage listings){ //populate array to write csv
        String[] headerValues = 
        {"car_make","car_model","car_year","car_miles","book_title",
        "book_author","book_year","book_cond","coin_desc","coin_grade",
        "coin_year","collect_desc","collect_cond"}; 
        values[0] = headerValues;
        for(int i = 1;i<listings.getNumItems()+1;i++){ 
            Item item = listings.getItem(i-1);
            String[][] itemAttr = item.getFileAttributes();
            int index = 0;
            for(int j = 0;j < values[0].length;j++){ //iterate to find corresponding header
                if(values[0][j].equals(itemAttr[0][0])){
                    index = j; //set the index to the correct header
                    break;
                }
            }
            for(int k = 0;k<itemAttr.length;k++){ //populate 
                values[i][index] = itemAttr[k][1];
                index++;
            }
        }
        return values;
    }
    
    public static void writeCSV(ItemStorage listings) throws IOException{
        //function for writing the csv file
        String[][] values = buildArray(listings);
        FileWriter fw = new FileWriter("AuctionItems.csv");
        for(int i = 0; i < values.length;i++){
            for(int j = 0;j < values[i].length;j++){
                if(values[i][j] == null){
                    fw.write(",");
                } else {
                    fw.write(values[i][j] + ",");
                }
            }
            fw.write(String.format("%n"));
        }
        System.out.println("Saved to AuctionItems.csv");
        fw.close();
    }
}
