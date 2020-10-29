/*   Created by IntelliJ IDEA.
 *   Author: Manish Kumar
 *   Date: 29-10-2020
 *   Time: 21:53
 *   File: mani.java
 */

package multithreading.main;

import multithreading.thread.rabbit.Rabbit;
import multithreading.thread.tortoise.Tortoise;

public class main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        Tortoise tortoise = new Tortoise();
        tortoise.run();
    }
}
