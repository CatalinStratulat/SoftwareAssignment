import java.time.*;
import java.util.ArrayList;

public class Student
{
    private String name;
    private int age;
    private LocalDate dob;
    private long ID;
    private String username;
    private ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
    private ArrayList<Module> modules = new ArrayList<Module>();

    public Student(String student_name,int student_age, LocalDate DOB, long student_ID)
    {
        name = student_name;
        age = student_age;
        dob = DOB;
        ID = student_ID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public LocalDate getDOB()
    {
        return dob;
    }

    public void setDOB(LocalDate newDOB)
    {
        dob = newDOB;
    }

    public long getID()
    {
        return ID;
    }

    public void setID(long newID)
    {
        ID = newID;
    }

    public void addCourse(CourseProgramme course)
    {
       courses.add(course);
    }

    public void removeCourse(CourseProgramme course)
    {
        courses.remove(course);
    }

    public ArrayList getCourses()
    {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses)
    {
        this.courses = courses;
    }

    public void addModule(Module module)
    {
        modules.add(module);
    }

    public void removeModule(Module module)
    {
        modules.remove(module);
    }

    public ArrayList getModule()
    {
        return modules;
    }

    public void setModules(ArrayList<Module> modules)
    {
        this.modules = modules;
    }

    public void setUsername()
    {
        username = name + age;
    }

    public String getUsername()
    {
        if(username != null)
        {
            return username;
        }
        else
        {
            return null;
        }
    }
}
