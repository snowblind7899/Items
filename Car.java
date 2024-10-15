public class Car implements Item{
    private String make;
    private String model;
    private int year;
    private int miles;

    @Override
    public void setAttributes() {
        try{
            System.out.println("Please enter the details of your car: ");
            System.out.print("Make: ");
            this.make = Menu.input.nextLine();
            System.out.print("Model: ");
            this.model = Menu.input.nextLine();
            System.out.print("Year manufactured: ");
            this.year = Menu.input.nextInt();
            System.out.print("Miles travelled (odometer): ");
            this.miles = Menu.input.nextInt();
        } catch (Exception e) {
            System.out.println("invalid input");
        }
    }

    @Override
    public void printAttributes() {
        System.out.println("car");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year manufactured: " + this.year);
        System.out.println("Miles travelled (odometer): " + this.miles);
    }

    @Override
    public String[][] getFileAttributes() {
        String[][] attributes = new String[4][2];
        String[] make = {"car_make",this.make};
        String[] model = {"car_model",this.model};
        String[] year = {"car_year",String.valueOf(this.year)};
        String[] miles = {"car_miles",String.valueOf(this.miles)};

        attributes[0] = make;
        attributes[1] = model;
        attributes[2] = year;
        attributes[3] = miles;
        return attributes;
    }
}