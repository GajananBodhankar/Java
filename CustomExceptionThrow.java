// public class CustomExceptionThrow {
// void test() {
// throw new ArithmeticException("Can not divide by zero");
// }
// public static void main(String[] args) {
// CustomExceptionThrow obj = new CustomExceptionThrow();
// try {
// obj.test();
// } catch (Exception e) {
// System.out.println(e.getMessage());
// }
// }
// }

// ************************* */
//Rethrowing an exception 
public class CustomExceptionThrow {

    void test() {
        try {
            throw new ArithmeticException("Can not divide by zero");
        } catch (Exception e) {
            System.out.println("In first catch block");
            throw e;
        }
    }

    public static void main(String[] args) {
        CustomExceptionThrow obj = new CustomExceptionThrow();
        try {
            obj.test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
