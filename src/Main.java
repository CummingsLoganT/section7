public class Main {
    public static void main(String[] args) {
        String[] parts = { "tires" , "keys" };


        Car[] cars = new Car[] {

            new Car ("nissan" , 5000 , 2020 , "red" , new String[] { "tires" , "keys" }),
            new Car ("dodge" , 8500 , 2019 , "blue" , new String[] { "tires" , "keys" }),
            new Car ("nissan" , 5000 , 2017 , "yellow" , new String[] { "tires" , "keys" })

        };

        Dealership dealership = new Dealership();

        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i] , i);
        }

        dealership.sell(2);
        System.out.println(dealership.search("Dodge" , 8000));


        System.out.println(dealership.getCar(0));

    }
}
