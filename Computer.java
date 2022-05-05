class Computer {
  float price;
  String company;
  int ram;
  Monitor m;

  Computer() {}

  Computer(float price, String company, Monitor m, int ram) {
    this.price = price;
    this.company = company;
    this.ram = ram;
    this.m = m;
  }

  void setCompany(String company) {
    this.company = company;
  }

  void setM(Monitor m) {
    this.m = m;
  }

  void setPrice(float price) {
    this.price = price;
  }

  void setRam(int ram) {
    this.ram = ram;
  }

  String getCompany() {
    return company;
  }

  Monitor getM() {
    return m;
  }

  float getPrice() {
    return price;
  }

  int getRam() {
    return ram;
  }
}
