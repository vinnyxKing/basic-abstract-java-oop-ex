public  class circle extends Shapes {

    private double PI = 3.142;

    public circle(int r) {
        super(r);
    }

    @Override
    public double CalcArea() {
        double area = PI * r * r;
        return area;
    }

    @Override
    public double CalcPerimeter() {
        double perimeter = 2 * PI * r;
        return perimeter;
    }
}
