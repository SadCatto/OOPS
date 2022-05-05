class Comparer {

  static boolean min(int v1, int v2) {
    if (v1 < v2) {
      return true;
    } else {
      return false;
    }
  }

  static boolean min(float v1, float v2) {
    if (v1 < v2) {
      return true;
    } else {
      return false;
    }
  }

  static boolean min(long v1, long v2) {
    if (v1 < v2) {
      return true;
    } else {
      return false;
    }
  }

  static boolean min(double v1, double v2) {
    if (v1 < v2) {
      return true;
    } else {
      return false;
    }
  }

  static boolean max(int v1, int v2) {
    if (v1 > v2) {
      return true;
    } else {
      return false;
    }
  }
}

class Student {
  String name;
  int rollNo;
  int percentage;

  Student() {}

  Student(String name, int rollNo, int percentage) {
    this.name = name;
    this.rollNo = rollNo;
    this.percentage = percentage;
  }

  void setName(String name) {
    this.name = name;
  }

  void setPercentage(int percentage) {
    this.percentage = percentage;
  }

  void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }

  String getName() {
    return name;
  }

  int getPercentage() {
    return percentage;
  }

  int getRollNo() {
    return rollNo;
  }
}
