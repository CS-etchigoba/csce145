/*
 * Everlast Chigoba
 */
public class Bicycle {
    private String make;      // Represents the maker, default "none"
    private Wheel frontWheel; // Front wheel of bicycle
    private Wheel backWheel;  // Back wheel of bicycle
    private Frame frame;      // Frame of bicycle

    // Default constructor
    public Bicycle() {
        this.make = "none";
        this.frontWheel = new Wheel();
        this.backWheel = new Wheel();
        this.frame = new Frame();
    }

    // Parameterized constructor 
    public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame) {
        this.make = (make != null) ? make : "none";
        this.frontWheel = (frontWheel != null) ? frontWheel : new Wheel();
        this.backWheel = (backWheel != null) ? backWheel : new Wheel();
        this.frame = (frame != null) ? frame : new Frame();
    }

    // Accessors and mutators 
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = (make != null) ? make : "none";
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public void setFrontWheel(Wheel frontWheel) {
        this.frontWheel = (frontWheel != null) ? frontWheel : new Wheel();
    }

    public Wheel getBackWheel() {
        return backWheel;
    }

    public void setBackWheel(Wheel backWheel) {
        this.backWheel = (backWheel != null) ? backWheel : new Wheel();
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = (frame != null) ? frame : new Frame();
    }

    // Equals method 
    public boolean equals(Bicycle other) {
        return this.make.equalsIgnoreCase(other.make)
                && this.frontWheel.equals(other.frontWheel)
                && this.backWheel.equals(other.backWheel)
                && this.frame.equals(other.frame);
    }

    // toString method
    public String toString() {
        return "[Bicycle] Make: " + make + " Front Wheel: " + frontWheel.toString() 
                + " Back Wheel: " + backWheel.toString() + " Frame: " + frame.toString();
    }
}


