// Create an abstract class.
abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    // A default constructer
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    // Parameterized constructer.
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    //construct object with equal width and height.
    TwoDShape(double x, String n) {
        width = x;
        name = n;
    }
    
    // Construct an object from an object
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    String getName() { return name; }

    void showDim() {
        System.out.println("Width and height are " + 
                width + " and " + height);
    }

    // Now, area() is abstract.
    abstract double area();
}

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
    private String style;
    
    // A default consrtucter.
    Triangle() {
        super();
        style = "none";
    }

    // Constructor for Triangle.
    Triangle(String s, double w, double h) {
        super(w, h, "Triagle");

        style = s;
    }

    // One aurgument constructer.
    Triangle(double x) {
        super(x, "triangle"); // call superclass constructor

        style = "filled";
    }

    // Construct an object from an object
    Triangle(Triangle ob) {
        super(ob); // pass object to TwoShape constructor
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

// A subclass of TwoDShape for rectangles.
class Rectangle extends TwoDShape {
    // A default constructor.
    Rectangle() {
        super();
    }

    // Constuctor for Rectangle.
    Rectangle(double w, double h) {
        super(w, h, "rectangle"); // call superclass constructer
    }

    // Constuctor for square.
    Rectangle(double x) {
        super(x, "rectangle"); // call superclass constructer
    }

    // Construct an object from an object.
    Rectangle(Rectangle ob) {
        super(ob); // pass object to TwoDShape constructor
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}

class AbsShape {
    public static void main(String[] args) {
        TwoDShape[] shapes = new TwoDShape[4];

        shapes[0] = new Triangle("outline", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7.0);

        for (int i=0; i < shapes.length; i++) {
            System.out.println("object is " +
                                shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());

            System.out.println();
        }
    }
}
        
