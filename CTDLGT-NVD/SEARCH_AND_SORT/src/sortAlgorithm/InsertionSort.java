package sortAlgorithm;  

public class InsertionSort {  
    public static void insertionSort(int[] arr) {  
        int n = arr.length;  
        for (int i = 1; i < n; i++) {  
            int temp = arr[i];  
            int j = i - 1;  

            // Di chuyển các phần tử của arr[0..i-1] lớn hơn key về phía sau  
            // cho đến khi tìm được vị trí đúng cho key  
            while (j >= 0 && arr[j] > temp) {  
                arr[j + 1] = arr[j];  
                j = j - 1;  
            }  
            arr[j + 1] = temp;  
        }  
    }  
}
