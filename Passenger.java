public class Passenger implements PassengerRequirements{
    
    public String name;

    /**Constructer for Passenger class
     * @param name Name of passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Adds a passenger to a car if there is room
     * @param c car that the passenger is being added to
     */
    public void boardCar(Car c){
        if (c.addPassenger(this)){
            System.out.println("Passenger added");
        }else{
            System.out.println("Car is full.");
        }
    }

    /**
     * Removes a passenger from a car
     * @param c car that the passenger is leaving
     */
    public void getOffCar(Car c){
        if (c.removePassenger(this)){
            System.out.println("Passenger left car");
        }else{
            System.out.println("This passenger wasn't in this car to begin with.");
        }
    }


}