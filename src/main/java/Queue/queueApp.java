/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Kusuma
 */
public class queueApp {
      public static void main(String[] args) {
        queue newQueue = new queue(10);
        newQueue.enqueue(55);
        newQueue.show();
        newQueue.enqueue(60);
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek());
        System.out.println("Ardi Kusuma Bahari");
        newQueue.enqueue(70);
        newQueue.show();
        System.out.println("data yang diambil = "+newQueue.dequeue());
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek());
    }
}
