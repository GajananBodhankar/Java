public class ThrowsException {
    void F1() throws ArithmeticException {
        int i = 10;
        int res = i / 0;
        System.out.println(res);
    }

    public static void main(String[] args) {
        ThrowsException t = new ThrowsException();
        try {
            t.F1();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}
