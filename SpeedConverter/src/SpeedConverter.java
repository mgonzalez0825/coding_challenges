
    public class SpeedConverter {


        public static long toMilesPerHour(double kilometersPerHour){

            if (kilometersPerHour < 0) {
                return -1;
            }
            else {
                long milesPerHour = Math.round(kilometersPerHour / 1.609);
                return milesPerHour;
            }
        }


        public void printConversion(double kilometersPerHour){ // since this method is not made static you need to instantiate the class SpeedConverter to acces it

            if (kilometersPerHour < 0){
                System.out.println("Invalid Value");
            } else  {
                long milesPerHour = toMilesPerHour(kilometersPerHour) ;
                System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h ");
            }

        }

    }
