import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

class ModuleTest
{
    private Module module = new Module("CT417",17759843);

    @Test
    void testGetandSetNameandID()
    {
        String actual = module.getModuleName();
        Assert.assertEquals("CT417",actual);

        module.setModuleName("newNameTest");
        String actual2 = module.getModuleName();
        Assert.assertEquals("newNameTest",actual2);

        long actual3 = module.getModuleID();
        Assert.assertEquals(17759843,actual3);

        module.setModuleID(99999999);
        long actual4 = module.getModuleID();
        Assert.assertEquals(99999999,actual4);
    }

    @Test
    void testSetandGetStudent()
    {
        ArrayList actual = module.getStudents();
        Assert.assertEquals(new ArrayList<Student>(),actual);

        LocalDate dob = LocalDate.of(1998,6,21);

        Student student = new Student("Jawil Wilhelm",18,dob,19874320);
        ArrayList<Student> array1 = new ArrayList<Student>();

        array1.add(student);
        module.addStudent(student);

        Assert.assertEquals(array1,module.getStudents());

    }
}