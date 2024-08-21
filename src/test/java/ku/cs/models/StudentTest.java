package ku.cs.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore()
    {
        Student s = new Student("6610451214","Harit Manoonnimit");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());
    }

    @Test @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s = new Student("6610451214","Harit Manoonnimit");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test @DisplayName("ทดสอบการแก้ชื่อนักเรียนเป็น Test")
    void testChangeName()
    {
        Student s = new Student("6610451214","Harit Manoonnimit");
        s.changeName("Test");
        assertEquals("Test", s.getName());
    }

    @Test @DisplayName("ทดสอบการเรียก Getter")
    void testGetter()
    {
        Student s = new Student("6610451214","Harit Manoonnimit");
        s.addScore(85);
        assertEquals("Harit Manoonnimit", s.getName());
        assertEquals("6610451214", s.getId());
        assertEquals(85, s.getScore());
    }

    @Test @DisplayName("ทดสอบการเช็ครหัสที่ใส่ไป กับรหัสนิสิตนี้")
    void testIsId()
    {
        Student s = new Student("6610451214","Harit Manoonnimit");
        assertTrue(s.isId("6610451214"));
    }

    @Test @DisplayName("ทดสอบการใช้ Method ToString")
    void testToString()
    {
        Student s = new Student("6610451214","Harit Manoonnimit",85);
        assertEquals("{id: '6610451214', name: 'Harit Manoonnimit', score: 85.0}", s.toString());
    }








}