import java.util.Scanner;

public class Teacher {
   private String name;
   private String dateofbirth;
   private String hometown;

    public Teacher() {
    }

    public Teacher(String name, String dateofbirth, String hometown) {
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
    public void inputInfoTeacher(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ho ten :");
        this.name=scanner.nextLine();
        System.out.println("Nhap ngay sinh :");
        this.dateofbirth=scanner.nextLine();
        System.out.println("Nhap que quan");
        this.hometown=scanner.nextLine();
    }
    public void showInfoTeacher(){
        System.out.printf("Ho ten : %s, Ngay sinh :%s, Que quan :%s \n",name,dateofbirth,hometown);
    }
}
