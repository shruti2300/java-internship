import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        System.out.println("===== DIGITAL CLOCK =====");
        System.out.println("Press Ctrl + C to stop.\n");

        Thread clockThread = new Thread(() -> {
            while (true) {
                Date currentDate = new Date(); 
                String time = formatter.format(currentDate);

                System.out.print("\rCurrent Time: " + time);

                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    System.out.println("\nClock stopped.");
                    break;
                }
            }
        });

        clockThread.start();
    }
}
