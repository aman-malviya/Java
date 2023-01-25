public class Main{
    public static void main(String[] args) {
        /*
         * In java
         * Strings are immutable
         */

        String s="";
        s+="I am Aman Malviya.";
        s+=" ";
        s+="I am a programmer";
        System.out.println(s);
        /*
         * As string "s" is immutable each time we append something to it
         * we create a new string which is inefficient 
         * 
         * That's where StringBuilder comes into play.
         */
    
        StringBuilder sb=new StringBuilder();
        sb.append("I am not Aman Malviya.");
        sb.append(" ");
        sb.append("I am not a programmer");

        System.out.println(sb.toString());

        /*
         * StringBuilder modifies the same string so copy of string is not created again and again.
         * Hence it is more efficient.
         * 
         * The append method returns the reference to the original string.
         */

        StringBuilder sb2=new StringBuilder();
        sb2.append("Hi")
        .append(" ")
        .append("My name is Aman Malviya.")
        .append(" ")
        .append("Bye.");

        System.out.println(sb2.toString());

        /*
         * StringBuffer is thread safe version of StringBuilder.
         * It is more safe with multithreading.
         */

    }
}