public class Main{
    public static void main(String[] args) {
        /*
         * printf(): An optional method to control, format, and display text to the console window
         *           Takes two arguments: i) format string  ii) object/variable/value
         *           % [flags] [precision] [width] [conversion-character]
         */


        boolean a=true;
        char b='@';
        int c=40;
        double d=-3.14;
        String e="Aman";

        System.out.printf("%b is boolean\n", a);
        System.out.printf("%c is character\n", b);
        System.out.printf("%d is decimal number\n", c);
        System.out.printf("%s is string\n", e);
        System.out.printf("%f is double\n", d);

        /*
         * Width
         * Minimum number of characters to be written as output
         */
        System.out.printf("Hello %10s!\n", e);
        System.out.printf("Hello %-10s!\n", e);

        /*
         * Precision
         * Sets number of digits of precision when outputting floating point numbers
         */
        System.out.printf("Balance is %+.1f only\n", d);

        /*
         * Flags
         * Adds an effect to output based on the flag added to the format specifier
         * 
         * - : left justify
         * + : output a plus or a minus sign fr numeric value
         * 0 : numeric values are zero padded
         * , : comma grouping separator if numbers > 1000
         */

        System.out.printf("%,d is comma separated integer.\n", 5673524);
        System.out.printf("%010d is zero padded.\n", 342);
    }
}