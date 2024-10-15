public class Collectible implements Item{
    private String description;
    private String condition;
    
    @Override
    public void setAttributes() {
        try{
            System.out.println("Please enter the details for your collectible: ");
            System.out.print("Description: ");
            this.description = Menu.input.nextLine();
            System.out.print("Condition: ");
            this.condition = Menu.input.nextLine();
        } catch (Exception e){
            System.out.println("invalid input");
        }
    }

    @Override
    public void printAttributes() {
        System.out.println("collectible");
        System.out.println("Description: " + this.description);
        System.out.println("Condition: " + this.condition);
    }

    @Override
    public String[][] getFileAttributes() {
        String[][] attributes = new String[2][2];
        String[] desc = {"collect_desc",this.description};
        String[] cond = {"collect_cond",this.condition};

        attributes[0] = desc;
        attributes[1] = cond;
        return attributes;
    }
}
