package week12monday;

public class ExceptionHandling_2 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            sleepMyCode(1000);
            System.out.println(i);
        }
    }
    public static void sleepMyCode() throws InterruptedException {
        Thread.sleep(1000);
    }
    public static void sleepMyCode(int number) {
        try {
            Thread.sleep(number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
