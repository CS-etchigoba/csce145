//Everlast Chigoba
public class Apple {
    // Instance Variables
    private String type;
    private double weight;
    private double price;

    // Default Constructor
    public Apple() {
        this.type = "Gala";
        this.weight = 0.0;
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Apple(String type, double weight, double price) {
        setType(type);
        setWeight(weight);
        setPrice(price);
    }

    // Accessors
    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    // Mutators
    public void setType(String type) {
        if (type != null && (type.equals("Red Delicious") || type.equals("Golden Delicious") || type.equals("Gala") || type.equals("Granny Smith"))) {
            this.type = type;
        } else {
            this.type = "Gala";
        }
    }

    public void setWeight(double weight) {
        if (weight >= 0.0 && weight <= 2.0) {
            this.weight = weight;
        } else {
            this.weight = 0.0;
        }
    }

    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    // toString method
    public String toString() {
        return "Type: " + type + " Weight: " + weight + " Price: " + price;
    }

    // equals method
    public boolean equals(Apple otherApple) {
        return this.type.equals(otherApple.type) &&
                this.weight == otherApple.weight &&
                this.price == otherApple.price;
    }
}

