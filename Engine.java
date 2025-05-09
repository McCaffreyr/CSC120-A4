public class Engine implements EngineRequirements{

    //Attributes
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**Constructor for Engine class
     * @param f Engine's fuel type
     * @param currentFualLevel Engine's current fuel level
     * @param maxFuelLevel Engine's max fuel level
     */
    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel){
        this.f = f;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }
    /**
     * Gives fuel type
     * @return Engine's fuel type
     */
    public FuelType getFuelType() {
        return this.f;
    }

    /**
     * Gives max fuel level
     * @return Engine's max fuel level
     */
    public double getMaxFuel(){
        return this.maxFuelLevel;
    }

    /**
     * Gives current fuel level
     * @return Engine's current fuel level
     */
    public double getCurrentFuel(){
        return this.currentFuelLevel;
    }

    /**
     * Resets the Engine's fuel level to the max level
     */
    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;
    }

    /**
     * Subtracts 5 fuel points from the train
     * @return T/F if the train can go or if it's out of fuel
     */
    public Boolean go(){
        if (this.currentFuelLevel >= 5){
            this.currentFuelLevel -= 5;
            return true;
        }else{
            this.currentFuelLevel = 0;
            System.out.println("There's no more fuel in the engine:(");
            return false;
        }
    }

    /**
     * Gives info about Engine
     * @return info about engine
     */
    public String toString(){
        return ("Engine has fuel type: " + this.f + " current fuel level: " + 
        this.currentFuelLevel + " and max fuel level: " + this.maxFuelLevel);
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0., 100.);
        System.out.println(myEngine);

        Engine otherEngine = new Engine(FuelType.STEAM, 50., 100.);
        System.out.println(otherEngine);
        otherEngine.refuel();
        System.out.println(otherEngine);
    }


}
