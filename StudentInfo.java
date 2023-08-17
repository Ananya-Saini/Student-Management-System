package StudentManagement;

public class StudentInfo {
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;

    public StudentInfo(int id, String name, String phone, String city){
        studentId = id;
        studentName = name;
        studentPhone = phone;
        studentCity = city;
    }

    public StudentInfo(String name, String phone, String city){
        studentName = name;
        studentPhone = phone;
        studentCity = city;
    }

    public StudentInfo(){ }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int id){
        studentId = id;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public String getStudentPhone(){
        return studentPhone;
    }

    public void setStudentPhone(String phone){
        studentPhone = phone;
    }

    public String getStudentCity(){
        return studentCity;
    }

    public void setStudentCity(String city){
        studentCity = city;
    }
}
