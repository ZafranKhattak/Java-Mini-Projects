class Box {
    double length;
    double width;

    Box(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        System.out.print("The area of rectange is ... ");
        return length * width;
    }

    public static void main(String[] args) {

        Box box = new Box(3.4, 2.8);
        System.out.print(box.area());

        Box box2 = box;
        box2.length = 4.2;
        box2.width = 3;
        System.out.println("\n==============================");
        System.out.println(box2.area());
        System.out.println("\n==============================");

        System.out.print(box.area());

    }
}