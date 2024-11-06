package sortAlgorithm;  

public class BubbleSort {  
    // Hàm sắp xếp từ bé đến lớn
    public static void bubbleSortAscending(int[] arr) {  
        int n = arr.length;  
        for (int i = 0; i < n - 1; i++) {  
            for (int j = 0; j < n - i - 1; j++) {  
                if (arr[j] > arr[j + 1]) {  
                    swap(arr, j, j + 1); // Hoán đổi hai phần tử  
                }  
            }  
        }  
    }  

    static void swap(int[] arr, int a, int b) {  
        int temp = arr[a];  
        arr[a] = arr[b];  
        arr[b] = temp;  
    }  

    // Hàm sắp xếp từ lớn đến bé  
    public static void bubbleSortDescending(int[] arr) {  
        int n = arr.length;  
        for (int i = 0; i < n - 1; i++) {  
            for (int j = 0; j < n - i - 1; j++) {  
                if (arr[j] < arr[j + 1]) {  
                    swap(arr, j, j + 1); // Hoán đổi hai phần tử  
                }  
            }  
        }  
    }  
}