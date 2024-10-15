public class Book implements Item{
    private String title;
    private String author;
    private int year;
    private String condition;

    @Override
    public void setAttributes() {
        try{
            System.out.println("Please enter the details of your book: ");
            System.out.print("Title: ");
            this.title = Menu.input.nextLine();
            System.out.print("Author: ");
            this.author = Menu.input.nextLine();
            System.out.print("Condition: ");
            this.condition = Menu.input.nextLine();
            System.out.print("Year published: ");
            this.year = Menu.input.nextInt();
        } catch (Exception e) {
            System.out.println("invalid input");
        }
    }

    @Override
    public void printAttributes() {
        System.out.println("book");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year published: " + this.year);
        System.out.println("Condition: " + this.condition);
    }

    @Override
    public String[][] getFileAttributes() {
        String[][] attributes = new String[4][2];
        String[] title = {"book_title",this.title};
        String[] author = {"book_author",this.author};
        String[] year = {"book_year",String.valueOf(this.year)};
        String[] cond = {"book_cond",this.condition};

        attributes[0] = title;
        attributes[1] = author;
        attributes[2] = year;
        attributes[3] = cond;
        return attributes;
    }
}
