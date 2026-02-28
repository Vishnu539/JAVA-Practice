import java.util.*;

public class ComparableDemo {
    public static void main(String[] args){
        List<Student> ls = new ArrayList<>();
        ls.add(new Student("Vibhav", 8.6));
        ls.add(new Student("Akshay", 8.8));
        ls.add(new Student("Vipul", 7.9));

        System.out.println(ls);

        ls.sort(null); // throws ClassCastException. Since we are passing a custom class, Java does not know what the natural ordering of the list is. So it throws and exception.
        // In case of Integer, String, Character etc (predefined classes), Java knows what the natural ordering is. So passing null in sort() method will not throw any error.

        System.out.println(ls);
    }
}

class Student implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return this.name;
    }

    public double getGPA(){
        return this.gpa;
    }

    // compareTo() is a method of Comparable interface. So we must define it.
    public int compareTo(Student other){
        return Double.compare(other.getGPA(), this.getGPA());
    }

    public String toString(){
        return name + " " + gpa;
    }
}