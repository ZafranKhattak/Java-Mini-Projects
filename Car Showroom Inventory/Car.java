class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display() {
        System.out.print("Car Brand: " + brand +
                "\n" + "Model: " + model + "\n" +
                "Year: " + year + "\n" +
                "Price: " + price);
    }

    double getPrice() {
        return price;
    }

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "I8", 2025, 120000);
        car1.display();
        System.out.println("\n============================================");

        Car car2 = new Car("Toyota", "Supra", 2024, 155000);
        car2.display();
        System.out.println("\n============================================");

        Car car3 = new Car("Audi", "A8", 2025, 90000);
        car3.display();
        System.out.println("\n============================================");

        System.out.println(car1.getPrice());
        System.out.println("\n============================================");

        if (car1.getPrice() > car2.getPrice() && car1.getPrice() > car3.getPrice()) {
            System.out.println("The Following car has the highest price...");
            car1.display();
        } else if (car2.getPrice() > car1.getPrice() && car2.getPrice() > car3.getPrice()) {
            System.out.println("The Following car has the highest price...");
            car2.display();
        } else if (car3.getPrice() > car1.getPrice() && car3.getPrice() > car2.getPrice()) {
            System.out.println("The Following car has the highest price...");
            car3.display();
        } else {
            System.out.println("All cars have the same price");
        }
    }
}