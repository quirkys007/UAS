/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Kusuma
 */
public class stackApp {
    public static void main(String[] args) {
        stack newStack = new stack(10);
        newStack.push(10);
        newStack.printData();
        newStack.push(30);
        System.out.println("Ardi Kusuma Bahari");
        newStack.printData();
        newStack.pop();
        newStack.printData();
        newStack.push(40);
        newStack.printData();
        newStack.push(50);
        newStack.printData(); 
        long bacaTop = newStack.peek();
        System.out.println("nilai top = "+bacaTop);
    }
}
