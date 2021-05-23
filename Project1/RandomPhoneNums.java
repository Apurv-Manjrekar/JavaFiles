public class RandomPhoneNums{ 
    public static void main(){

        int amtPhoneNums = 0;

        while(amtPhoneNums < 10){
            int firstDigit = (int) (Math.random() * 7) + 1;
            int secondDigit = (int) (Math.random() * 7) + 1;
            int thirdDigit = (int) (Math.random() * 7) + 1;

            String firstThreeDigits = "" + firstDigit + secondDigit + thirdDigit;

            int secondThreeDigits = (int) (Math.random() * 742) + 1; 
            PhoneNums digit3 = new PhoneNums(secondThreeDigits);
            
            int lastFourDigits = (int) (Math.random() * 9999) + 1;
            PhoneNums digit4 = new PhoneNums(4, lastFourDigits);
            
            System.out.println(firstThreeDigits + "-" + digit3.threeDigitCheck() + "-" + digit4.fourDigitCheck());

            amtPhoneNums++;

        }
    }
}