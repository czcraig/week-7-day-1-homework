public abstract class Stalls  {

    private String name;
    private String ownership;
    private String parkingSpace;

    public Stalls(String name, String ownership, String parkingspace){
        this.name = name;
        this.ownership = ownership;
        this.parkingSpace = parkingspace;
    }

    public String getName(){
        return name;
    }

    public String getOwnership(){
        return ownership;
    }

    public String getParkingSpace(){
        return parkingSpace;
    }


}
