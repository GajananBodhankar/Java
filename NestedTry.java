public class NestedTry {
    public static void main(String[] args) {
        try {
            int i = 10;
            try {

                int res = i / 0;
                System.out.println(res);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.print("Exception: " + e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
