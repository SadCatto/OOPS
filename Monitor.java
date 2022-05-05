class Monitor {
  String brand;
  int size;
  String model;
  float price;

  Monitor() {}

  Monitor(String brand, int size, String model, float price) {
    this.brand = brand;
    this.size = size;
    this.model = model;
    this.price = price;
  }

  void setBrand(String brand) {
    this.brand = brand;
  }

  void setModel(String model) {
    this.model = model;
  }

  void setPrice(float price) {
    this.price = price;
  }

  void setSize(int size) {
    this.size = size;
  }

  String getBrand() {
    return brand;
  }

  String getModel() {
    return model;
  }

  float getPrice() {
    return price;
  }

  int getSize() {
    return size;
  }
}
