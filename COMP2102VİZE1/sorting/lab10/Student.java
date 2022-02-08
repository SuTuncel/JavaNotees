package COMP2102VİZE1.sorting.lab10;

public class Student implements Comparable<Student> {
    float gpa;
    int idNo;
    String name;

    public Student(String name, int idNo, float gpa){
        this.gpa= gpa;
        this.name= name;
        this.idNo= idNo;
    }

    @Override
    public int compareTo(Student o) {
        if (this.gpa - o.gpa > 0){
            return 1;
        }
        else if (this.gpa-o.gpa<0){
            return -1;
        }else{
            return 0;
        }
    }

    public String toString(){
        return "{Student: "+ name+ " with no: "+ idNo+ " gpa= "+gpa+"}";
    }


}
