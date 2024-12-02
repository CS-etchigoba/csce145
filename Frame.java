/*
 * Everlast Chigoba
 */
public class Frame {
    private double size;      // Must be between 18.5 and 60
    private String type;      // Can only be "Diamond", "Step-Through", "Truss", or "Penny-Farthing"

    // Default constructor
    public Frame() {
        this.size = 18.5;
        this.type = "Diamond";
    }

    // Parameterized constructor with validation
    public Frame(double size, String type) {
        this.size = (size >= 18.5 && size <= 60) ? size : 18.5;
        this.type = (type != null && (type.equals("Diamond") || type.equals("Step-Through") || type.equals("Truss") || type.equals("Penny-Farthing"))) ? type : "Diamond";
    }

    // Accessors and mutators with validation
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = (size >= 18.5 && size <= 60) ? size : 18.5;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = (type != null && (type.equals("Diamond") || type.equals("Step-Through") || type.equals("Truss") || type.equals("Penny-Farthing"))) ? type : "Diamond";
    }

    // Equals method
    public boolean equals(Frame other) {
        return this.size == other.size && this.type.equals(other.type);
    }

    // toString method
    public String toString() {
        return "[Frame] Size: " + size + " Type: " + type;
    }
}


