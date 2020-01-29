package beans;

/**
 * Spring bean
 *
 */
public class Student {

    private String name;

    private Teacher teacher;

    public Student() {
    }

    public Student(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
    
    

    
    
    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", teacher=" + teacher + '}';
    }

    
}
