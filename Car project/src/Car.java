
public class Car {
    private final String MAKE;
    private final String MODEL;
    private final int YEAR;
    private final double TANK_SIZE;
    private final double FUEL_ECONOMY;
    private final double OPTIMAL_SPEED;
    
    private double odometer;
    private double tripeOdometer;
    private String color;
    private double fuelLevel;
    
    private double speed;
    private double distance;
    
    
    public Car(){
    this.MAKE = "Nissan";
    this.MODEL = "Datsun 240z";
    this.color = "Black";
    this.YEAR = 1970;
    this.TANK_SIZE = getRandom(8, 35);
    this.FUEL_ECONOMY = getRandom(15, 55);
    this.OPTIMAL_SPEED = getRandom(45, 65);
    this.odometer = getRandom(0.0, 6.00);
    this.tripeOdometer = 0.0;
    this.fuelLevel = 0;
    this.speed = OPTIMAL_SPEED;
    }
    
    
    public Car(String MAKE, String MODEL, String color, int YEAR, double TANK_SIZE, double FUEL_ECONOMY, double OPTIMAL_SPEED) {
    this.MAKE = MAKE;
    this.MODEL = MODEL;
    this.color = color;
    this.YEAR = YEAR;
    this.TANK_SIZE = TANK_SIZE;
    this.FUEL_ECONOMY = FUEL_ECONOMY;
    this.OPTIMAL_SPEED = OPTIMAL_SPEED;
    this.odometer = getRandom(0.0, 6.00);
    this.tripeOdometer = 0.0;
    this.fuelLevel = 0;
    this.speed = OPTIMAL_SPEED;
    }
    
    
    public Car(Car c) {
    this.MAKE = c.MAKE;
    this.MODEL = c.MODEL;
    this.color = c.color;
    this.YEAR = c.YEAR;
    this.TANK_SIZE = c.TANK_SIZE;
    this.FUEL_ECONOMY = c.FUEL_ECONOMY;
    this.OPTIMAL_SPEED = c.OPTIMAL_SPEED;
    this.odometer = c.odometer;
    this.tripeOdometer = c.tripeOdometer;
    this.fuelLevel = c.fuelLevel;
    this.speed = c.speed;
    this.distance = c.distance;
    }
    
    
    private double getRandom(double low, double high) {
    double value = Math.random()*(high - low)+low;
    return value;
    }
    

    public double fillTank(double fuel){
    double remainingFuel = fuel - (this.TANK_SIZE-this.fuelLevel);
    if(remainingFuel<=0)
    this.fuelLevel += fuel;
    else
    this.fuelLevel = this.TANK_SIZE;
    return remainingFuel;
    }
    
    @Override
    public String toString() {
    return YEAR +" "+color+" "+MAKE+" "+MODEL;
    }
    
    
    public boolean equals(Car c){
    return this.YEAR==c.YEAR && this.MAKE.equals(c.MAKE) && this.MODEL.equals(c.MODEL);
    }
    
    
    public boolean driveCar(){
    double drivableDistance = this.fuelLevel*this.FUEL_ECONOMY;
    if(this.distance<=drivableDistance){
    this.odometer += this.distance;
    this.tripeOdometer += this.distance;
    double fuelUsed = this.distance*this.FUEL_ECONOMY;
    this.fuelLevel -= fuelUsed;
    return true;
    }
    this.odometer += drivableDistance;
    this.tripeOdometer += drivableDistance;
    this.fuelLevel = 0.0;
    return false;
    }
    
    
    public double getTripOdometer(){
    return Math.round(tripeOdometer);
    }
    
    public void clearTripOdometer(){
    this.tripeOdometer = 0.0;
    }
    
    public double getOdometer(){
    return Math.round(odometer);
    }
    
    public double getFuelLevel() {
    return Math.round(fuelLevel);
    }
    
    public double getFuelTankSize() {
    return Math.round(TANK_SIZE);
    }
    
    // method to set trip
    public void setUpTrip(double distance, double speed){
    this.speed = speed;
    this.distance = distance;
    }
    
    }