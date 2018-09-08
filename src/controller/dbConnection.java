
package nsbm;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
import javaClasses.BachelorStudent;
import javaClasses.SubjectEnrollment;
import javaClasses.Instructor;
import javaClasses.Lecturer;
import javaClasses.MasterStudent;
import javaClasses.Student;
import javaClasses.Subject;
import javaClasses.SubjectPayment;


//establishing database connection
public class dbConnection {

    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/nsbm";
    
    final static String user = "root";
    final static String pass = "";
    
    Statement stmt = null;
    
    public Connection connection(){
        
        try{
            Class.forName(JDBC_DRIVER);
           
            Connection conn = DriverManager.getConnection(DB_URL, user, pass);
            stmt = conn.createStatement();
            return conn;
        }
        
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    //log in process
    public ResultSet login(String user, String pass) throws SQLException{
        
        String sql = " SELECT * FROM admin WHERE adUsername='"+user+"' && adPassword='"+pass+"';";
        
        return stmt.executeQuery(sql);
    }
    
    
    //Student management process
    public int insertStudent(Student std) throws SQLException{
        
        String que;
            que = "INSERT INTO `student`(`Student_Id`, `FirstName`, `LastName`, `DateOfBirth`, `Email`, `ContactNo`, `Address`, `Gender`, `EnrollDate`, `StudentType`)"
                    + " VALUES ('"
                    + std.getstuId() + "','"
                    + std.getfirstName() + "','"
                    + std.getlastName() + "','"
                    + std.getdateOfBirth() + "','"
                    + std.getemail() + "','"
                    + std.getcontactNo() + "','"
                    + std.getaddress() + "','"
                    + std.getGender() + "','"
                    + std.getenrollDate() + "','"
                    + std.getstuType() + "'"
                    + ");";
            
        return stmt.executeUpdate(que);
    }
    
    public int updateStudent(Student std) throws SQLException{
        
        String que = "UPDATE Student SET FirstName='"+std.getfirstName()+"',"
                + " LastName='"+std.getlastName()+"',"
                + " DateOfBirth='"+std.getdateOfBirth()+"',"
                + " Email='"+std.getemail()+"',"
                + " ContactNo='"+std.getcontactNo()+"',"
                + " Address='"+std.getaddress()+"',"
                + " Gender='"+std.getGender()+"',"
                + " EnrollDate='"+std.getenrollDate()+"'"
                + " WHERE Student_Id='"+std.getstuId()+"';";
        
        return stmt.executeUpdate(que);
    }
    
    public int deleteStudent(Student std) throws SQLException{
        
        String sql = "DELETE FROM Student WHERE Student_Id='"+std.getstuId()+"';";
        
        return stmt.executeUpdate(sql);
    }
    
    public ResultSet searchStudent(String search) throws SQLException{
        
        String query = "SELECT * FROM Student WHERE Student_Id LIKE '"+search+"' OR FirstName LIKE '"+search+"' OR LastName LIKE '"+search+"';";
        
        return stmt.executeQuery(query);
    }
    
    
    /*..................*/
    
    //Studenrt JTable
    public ResultSet studentFieldSelection() throws SQLException{
        
        String query = "SELECT Student_Id, FirstName, LastName, Email FROM Student;";
        
        return stmt.executeQuery(query);
    }
    //Lecture JTable
    public ResultSet lecturerFieldSelection() throws SQLException{
    
        String query = "SELECT Lecr_Id, FirstName, LastName, Email, Title FROM Lecturer;";
        
        return stmt.executeQuery(query);
    }
    //Instructor JTable
    public ResultSet instructorFieldSelection() throws SQLException{
        
        String query = "SELECT Instrct_Id, FirstName, LastName, Email FROM Instructor;";
        
        return stmt.executeQuery(query);
    }
    //Subject JTable
    public ResultSet subjectFieldSelection() throws SQLException{
        
        String query = "SELECT * FROM  Subject;";
        
        return stmt.executeQuery(query);
    }
    
    public ResultSet searchSubject(String subject) throws SQLException{
        
        String query = "SELECT * FROM Subject WHERE Sub_Code = '"+subject+"';";
        
        return stmt.executeQuery(query);
    }
    
    //Insert Subject Details
    public int insertSubject(Subject sub) throws SQLException{
        
        String query = "INSERT INTO Subject (Sub_Code, SubName, Course_Id, Lecr_Id, Semester, SubFee, SubCredits, Year, SubType)"
                + "VALUES ('"
                + sub.getSubCode()+ "','"
                + sub.getSubName()+ "','"
                + sub.getCourseId()+ "','"
                + sub.getLecturerId()+ "','"
                + sub.getSemester()+ "','"
                + sub.getSubFee()+ "','"
                + sub.getSubCredit()+ "','"
                + sub.getYear()+ "','"
                + sub.getSubType()+ "'"
                + ");";
        
        return stmt.executeUpdate(query);
    }
    
    
    
    /*...............*/
    
    //Course selection
    public ResultSet courseSelection() throws SQLException{
    
        String query = "SELECT Course_Id FROM Course;";
        
        return stmt.executeQuery(query);
    }
    
    //Lecturer Selection
    public ResultSet lecturerSelection() throws SQLException{
    
        String query = "SELECT Lecr_Id FROM Lecturer;";
        
        return stmt.executeQuery(query);
    }
    
    
    /*...............*/
    
    //Subject Selection Process
    public ResultSet OptionalSubjectSelection(String course, String year, String semester) throws SQLException{
        
        String sql = "SELECT * FROM Subject WHERE Course_Id = '"+course+"' AND Year = '"+year+"' AND Semester = '"+semester+"' AND SubType = 'O';";
        
        return stmt.executeQuery(sql);
    }
    
    public ResultSet CompulsorySubjectSelection(String course, String year, String semester) throws SQLException{
        
        String sql = "SELECT * FROM Subject WHERE Course_Id = '"+course+"' AND Year = '"+year+"' AND Semester = '"+semester+"' AND SubType = 'C';";
        
        return stmt.executeQuery(sql);
    }
    
    public ResultSet getOptionalSubjectCredits(String subName) throws SQLException{
        
        String sql = "SELECT SubCredits FROM Subject WHERE SubName = '"+subName+"';";
        
        return stmt.executeQuery(sql);
    }
    
    
    /*............*/
    
    //course enrollment process
    public int enrollCourse(Student std) throws SQLException{
    
        String sql = "UPDATE Student SET Course_Id = '"+std.getcourseId()+"',"
                + " Intake = '"+std.getIntake()+"',"
                + " AcademicYear = '"+std.getAcaYear()+"'"
                + " WHERE Student_Id = '"+std.getstuId()+"';";
        
        return stmt.executeUpdate(sql);
    }
    
    
    /*................*/
    
    //Lecturer management process
    public int insertLecturer(Lecturer lecr) throws SQLException{
        
        String sql;
        sql = "INSERT INTO lecturer(Lecr_Id, FirstName, LastName, Gender, Email, Room, Title, Faculty) "
                + "VALUES ('"
                + lecr.getLecturerId() +"','"
                + lecr.getFirstName() +"','"
                + lecr.getLastName() +"','"
                + lecr.getGender() +"','"
                + lecr.getEmail() +"','"
                + lecr.getRoom() +"','"
                + lecr.getTitle() +"','"
                + lecr.getFaculty()+ "'"
                + ");";
        
        return stmt.executeUpdate(sql);
    }
    
    public ResultSet searchLecturer(String search) throws SQLException{
        
        String query = "SELECT * FROM Lecturer WHERE Lecr_Id LIKE '"+search+"' OR FirstName LIKE '"+search+"' OR LastName LIKE '"+search+"';";
        
        return stmt.executeQuery(query);
    }
    
    public int deleteLecturer(Lecturer lectr) throws SQLException{
        
        String sql = "DELETE FROM Lecturer WHERE Lecr_Id='"+lectr.getLecturerId()+"';";
        
        return stmt.executeUpdate(sql);
    }
    
    public int updateLecturer(Lecturer lectr) throws SQLException{
        
        String que = "UPDATE lecturer SET FirstName='"+lectr.getFirstName()+"',"
                + " LastName='"+lectr.getLastName()+"',"
                + " Gender='"+lectr.getGender()+"',"
                + " Email='"+lectr.getEmail()+"',"
                + " Room='"+lectr.getRoom()+"',"
                + " Title='"+lectr.getTitle()+"'"
                + " WHERE Lecr_Id='"+lectr.getLecturerId()+"';";
        
        return stmt.executeUpdate(que);
    }
    
    
    /*...............*/
    
    //Instructor management process
    public int insertInstructor(Instructor instr) throws SQLException{
        
        String sql;
        sql = "INSERT INTO Instructor(Instrct_Id, FirstName, LastName, Gender, Email) "
                + "VALUES ('"
                + instr.getInstrId() +"','"
                + instr.getFirstName() +"','"
                + instr.getLastName() +"','"
                + instr.getGender() +"','"
                + instr.getEmail() +"'"
                + ");";
        
        return stmt.executeUpdate(sql);
    }
    
    public ResultSet searchInstructor(String search) throws SQLException{
    
        String query = "SELECT * FROM Instructor WHERE Instrct_Id LIKE '"+search+"' OR FirstName LIKe '"+search+"' OR LastName LIKE '"+search+"';";
        
        return stmt.executeQuery(query);
    }
    
    public int deleteInstructor(Instructor instr) throws SQLException{
        
        String sql = "DELETE FROM Instructor WHERE Instrct_Id='"+instr.getInstrId()+"';";
        
        return stmt.executeUpdate(sql);
    }
    
    public int updateInstructor(Instructor instr) throws SQLException{
        
        String que = "UPDATE Instructor SET FirstName='"+instr.getFirstName()+"',"
                + " LastName='"+instr.getLastName()+"',"
                + " Gender='"+instr.getGender()+"',"
                + " Email='"+instr.getEmail()+"'"
                + " WHERE Instrct_Id='"+instr.getInstrId()+"';";
        
        return stmt.executeUpdate(que);
    }
    
    
    /*............*/
    
    
    //Check existing of lecturer
    public ResultSet lecturerSelection(String lecId) throws SQLException{
    
        String query = "SELECT * FROM Lecturer WHERE Lecr_Id = '" + lecId + "';";
        
        return stmt.executeQuery(query);
    }
    
    //check existing of instructor
    public ResultSet instructorSelection (String insId) throws SQLException{
    
        String query = "SELECT * FROM Instructor WHERE Instrct_Id = '" + insId + "';";
        
        return stmt.executeQuery(query);
    }
    
    //check exsisting of student
    public ResultSet studentSelection(String stuId) throws SQLException{
        
        String query = "SELECT * FROM Student WHERE Student_Id = '" + stuId + "';";
        
        return stmt.executeQuery(query);
    }
    
    
    /*...............*/
    
    
    //add previous education records
    public int addBachelorStudentQualifications(BachelorStudent bstu) throws SQLException{
    
        String bquery = "INSERT INTO `undergraduate`(`Student_Id`, `IslandRank`, `YearOfExam`, `District`, `Subject_1`, `Result_1`, `Subject_2`, `Result_2`, `Subject_3`, `Result_3`, `ZScore`) "
                    + "VALUES ('"
                    + bstu.getstuId()+"','"
                    + bstu.getIslandRank()+"','"
                    + bstu.getExamYear()+"','"
                    + bstu.getDistrict()+"','"
                    + bstu.getSubject_1()+"','"
                    + bstu.getResult_1()+"','"
                    + bstu.getSubject_2()+"','"
                    + bstu.getResult_2()+"','"
                    + bstu.getSubject_3()+"','"
                    + bstu.getResult_3()+"','"
                    + bstu.getZscore()+"'"
                    + ");";
            
        return stmt.executeUpdate(bquery);
    }
    
    public int addMasterStudentQualifications(MasterStudent mstu) throws SQLException{
    
        String squery = "INSERT INTO `postgraduate`(`Student_Id`, `Qual_Type`, `Institute`, `YearOfCompletion`) "
                    + "VALUES ('"
                    + mstu.getstuId()+"','"
                    + mstu.getQualType()+"','"
                    + mstu.getInstitute()+"','"
                    + mstu.getCompleteYear()+"'"
                    + ");";
            
        return stmt.executeUpdate(squery);
    }
    
    
    /*.................*/
    
    
    //retrieving previous education records
    public ResultSet getBachelorRecords(String stud) throws SQLException{
    
        String query = "SELECT * FROM Undergraduate WHERE Student_Id = '"+stud+"';";
        
        return stmt.executeQuery(query);
    }
    
    public ResultSet getMasterRecords(String stud) throws SQLException{
    
        String query = "SELECT * FROM Postgraduate WHERE Student_Id = '"+stud+"';";
        
        return stmt.executeQuery(query);
    }
    
    
    
    
    /*................*/
    
    //storing student enrollment data
    public int addOptionalSubjects(String stud, SubjectEnrollment comps) throws SQLException{
        
        String query = "INSERT INTO OptionalSubjects (`Student_Id`, `Sem1OptSubject1`, `Sem1OptSubject2`, `Sem1OptSubject3`, `Sem2OptSubject1`, `Sem2OptSubject2`, `Sem2OptSubject3`)"
                + "VALUES ('"
                + stud+"','"
                + comps.getSem1OptSub1()+"','"
                + comps.getSem1OptSub2()+"','"
                + comps.getSem1OptSub3()+"','"
                + comps.getSem2OptSub1()+"','"
                + comps.getSem2OptSub2()+"','"
                + comps.getSem2OptSub3()+"'"
                + ");";
        
        return stmt.executeUpdate(query);
    }
    
    
    //retrieving subjects details for particular subject
    public ResultSet getCompulsorySubjects(String subject) throws SQLException{
        
        String query = "SELECT * FROM Subject WHERE SubName = '"+subject+"' AND SubType = 'C';";
        
        return stmt.executeQuery(query);
    }
    
    
    
    
    
    /*.................*/
    
    
    //payment for semesters
    public int payForSem1(SubjectPayment subpay) throws SQLException{
        
        String query = "INSERT INTO `semester1payment`(`Student_Id`, `Sem1Payment`, `Sem1PaymentStatus`) VALUES ('"+subpay.getStudentId()+"',"+subpay.getSem1Payment()+",'"+subpay.getSem1PaymentStatus()+"')";

        return stmt.executeUpdate(query);
    }
    
    public int payForSem2(SubjectPayment subpay) throws SQLException{
        
        String query = "INSERT INTO `semester2payment`(`Student_Id`, `Sem2Payment`, `Sem2PaymentStatus`) VALUES ('"+subpay.getStudentId()+"',"+subpay.getSem2Payment()+",'"+subpay.getSem2PaymentStatus()+"')";

        return stmt.executeUpdate(query);
    }
    
    
    //check payment status for semesters
    public ResultSet sem1PaymentSelection(String stuId) throws SQLException{
        
        String sql = "SELECT * FROM Semester1Payment WHERE Student_Id = '"+stuId+"';";
        
        return stmt.executeQuery(sql);
    }
    
    public ResultSet sem2PaymentSelection(String stuId) throws SQLException{
        
        String sql = "SELECT * FROM Semester2Payment WHERE Student_Id = '"+stuId+"';";
        
        return stmt.executeQuery(sql);
    }
    
    
    //retrieving data for payment process
    public ResultSet selectStudentForPayment(String stuId) throws SQLException{
    
        String sql = "SELECT Course_Id, AcademicYear, Intake FROM Student WHERE Student_Id = '"+stuId+"';";
        
        return stmt.executeQuery(sql);
    }
    
    public ResultSet selectSubjectsForPayment(String course, String year, String sem) throws SQLException{
        
        String query = "SELECT SubName, SubFee FROM Subject WHERE Course_Id = '"+course+"' AND Year = '"+year+"' AND Semester = '"+sem+"' AND SubType= 'C';";
        
        return stmt.executeQuery(query);
    }
    
    
    
    /*................*/
    
    //retrieving data for particular course
    public ResultSet selectFaculty(String course) throws SQLException{
    
        String query = "SELECT CourseName, Fac_Id FROM Course WHERE Course_Id = '"+course+"';";
        
        return stmt.executeQuery(query);
    }
    
    
    //retrieving enrolled subjects of a student
    public ResultSet getOptionalSubjects(String stuId) throws SQLException{
        
        String query = "SELECT * FROM OptionalSubjects WHERE Student_Id = '"+stuId+"';";
        
        return stmt.executeQuery(query);
    }

}


