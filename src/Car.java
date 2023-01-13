public class Car extends Transport {

    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int seatsCount;

    private static final String DEFAULT_VALUE = "default";

    public Car(String brand, String model, int year, String country, String color, String max, String maxSpeed, String transmission, String bodyType, String registrationNumber, int seatsCount) {
        super(brand, model, year, country, color, max, maxSpeed);
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.seatsCount = seatsCount;
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void setSeatsCount(int seatsCount) {
        this.seatsCount = seatsCount;
    }
}



