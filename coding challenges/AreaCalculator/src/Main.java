public class Main {
    public static void main(String[] args) {
        System.out.println(area(3.5));
        System.out.println(area(3.5,4.5));
//
    }


        public static double area(double radius){
            if (radius < 0){
                return -1.0;
            }

            double area = Math.round(radius * radius * Math.PI*100);
            return area/100;
        }


        public static double area(double x , double y) {

            if (x < 0 || y < 0) {
                return -1;
            }

            return x * y ;

        }
    }
