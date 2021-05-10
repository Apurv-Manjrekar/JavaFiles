public class PasswordGenerator{
    private int numChars;
    String prefix;
    private String password;
    private int numPWGen;
    public PasswordGenerator(int n, String p)
    {
        numChars = n;
        prefix = p;     
    }

    public PasswordGenerator(int n)
    {          
        numChars = n;
        prefix = "A";     
    }

    public String pwGen()
    {
        password = prefix;
        for(int i = 0; i < numChars; i++)
        {
            password = password + (int) (Math.random() * 10);
        }
        numPWGen++;
        return password;
    }

    public int pwCount()
    {
        return numPWGen;
    }
}