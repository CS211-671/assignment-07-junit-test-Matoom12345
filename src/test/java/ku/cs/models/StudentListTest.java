package ku.cs.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียนลงใน StudentList แบบไม่ใส่คะแนน")
    void testAddNewStudent()
    {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610451214","Harit Manoonnimit");
        assertEquals("Harit Manoonnimit",studentList.findStudentById("6610451214").getName());
        assertTrue(studentList.findStudentById("6610451214").isId("6610451214"));
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียนลงใน StudentList แบบใส่คะแนน")
    void testAddNewStudentWithScore()
    {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610451214","Harit Manoonnimit",85);
        assertEquals("Harit Manoonnimit",studentList.findStudentById("6610451214").getName());
        assertEquals("A",studentList.findStudentById("6610451214").grade());
        assertTrue(studentList.findStudentById("6610451214").isId("6610451214"));
    }

    @Test
    @DisplayName("ทดสอบการหานักเรียนโดนรหัสนิสิต")
    void testFindStudentById()
    {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610451214","Harit Manoonnimit",85);
        assertTrue(studentList.findStudentById("6610451214").isId("6610451214"));
    }

    @Test
    @DisplayName("ทดสอบการให้คะแนนนักเรียน")
    void testGiveScoreToId()
    {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610451214","Harit Manoonnimit",85);
        studentList.giveScoreToId("6610451214",5);
        assertEquals(90,studentList.findStudentById("6610451214").getScore());
    }

    @Test
    @DisplayName("ทดสอบการดูเกรดของนักเรียน")
    void testViewGradeOfId()
    {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610451214","Harit Manoonnimit",85);
        assertEquals("A",studentList.viewGradeOfId("6610451214"));
    }

    @Test
    @DisplayName("ทดสอบการ Get StudentList")
    void testGetStudentList()
    {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610451214","Harit Manoonnimit",85);
        assertEquals("6610451214", (studentList.getStudents()).get(0).getId());
    }










}