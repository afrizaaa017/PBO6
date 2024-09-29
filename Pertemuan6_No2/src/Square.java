public class Square extends Rectangle {
    public Square() {
        super(); 
    }

    public Square(double side) {
        super(side, side); 
    }

    public double getSide(){
        return getWidth(); 
    }

    // Override metode toString
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() 
        + ", which is a subclass of " + super.toString();
    }
}


// public Square(double side, String color, boolean filling) {
//     super(side, side, color, filling); // Memanggil konstruktor Rectangle dengan lebar, panjang, warna, dan filling
// }

// // Override metode setLength untuk menjaga bentuk persegi
// @Override
// public void setLength(double side) {
//     super.setLength(side);
//     super.setWidth(side); // Set both width and length to keep square shape
// }

// // Override metode setWidth untuk menjaga bentuk persegi
// @Override
// public void setWidth(double side) {
//     super.setWidth(side);
//     super.setLength(side); // Set both width and length to keep square shape
// }
