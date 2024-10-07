package AccessModifiers;

public class Main1 
{
    public int x = 1;

    // Default 
    int display() 
    {
        System.out.println(x);
        return x;
    }

    // protected 
    protected void displayString() 
    {
        String s = "I am a protected string";
        System.out.println(s);
    }

    //private
    @SuppressWarnings("unused")
    private int displayPrivate() {
        int y = 2;
        System.out.println(y);
        return y;
    }
    
    public static void displayPublic() {
        int i = 3;
        System.out.println("The public is accessed and prints the number " + i);
    }

}