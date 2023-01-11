public class Transport {
    public static void main(String[] args) {

    }

    public final String brand;
    public final String model;
    private final int year;
    private String country;
    public String color;
    public String maxSpeed;

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
        this.color = color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public Transport(String brand, String model, int year, String country, String color, String max, String maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        if (color == null || color.isEmpty()) {
            this.color = color;
        } else {
            this.color = color;
        }
        if (maxSpeed == null || maxSpeed.isEmpty()) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }


}







