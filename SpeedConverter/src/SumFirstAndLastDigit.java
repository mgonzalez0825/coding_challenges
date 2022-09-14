public class sumFirstAndLastDigit {

        public static int addFirstAndLastDigit(int number){
            while(number>=0){

                int temp = number;

                while(temp>=10){
                    temp /= 10;}

                int firstDigit = temp;

                int lastDigit = number % 10;
                int sum = firstDigit + lastDigit;

                return sum;
            } return -1;

        }

}
