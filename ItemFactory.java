public class ItemFactory { //factory pattern to produce each Item object
    public static Item createItem(String type) throws Exception{
        try{
            type = type.toLowerCase();
        }catch (Exception e){
            System.out.println("invalid character(s) entered");
        }

        switch(type){
            case "book":
                return new Book();
            case "coin":
                return new Coin();
            case "car":
                return new Car();
            case "collectible":
                return new Collectible();
            default: 
                throw new Exception("invalid option");
        }
    }
}
