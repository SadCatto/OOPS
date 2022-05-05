public class TestComputer {

  public static void main(String args[]) {
    Monitor m = new Monitor("Apple", 23, "mac", 100000);
    Computer c = new Computer(150000, "Apple", m, 16);

    System.out.println("The price of Monitor is :" + c.m.getPrice());
    System.out.println("The size of Monitor is : " + c.m.getSize());
  }
}
