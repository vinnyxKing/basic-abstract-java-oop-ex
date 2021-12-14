public class rectangle extends Shapes{

    public rectangle(int l, int b) {
        super(l, b);
    }

    @Override
    public double CalcArea() {
       double area = a*b;
       return area;
    }

    @Override
    public double CalcPerimeter() {
        double perimeter = 2*(a+b);
        return perimeter;
    }
}
