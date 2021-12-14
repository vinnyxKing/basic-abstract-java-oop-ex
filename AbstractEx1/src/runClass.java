public class runClass {

    public static void main(String[] args) {

          circle c1 = new circle(5);
          rectangle r2 = new rectangle(6,7);
          rightAngledTriangle rr2 = new rightAngledTriangle(2,3,4);

          c1.setName("Circle");
          r2.setName("Rectangle");
          rr2.setName("RightAngleTriangle");

          Shapes [] shapearr ={c1,r2,rr2};
          
          for (Shapes eachShape : shapearr){
              System.out.println("Shape name : " + eachShape.getName());
              System.out.println("Shape Area : " + eachShape.CalcArea());
              System.out.println("Shape Perimeter : " + eachShape.CalcPerimeter());
              System.out.println("\n");

          }


    }

}
