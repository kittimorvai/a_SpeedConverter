
public class SpeedConverter {

    public static void main(String[]args){

        long firstExercise = toMilesPerHour(178.34d);
        System.out.println(firstExercise);
        printConversion(178.34d);


    }

    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609d);
        }
    }

    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour <0){
            System.out.println("Invalid Value");
        } else if(kilometersPerHour >= 0){
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println( kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

}


