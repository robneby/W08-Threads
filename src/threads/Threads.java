
package threads;


import java.util.Random;

public class Threads implements Runnable {

    private String name;
    private int number;
    private int sleep;
    private int rand;

    public Threads(String name, int number, int sleep) {

        this.name = name;
        this.number = number;
        this.sleep = sleep;

        Random random = new Random();
        this.rand = random.nextInt(1000);
    }

    public void run() {
        System.out.println("Begining to sing: " + name + " Singng rank is = "
        + number + "... Singing Level = " + sleep + " and bonus point = " + rand + "... ");
        for (int count = 1; count < rand; count++) {
            if (count % number == 0) {
                System.out.print(name + " is singing... ");
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
            }
        }
        System.out.println("\n\n" + name + " is out of breath...\n\n");
    }
}

