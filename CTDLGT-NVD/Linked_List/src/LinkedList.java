
public class LinkedList<T> {
    private Node<T> head; // Node đầu tiên của danh sách

    public LinkedList() {
        this.head = null; // Khởi tạo danh sách rỗng
    }

    // Duyệt qua từng phần tử của danh sách
    public void traverse() {
        Node<T> tmp = head;
        while (tmp != null) {
            // In ra dữ liệu của từng phần tử
            System.out.println(tmp.getData());
            // Chuyển đến phần tử tiếp theo
            tmp = tmp.getNext();
        }
    }

    // Thêm node vào đầu danh sách
    public void addFirst(T item) {
        Node<T> newNode = new Node<>();
        newNode.setData(item);
        newNode.setNext(this.head);

        // Đặt node mới là node đầu tiên
        this.head = newNode;
    }

    // Thêm node vào cuối danh sách liên kết
    public void addLast(T item) {
        if (head == null) {
            addFirst(item); // Nếu danh sách rỗng, thêm vào đầu
        } else {
            Node<T> newNode = new Node<>(item, null);

            // Duyệt đến node cuối cùng
            Node<T> tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            // Gán node mới là node tiếp theo của node cuối cùng
            tmp.setNext(newNode);
        }
    }

    // Thêm node vào sau một node có giá trị key
    public void insertAfter(T key, T toInsert) {
        Node<T> tmp = head;
        // Tìm node có chứa giá trị key
        while (tmp != null && !tmp.getData().equals(key)) {
            tmp = tmp.getNext();
        }
        // Nếu tìm thấy node chứa key
        if (tmp != null) {
            Node<T> newNode = new Node<>(toInsert, tmp.getNext());
            tmp.setNext(newNode);
        }
    }

    // Xóa một node chứa giá trị key
    public boolean remove(T key) {
        if (head == null)
            return false;

        // Nếu node đầu tiên chứa key, xóa node đầu
        if (head.getData().equals(key)) {
            this.head = head.getNext();
            return true;
        }

        Node<T> prev = null;
        Node<T> cur = head;

        // Duyệt tìm node chứa key
        while (cur != null && !cur.getData().equals(key)) {
            prev = cur;
            cur = cur.getNext();
        }

        // Nếu không tìm thấy node chứa key
        if (cur == null)
            return false;

        // Gán node tiếp theo của prev là node tiếp theo của cur
        prev.setNext(cur.getNext());
        return true;
    }

    // Kiểm tra xem danh sách có rỗng hay không
    public boolean isEmpty() {
        return head == null;
    }

    // Đếm số lượng phần tử trong danh sách
    public int size() {
        int count = 0;
        Node<T> tmp = head;
        while (tmp != null) {
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }

    // Kiểm tra xem danh sách có chứa phần tử item hay không
    public boolean findItem(T item) {
        Node<T> tmp = head;
        while (tmp != null) {
            if (tmp.getData().equals(item)) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    // Trả về node đầu tiên của danh sách
    public Node<T> getHead() {
        return head;
    }

    // Đặt node đầu tiên cho danh sách
    public void setHead(Node<T> head) {
        this.head = head;
    }
}
