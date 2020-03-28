/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    private String name;
    private int backLog;
    private int appearingCount;
    public Student(String name,int backLog,int appearingCount){
        this.appearingCount=appearingCount;
        this.backLog=backLog;
        this.name = name;
    }

}
