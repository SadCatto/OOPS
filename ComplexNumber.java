class ComplexNumber {
  int real;
  int img;

  ComplexNumber() {}

  ComplexNumber(int real, int img) {
    this.real = real;
    this.img = img;
  }

  int getReal() {
    return real;
  }

  int getImg() {
    return img;
  }

  void setReal(int real) {
    this.real = real;
  }

  void setImg(int img) {
    this.img = img;
  }

  ComplexNumber add(ComplexNumber c1) {
    ComplexNumber result = new ComplexNumber(
      (c1.real + this.real),
      (c1.img + this.img)
    );
    return result;
  }
}
