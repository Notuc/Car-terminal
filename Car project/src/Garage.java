import java.util.Scanner;

public class Garage {
    Scanner scnr = new Scanner(System.in);
    int size = scnr.nextInt();
    Car[] garage = new Car[size];
    
    

    Garage()
    {
        garage=new Car[size];
    }
    public void parking()
    {
        int[] parkingSize = new int[size];
        System.out.println(parkingSize);
    }
    public void add(Car c)
    {
        if(isFull())
        {
            Car[] new_Garage=new Car[size*2];
            System.arraycopy(garage,0,new_Garage,0,size);
            garage=new_Garage;
        }
        for(int i=0;i<garage.length;i++)
        {
            if(garage[i]!=null)
                continue;
            else {
                garage[i] = c;
                size++;
            }
        }
    }
    public void addNew(String MAKE, String MODEL, String color, int YEAR, double TANK_SIZE, double FUEL_ECONOMY, double OPTIMAL_SPEED)
    {
        if(isFull())
        {
            Car[] new_Garage=new Car[size*2];
            System.arraycopy(garage,0,new_Garage,0,size);
            garage=new_Garage;
        }
        for(int i=0;i<garage.length;i++)
        {
            if(garage[i]!=null)
                continue;
            else {
                
                size++;
            }
        }
    }
    public void remove(Car c)
    {
        if(isFull())
        {
            Car[] new_Garage=new Car[size*2];
            System.arraycopy(garage,0,new_Garage,0,size);
            garage=new_Garage;
        }
        for(int i=0;i<garage.length;i++)
        {
            if(garage[i]!=null)
                continue;
            else {
                garage[i] = c;
                size++;
            }
        }
    }
    
    public boolean isFull()
    {
        if(garage.length==size)
            return true;
        else
            return false;

    }
}
