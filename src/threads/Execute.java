/** @author Rob Nebeker 
 ** W08 Threads
 */
package threads;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execute {

    public static void main(String[] args) {

        ExecutorService myService = Executors.newFixedThreadPool(3);

        Threads ds1 = new Threads("Robert", 25, 1000);
        Threads ds2 = new Threads("Bonnie", 10, 500);
        Threads ds3 = new Threads("Angela", 5, 250);
        Threads ds4 = new Threads("Jackson", 2, 100);
        Threads ds5 = new Threads("Benjamin", 1, 50);

        myService.execute(ds1);
        myService.execute(ds2);
        myService.execute(ds3);
        myService.execute(ds4);
        myService.execute(ds5);

        myService.shutdown();
    }
}
