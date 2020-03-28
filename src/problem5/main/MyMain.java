/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;
//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        myCircularQueue.enQueue(new Student("T", 0, 0));
        myCircularQueue.enQueue(new Student("Y", 1, 1));
        myCircularQueue.enQueue(new Student("D", 1, 0));
    }
}
