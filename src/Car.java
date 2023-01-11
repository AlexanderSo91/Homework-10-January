public class Car extends Transport {

    public final String brand;
    public final String model;
    private final int year;
    private String country;
    public String color;
    public String maxSpeed;

    public Car() {
        super(brand,model,year,country,color,maxSpeed);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = color;
        } else {
            this.color = color;
        }
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        if (maxSpeed == null || maxSpeed.isEmpty()) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}



