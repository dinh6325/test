

public class StudentMS {
    private LinkedList<Student> list;

    public StudentMS() {
        this.list = new LinkedList<Student>();
    }

    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }
        this.list.addLast(student);
    }

    public void printList() {
        this.list.traverse();
    }

    public Student find(String studentId) {
        Node<Student> tmp = list.getHead();
        while (tmp != null) {
            if (tmp.getData().getId().equals(studentId)) {
                return tmp.getData(); // Trả về sinh viên nếu tìm thấy
            }
            tmp = tmp.getNext();
        }
        return null; // Không tìm thấy
    }
    
    public boolean update(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }
        Node<Student> tmp = list.getHead();
        while (tmp != null) {
            Student st = tmp.getData();
            if (st.getId().equals(student.getId())) {
                st.setFullName(student.getFullName());
                st.setAge(student.getAge());
                st.setGpa(student.getGpa());
                return true; // Đã cập nhật thành công
            }
            tmp = tmp.getNext();
        }
        return false; // Không tìm thấy sinh viên để cập nhật
    }

    public boolean remove(String studentId) {
        Node<Student> current = list.getHead();
        Node<Student> previous = null;
    
        // Duyệt qua danh sách để tìm node có `id` cần xóa
        while (current != null) {
            if (current.getData().getId().equals(studentId)) {
                if (previous == null) {
                    list.setHead(current.getNext()); // Nếu là node đầu tiên
                } else {
                    previous.setNext(current.getNext()); // Bỏ qua node này
                }
                return true; // Đã xóa thành công
            }
            previous = current;
            current = current.getNext();
        }
        return false; // Không tìm thấy sinh viên để xóa
    }

    public int countStudent(String fullName) {
        if (fullName == null) {
            throw new IllegalArgumentException("Full name cannot be null");
        }
        int count = 0;
        Node<Student> tmp = list.getHead();
        while (tmp != null) {
            Student st = tmp.getData();
            if (st.getFullName().equals(fullName)) {
                count++;
            }
            tmp = tmp.getNext();
        }
        return count;
    }
}
