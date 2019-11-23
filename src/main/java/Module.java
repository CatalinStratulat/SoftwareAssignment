import java.util.ArrayList;

public class Module
{
    private String name;
    private long id;
    private ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
    private ArrayList<Student> students = new ArrayList<Student>();

    public Module(String moduleName, long moduleID)
    {
        name = moduleName;
        id = moduleID;
    }

    public String getModuleName()
    {
        return name;
    }

    public void setModuleName(String module_name)
    {
        name = module_name;
    }

    public long getModuleID()
    {
        return id;
    }

    public void setModuleID(long moduleID)
    {
        id = moduleID;
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

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void removeStudent(Student student)
    {
        students.remove(student);
    }

    public ArrayList getStudents()
    {
        return students;
    }

    public void setStudents(ArrayList<Student> students)
    {
        this.students = students;
    }
}
