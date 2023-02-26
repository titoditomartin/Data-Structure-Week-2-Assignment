public class Rectangle extends shape{
    int length;
    int height;

    Rectangle(int length, int height, String color){
        super(color);
        this.length = length;
        this.height = height;
    }

    @Override
    void getArea() {
        int area = length * height;
        System.out.println("The area of the rectangle is " + area);
    }
}
