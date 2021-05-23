public class PhoneNums
{
    // instance variables - replace the example below with your own
    private int middleThreeDigits;
    private int lastFourDigits;

    /**
     * Constructor for objects of class PhoneNums
     */
    public PhoneNums(int num)
    {
        middleThreeDigits = num;
    }
    public PhoneNums(int numChar, int num)
    {
        lastFourDigits = num;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String threeDigitCheck()
    {
        if (middleThreeDigits < 10) {
            return ("00" + middleThreeDigits);
        }
        else if (middleThreeDigits < 100) { 
            return ("0" + middleThreeDigits);
        }
        else return ("" + middleThreeDigits);
    }
    public String fourDigitCheck()
    {
        if (lastFourDigits < 10) {
            return ("000" + lastFourDigits);
        }
        else if (lastFourDigits < 100) { 
            return ("00" + lastFourDigits);
        }
        else if (lastFourDigits < 1000){
            return ("0" + lastFourDigits);
        }
        else return ("" + lastFourDigits);
    }
}
