import java.lang.Math;

public class volume_of_earth {
    public static void main(String[] args) {
        // Initialising variables.

        // Volume of Earth in kilometers.
        double volKm = (4 * Math.PI * Math.pow(6378 , 3)) / 3;
        // Volume of Earth in miles.
        double volMiles = volKm * 0.621371;

        System.out.println("The volume of earth in cubic kilometers is: " + volKm + " and in cubic miles is: " + volMiles );
    }
}
