import java.util.*;

public class FinalVariable {
    // Final instance variable
    final int ROLLNO;

    // Initializer block for the final instance variable
    {
        ROLLNO = 101; 
    }

    // Final static variable
    static final int FINALSTATICNUMBER;
    
    // Static initializer block for final static variable
    static {
        FINALSTATICNUMBER = 11;  
    }

    public static void main(String[] args) {
        // Final local variable
        final int LOCALFINALNUMBER = 10;
        System.out.println("Local final: " + LOCALFINALNUMBER);
        
        // Final instance variable cannot be changed
        FinalVariable FV = new FinalVariable();
        System.out.println("Final Instance: " + FV.ROLLNO);

        // Final static variable (cannot be changed after initialization)
        System.out.println("Static final: " + FINALSTATICNUMBER);

        // Final reference variable (can change internal state, but reference cannot be reassigned)
        final int ARR[] = new int[]{1, 2, 3, 4, 5};
        ARR[4] = 100;  // Modifying an element of the final array
        System.out.println("Final reference: " + Arrays.toString(ARR));
    }
}