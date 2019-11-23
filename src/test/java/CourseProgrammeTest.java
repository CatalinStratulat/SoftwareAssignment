import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

class CourseProgrammeTest
{

    private LocalDate date1 = LocalDate.of(2016,9,7);
    private LocalDate date2 = LocalDate.of(2017,5,21);
    private CourseProgramme course = new CourseProgramme("CS",date1,date2);


    @Test
    void testGetandSetName()
    {
        String actual = course.getName();
        Assert.assertEquals("CS",actual);

        course.setName("newNameTest");
        String actual2 = course.getName();
        Assert.assertEquals("FailHere",actual2);
    }

    @Test
    void testSetandGetStartandEndDate()
    {
        LocalDate actual = course.getStartDate();
        Assert.assertEquals(date1,actual);

        LocalDate start2 = LocalDate.of(2016,9,12);
        LocalDate end2 = LocalDate.of(2017,12,16);

        course.setStartDate(start2);
        LocalDate actual2 = course.getStartDate();
        Assert.assertEquals(start2,actual2);

        LocalDate actual3 = course.getEndDate();
        Assert.assertEquals(date2,actual3);

        course.setEndDate(end2);
        LocalDate actual4 = course.getEndDate();
        Assert.assertEquals(end2,actual4);
    }

    @Test
    void testSetandGetModules()
    {
        ArrayList actual = course.getModule();
        Assert.assertEquals(new ArrayList<Module>(),actual);

        Module module = new Module("CS416",123456789);
        ArrayList<Module> array1 = new ArrayList<Module>();
        array1.add(module);
        course.addModule(module);

        Assert.assertEquals(array1,course.getModule());

    }

    @Test
    void testSetandGetStudent()
    {
        ArrayList actual = course.getStudents();
        Assert.assertEquals(new ArrayList<Student>(),actual);

        LocalDate dob = LocalDate.of(1998,6,21);

        Student student = new Student("Jawil Wilhelm",18,dob,19874320);
        ArrayList<Student> array1 = new ArrayList<Student>();

        array1.add(student);
        course.addStudent(student);

        Assert.assertEquals(array1,course.getStudents());

    }
}