import java.util.ArrayList;
import java.util.List;

public class MaganetTeacher {
    List<TeacherStaff> teacherStaffList = new ArrayList<>();

    //them vao list
    public void addTeacherStaff(TeacherStaff teacherStaff) {
        teacherStaffList.add(teacherStaff);
    }
    //hien thi
    public void showTeacherStaff(){
        for (TeacherStaff teacherStaff:teacherStaffList){
            teacherStaff.showInfoTeacherStaff();
        }
    }

    //hien thi nguoi hon 8 tr
    public void Show8tr(){
        for (TeacherStaff teacherStaff:teacherStaffList){
            if(teacherStaff.luongThuc()>=8){
                teacherStaff.showInfoTeacherStaff();
            }
        }
    }

}
