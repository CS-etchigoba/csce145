/*
 * Everlast Chigoba
 */
public class Wheel {
    private double diameter; // Must be between 16 and 55
    private double width;    // Must be between 1 and 2.5

    // Default constructor
    public Wheel() {
        this.diameter = 16;
        this.width = 1;
    }
    // Parameterized constructor 
    public Wheel(double diameter, double width) {
        this.diameter = (diameter >= 16 && diameter <= 55) ? diameter : 16;
        this.width = (width >= 1 && width <= 2.5) ? width : 1;
    }

    // Accessors and mutators 
    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = (diameter >= 16 && diameter <= 55) ? diameter : 16;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width >= 1 && width <= 2.5) ? width : 1;
    }

    // Equals method
    public boolean equals(Wheel other) {
        return this.diameter == other.diameter && this.width == other.width;
    }

    // toString method
    public String toString() {
        return "[Wheel] Diameter: " + diameter + " Width: " + width;
    }
   }

