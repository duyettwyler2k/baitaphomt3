import java.util.Scanner;

public class TeacherStaff {
    private double luongcung;
    private double thuong;
    private double phat;
    Teacher teacher=new Teacher();

    public TeacherStaff() {
    }

    public TeacherStaff(double luongcung, double thuong, double phat, Teacher teacher) {
        this.luongcung = luongcung;
        this.thuong = thuong;
        this.phat = phat;
        this.teacher = teacher;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public double getPhat() {
        return phat;
    }

    public void setPhat(double phat) {
        this.phat = phat;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public double luongThuc(){
        double luongthuc=this.luongcung+this.thuong-this.phat;
        return luongthuc;
    }
    public void inputInfoTeacherStaff(){
        teacher.inputInfoTeacher();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap luong cung :");
        this.luongcung=scanner.nextDouble();
        System.out.println("Nhap tien thuong :");
        this.thuong=scanner.nextDouble();
        System.out.println("Nhap tien phat :");
        this.phat=scanner.nextDouble();
    }
    public void showInfoTeacherStaff(){
        teacher.showInfoTeacher();
        System.out.printf("Luong cung la : %s, Tien thuong la: %s, Tien phat la :%s ,Luong thuc nhan la : %s,\n",this.luongcung,this.thuong,this.phat,luongThuc());
    }
}
