public class Variables {
    public static void main(String[] args) {
        String carBrand = "Volvo";
        String carModel = "XC 60";

        System.out.println("I bought a car brand: " + carBrand);
        System.out.println("It is the model: " + carModel);

        // overwrite
        carModel = "XC 60 facelift";

        System.out.println("I bought a car brand: " + carBrand);
        System.out.println("It is the model: " + carModel);

        // declaration
        String first_name;
        String last_name;
        // initialization
        first_name = "Bogdan";
        last_name = "Sandu";

        int age = 43;
        // string concatenation
        System.out.println(first_name + " " + last_name + " age " + age);
    }
}
