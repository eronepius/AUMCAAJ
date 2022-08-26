public class ExceptionHandling {
    public static void main(String args[]) {
        System.out.println("\nArithmetic Exception");
        try {
            int data = 100 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("Exception Occured : \n" + e);
        }

        System.out.println("\nNull Pointer Exception");
        try {
            String S = null;
            System.out.println(S.length());
        } catch (NullPointerException e) {
            System.out.println("Exception Occured : \n" + e);
        }

        System.out.println("\nArray Out of Bound Exception");
        try {
            int myarr[] = new int[5];
            myarr[10] = 200;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Occured : \n" + e);
        }
    }

}
