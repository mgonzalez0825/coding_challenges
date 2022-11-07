public class Main {

        public static boolean isCatPlaying(boolean summer,int temperature){
            if (25 <= temperature && temperature <= 35 && !summer){
                return true;
            }else if(25 <= temperature && temperature <= 45 && summer) return true;
        else return false;
        }


    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,45));
    }
}
