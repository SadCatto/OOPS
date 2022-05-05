class TestComparer {

  public static void main(String args[]) {
    int a = 100;
    int b = 150;
    boolean min = Comparer.min(a, b);
    boolean max = Comparer.max(a, b);
    if (min) {
      System.out.println("the minimum number is: " + a);
    } else {
      System.out.println("The minimum number is :" + b);
    }
    if (max) {
      System.out.println("the maximum number is: " + a);
    } else {
      System.out.println("The maximum number is :" + b);
    }

    Student s1 = new Student("Bhushan", 15, 99);
    Student s2 = new Student("Rushi", 58, 75);
    boolean tompar = Comparer.max(s1.percentage, s2.percentage);
    if (tompar) {
      System.out.println("the student with higher percantage is: " + s1.name);
    } else {
      System.out.println("the student with higher percantage is: " + s2.name);
    }
  }
}
