import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        // Create a formatter for HH:MM:SS format
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        System.out.println("===== DIGITAL CLOCK =====");
        System.out.println("Press Ctrl + C to stop.\n");

        // Run the clock in a separate thread
        Thread clockThread = new Thread(() -> {
            while (true) {
                Date currentDate = new Date(); // gets current system time
                String time = formatter.format(currentDate);

                // \r moves cursor to start of line so time updates in place
                System.out.print("\rCurrent Time: " + time);

                try {
                    Thread.sleep(1000); // wait 1 second before updating again
                } catch (InterruptedException e) {
                    System.out.println("\nClock stopped.");
                    break;
                }
            }
        });

        clockThread.start();
    }
}
