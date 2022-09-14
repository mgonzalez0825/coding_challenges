public class Main {
    public static void main(String[] args) {

        getDurationString(58,56);
        getDurationString(45);
    }



    public static void getDurationString(int minutes, int seconds){
        if (minutes >=0 && seconds>=0 || seconds<=59){
            int hours = minutes/60;

            int minutesRemaining = minutes % 60;
            if (minutesRemaining < 1) minutesRemaining = 0;

            System.out.println(hours + "h " + minutesRemaining + "m " + seconds + "s");
        }else System.out.println("Invalid value");
    }

    public static void getDurationString(int seconds){
        if ( seconds>=0){

            int minutes = seconds/60 ;
            int secondsRemaining = seconds % 60;

            if (secondsRemaining < 1) secondsRemaining = 0;

            System.out.println(minutes + "m " + secondsRemaining + "s");
        }else System.out.println("Invalid value");
    }
}







