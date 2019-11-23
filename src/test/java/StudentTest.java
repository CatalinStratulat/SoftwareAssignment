import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

class StudentTest
{
    private LocalDate dob = LocalDate.of(1998,7,31);
    private Student student = new Student("Catalin Stratulat",21,dob,16361746);

    @Test
    void testGetandSetNameAgeIDDob ()
    {
        String actual = student.getName();
        Assert.assertEquals("Catalin Stratulat",actual);

        student.setName("newNameTest");
        String actual2 = student.getName();
        Assert.assertEquals("newNameTest",actual2);

        int actual3 = student.getAge();
        Assert.assertEquals(21,actual3);

        student.setAge(34);
        int actual4 = student.getAge();
        Assert.assertEquals(34,actual4);

        long actual5 = student.getID();
        Assert.assertEquals(16361746,actual5);

        student.setID(99999999);
        long actual6 = student.getID();
        Assert.assertEquals(99999999,actual6);

        LocalDate actual7 = student.getDOB();
        Assert.assertEquals(dob,actual7);

        LocalDate newdob = LocalDate.of(2999,1,11);
        student.setDOB(newdob);
        LocalDate actual8 = student.getDOB();
        Assert.assertEquals(newdob,actual8);
    }

    @Test
    void testSetandGetUsername ()
    {
        String actual = student.getUsername();
        Assert.assertNull(actual);

        student.setUsername();
        String actual2 = student.getUsername();
        Assert.assertEquals("Catalin Stratulat21",actual2);
    }

    @Test
    void testSetandGetModules()
    {
        ArrayList actual = student.getModule();
        Assert.assertEquals(new ArrayList<Module>(),actual);

        Module module = new Module("CS416",123456789);
        ArrayList<Module> array1 = new ArrayList<Module>();
        array1.add(module);
        student.addModule(module);

        Assert.assertEquals(array1,student.getModule());

    }

}