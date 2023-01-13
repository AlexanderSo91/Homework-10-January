public class Transport {

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private String maxSpeed;

    private static final String DEFAULT_VALUE = "default";


    public Transport(String brand, String model, int year, String country, String color, String max, String maxSpeed) {

        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = brand;
        }
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxSpeed = maxSpeed;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = DEFAULT_VALUE;
        } else {
            this.color = color;
        }
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        if (maxSpeed == null || maxSpeed.isBlank()) {
            this.maxSpeed = DEFAULT_VALUE;
        } else {
            this.maxSpeed = maxSpeed;
        }


    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }
}









