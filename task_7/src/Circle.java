class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    // Getter
    public double getR() {
        return r;
    }

    // Setter
    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double TinhDienTich() {
        return Math.PI * r * r;
    }
}
