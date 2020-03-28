/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
import problem5.student.Student;
//to implement circular queue
public class MyCircularQueue {
    private int size;
    private int front;
    private int rear;
    private int maxSize;
    private Student[] circularQueue;
    public MyCircularQueue(int maxSize){
        this.maxSize=maxSize;
        circularQueue = new Student[maxSize];
        this.front=0;
        this.rear=0;
        this.size=0;
    }
    public void enQueue(Student element){
        if(!isFull()){
            circularQueue[rear]=element;
            rear=(rear+1)%maxSize;
            size++;
        }
        else{
            System.out.println("Queue is full.");
        }
    }
}
