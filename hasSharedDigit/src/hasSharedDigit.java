public class hasSharedDigit {

        public static boolean sharedDigit(int num1,int num2){

            int lastDigit1 = 0;
            int lastDigit2 = 0;

            if( num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99)
            {
                lastDigit1 = num1 % 10;
                lastDigit2 = num2 % 10;
                num1 /= 10;
                num2 /= 10;

                if(lastDigit1 == lastDigit2 || lastDigit1 == num2 || lastDigit2 == num1 || num1 == num2) return true;
                else return false;

            } else return false;
        }
    }

