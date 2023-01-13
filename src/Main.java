public class Main {
    public static void main(String[] args) {
        Transport myCar1 = new Transport("vw","Tiguan", 2017, "Германия","белый","120", "120");
        Car mCar = new Car("mercedes", "Sprinter", 2017, "Германия", "белый", "120", "120", "auto", "sedan", "234", 5);
        Transport myCar2 = new Transport("mercedes","Sprinter", 2017, "Германия","белый","120", "120");
        Transport myCar3 = new Transport("vw","Transporter", 2017, "Германия","белый","120","120");

        System.out.println(myCar1);
        System.out.println(mCar);
        System.out.println(myCar2);
        System.out.println(myCar3);



    }
}
