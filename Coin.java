public class Coin implements Item {
    private String description;
    private String grade;
    private int year;
    
    @Override
    public void setAttributes() {
        try{
            System.out.println("Please enter the details of your coin: ");
            System.out.print("Description: ");
            this.description = Menu.input.nextLine();
            System.out.print("Grade: ");
            this.grade = Menu.input.nextLine();
            System.out.print("Year: ");
            this.year = Menu.input.nextInt();
        } catch (Exception e) {
            System.out.println("invalid input");
        }
    }

    @Override
    public void printAttributes() {
        System.out.println("coin");
        System.out.println("Description: " + this.description);
        System.out.println("Grade: " + this.grade);
        System.out.println("Year: " + this.year);
    }

    @Override
    public String[][] getFileAttributes() {
        String[][] attributes = new String[3][2];
        String[] desc = {"coin_desc",this.description};
        String[] grade = {"coin_grade",this.grade};
        String[] year = {"coin_year",String.valueOf(this.year)};
        
        attributes[0] = desc;
        attributes[1] = grade;
        attributes[2] = year;
        return attributes;
    }
}
