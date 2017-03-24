/**
 * Created by Mihnea on 22.03.2017.
 */
public class PoorDogTestDrive {
    public static void main(String[] args) {
        PoorDog one = new PoorDog(25, "Billy", "Labrador");
        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is " + one.getName());
        System.out.println("Dog race is " +one.getRaceType());
    }

}
