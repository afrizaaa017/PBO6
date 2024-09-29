public class Shape {
    private String color;
    private boolean filling;

    public Shape() {
        this.color = "green";
        this.filling = true;
    }

    public Shape(String color, boolean filling) {
        this.color = color;
        this.filling = filling;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilling() {
        return filling;
    }

    public void setFilling(boolean filling) {
        this.filling = filling;
    }


    @Override
    public String toString() {
        return "Shape With Color of " + color + " and " 
        + (filling ? "filling" : "Not filling");
    }
}

