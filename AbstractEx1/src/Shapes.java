public abstract class Shapes {
    //abstract classes never have objects

    protected int a, b, c;
    protected int r;
    protected double area = 0;
    protected  double perimeter = 0;



    protected String name;

    //but they will have constructors
    public Shapes(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Shapes(int r) {
        this.r = r;
    }

    public Shapes(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //the child class will not work except you define the
    // body in the child class
    public abstract double CalcArea();
    public abstract double CalcPerimeter();

    //you don't have to re write this in the child
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
