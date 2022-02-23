package OOP_learning;

public class boolin {
    public static void main(String[] args) {
        // Boolean demo
        boolean bl = true;
        while (bl = false) {
            System.out.println("jdhgj");
            return;
        }
        System.out.println("aaaaaaaaaaaaa");

        // Try catch demo, Java just catch the first exception and stop the program
        try {
            // First exception
            int arr[] = new int[5];
            arr[6] = 4;
            System.out.println("arr[6 = " + arr[6]);
            // Second exception
            int data = 0;
            int div = 10 / data;
            System.out.println("Average = " + div);
            // Third exception
            String obj = null;
            System.out.println(obj.length());
        } catch (NullPointerException ex) {
            System.out.println(ex);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
        System.out.println("Finished!");

        // Try catch demo - try finally without catch
        try {
            int data = 5 / 0;
        } finally {
            System.out.println("Khối lệnh finally luôn được thực thi");
        }
        System.out.println("Finished!");
    }
}
