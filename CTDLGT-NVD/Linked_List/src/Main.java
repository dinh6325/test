import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tao mot doi tuong cua lop StudentMS (Quan ly sinh vien)
        StudentMS sms = new StudentMS();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hien thi menu
            System.out.println("\n--- QUAN LY SINH VIEN ---");
            System.out.println("1. Them sinh vien");
            System.out.println("2. In danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien");
            System.out.println("4. Cap nhat thong tin sinh vien");
            System.out.println("5. Xoa sinh vien");
            System.out.println("6. Dem sinh vien theo ten");
            System.out.println("0. Thoat");
            System.out.print("Chon mot tuy chon: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Doc dong moi de tranh loi

            switch (choice) {
                case 1:
                    // Them sinh vien
                    System.out.print("Nhap ma sinh vien: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhap ten sinh vien: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap tuoi: ");
                    int age = scanner.nextInt();
                    System.out.print("Nhap diem: ");
                    float score = scanner.nextFloat();
                    Student newStudent = new Student(id, name, age, score);
                    sms.addStudent(newStudent);
                    System.out.println("Da them sinh vien thanh cong!");
                    break;

                case 2:
                    // In danh sach sinh vien
                    sms.printList();
                    break;

                case 3:
                    System.out.print("Nhap ma sinh vien can tim: ");
                    String searchId = scanner.nextLine();
                    Student foundStudent = sms.find(searchId);
                    if (foundStudent != null) {
                        System.out.println("Tim thay: " + foundStudent);
                    } else {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;

                case 4:
                    // Cap nhat thong tin sinh vien
                    System.out.print("Nhap ma sinh vien can cap nhat: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Nhap ten moi: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Nhap tuoi moi: ");
                    int updateAge = scanner.nextInt();
                    System.out.print("Nhap diem moi: ");
                    float updateScore = scanner.nextFloat();
                    Student updatedStudent = new Student(updateId, updateName, updateAge, updateScore);
                    if (sms.update(updatedStudent)) {
                        System.out.println("Da cap nhat thong tin sinh vien!");
                    } else {
                        System.out.println("Khong tim thay sinh vien de cap nhat.");
                    }
                    break;

                case 5:
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    String removeId = scanner.nextLine();
                    boolean isRemoved = sms.remove(removeId);
                    if (isRemoved) {
                        System.out.println("Da xoa sinh vien thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;

                case 6:
                    // Dem so sinh vien theo ten
                    System.out.print("Nhap ten sinh vien can dem: ");
                    String countName = scanner.nextLine();
                    int count = sms.countStudent(countName);
                    System.out.println("So sinh vien co ten \"" + countName + "\": " + count);
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
