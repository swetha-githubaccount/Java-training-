public class StaticInitializerBlock 
{
    static 
    {
        System.out.println("Static block executed.");
    }
    {
        System.out.println("Instance initializer block executed.");
    }
    public static void main(String args[]) {
        System.out.println("Main method executed.");
        new StaticInitializerBlock();
        new StaticInitializerBlock();
    }
}
/*
public class StaticInitializerBlock {
    static int sum;

    static {
        sum = 2 + 4;
    }

    public static void main(String args[]) {
        System.out.println("Sum: " + sum);
    }
}*/