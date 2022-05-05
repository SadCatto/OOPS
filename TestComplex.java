public class TestComplex {

  public static void main(String args[]) {
    ComplexNumber c1 = new ComplexNumber(3, 4);
    ComplexNumber c2 = new ComplexNumber();
    ComplexNumber sum;
    c2.setImg(2);
    c2.setReal(5);
    System.out.println("real c1: " + c1.getReal());
    System.out.println("img c1: " + c1.getImg());
    System.out.println("real c2: " + c2.getReal());
    System.out.println("img c2: " + c2.getImg());
    sum = c1.add(c2);
    System.out.println("real sum : " + sum.getReal());
    System.out.println("img sum : " + sum.getImg());
  }
}
