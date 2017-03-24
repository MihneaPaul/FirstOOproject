/**
 * Created by Mihnea on 22.03.2017.
 */
public class PoorDog {
    private int size; //first value stored in the PoorDog object
    private String name; //second value stored in the PoorDog object
    private String raceType;

    public PoorDog(){
    }

    public PoorDog(int sizex, String namex){
        this.size = sizex;
        this.name = namex;
    }


    public PoorDog(int sizex, String namex, String raceTypex){
        this.size = sizex;
        this.name = namex;
        this.raceType = raceTypex;
    }

    public int getSize() //this is the function that tells the object the 'INSTRUCTIONS' of how to get the value size out from the object to the user

    {
        return size;
    }

    public String getName()

    {

        return name; //this is the function that tells the object the 'INSTRUCTIONS' of how to get the value name out from the object to the user
    }
}



