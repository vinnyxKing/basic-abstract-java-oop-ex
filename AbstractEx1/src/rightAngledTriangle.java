public class rightAngledTriangle extends Shapes{

    // the height and base are only valid in the constructors
    //the only values that will be accepted for calculations
    // will be "a" "b" and "c"

    public rightAngledTriangle(int height, int base, int hypo) {
        super(height, base, hypo);
    }

    @Override
    public double CalcArea() {
        double area = 0.5 * (b * a);
        return area;
    }

    @Override
    public double CalcPerimeter() {
        double perimeter = a + b + c;

        return perimeter;
    }
}
