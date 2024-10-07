public class StringReversal {
    public static void main(String[] args){
        String str = "Hello world";

        // USing string buffer
        System.out.println(new StringBuffer(str).reverse().toString());

        // Using for loop
        String rev = "";
        for(int i=str.length()-1 ; i>=0 ;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);

        // Using for each loop
        for(char ch : str.toCharArray()){
            rev =  ch + rev;
        }
        System.out.println(rev);

        // Using recursion

       
    }
}