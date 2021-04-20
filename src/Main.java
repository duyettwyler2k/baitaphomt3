import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaganetTeacher maganetTeacher = new MaganetTeacher();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    TeacherStaff teacherStaff = new TeacherStaff();
                    teacherStaff.inputInfoTeacherStaff();
                    maganetTeacher.addTeacherStaff(teacherStaff);
                    break;
                }
                case 2:{
                    maganetTeacher.showTeacherStaff();
                    break;
                }
                case 3:{
                    maganetTeacher.Show8tr();
                }
            }
        } while (choice != 0);

    }

    private static void menu() {
        System.out.println("Nhập lựa chọn của bạn : ");
        System.out.println("1. Nhập thông tin can bo giao vien");
        System.out.println("2. Hiển thị thông tin can bo giao vien");
        System.out.println("3 .Hiển thị thong tin can bo giao vien co luong hon 8tr");
        System.out.println("0. Exit");
    }
}
