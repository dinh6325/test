import searchAlgorithm.BinarySearch;  
import searchAlgorithm.LinearSearch;  
import sortAlgorithm.*;  
import java.util.Scanner;  

public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        // Nhap so luong phan tu cua mang  
        System.out.print("Nhap so luong phan tu cua mang: ");  
        int arrayLength = scanner.nextInt();  

        // Khoi tao mang  
        int[] arrayInput = new int[arrayLength];  

        // Nhap cac phan tu cua mang tu ban phim  
        System.out.println("Nhap cac phan tu cua mang: ");  
        for (int i = 0; i < arrayLength; i++) {  
            System.out.print("Phan tu thu " + (i + 1) + ": ");  
            arrayInput[i] = scanner.nextInt();  
        }  

        // Nhap gia tri can tim  
        // System.out.print("Nhap gia tri can tim: ");  
        // int key = scanner.nextInt();  
        // callMeForLinearSearch(arrayInput, key);  
        
        // // Goi cac phuong thuc sap xep  
        callMeForSelectionSort(arrayInput);  
        // callMeForInsertionSort(arrayInput);  
        
        scanner.close();  
    }  

    static void callMeForBinarySearch(int[] arrayInput, int key) {  
        int result = BinarySearch.binarySearch(arrayInput, key);  
        if (result != -1) {  
            System.out.println("Vi tri cua phan tu can tim la: " + result);  
        } else {  
            System.out.println("Khong tim thay phan tu.");  
        }  
    }  

    static void callMeForLinearSearch(int[] arrayInput, int key) {  
        LinearSearch linearSearchInstance = new LinearSearch();  
        int result = linearSearchInstance.linearSearch(arrayInput, key);  
        if (result != -1) {  
            System.out.println("Vi tri cua phan tu can tim la: " + result);  
        } else {  
            System.out.println("Khong tim thay phan tu.");  
        }  
    }  

    static void callMeForSelectionSort(int[] arrayInput) {  
        SelectionSort selectionSortInstance = new SelectionSort();  
        System.out.println("Mang truoc khi sap xep la:");  
        printArray(arrayInput);  
        selectionSortInstance.selectionSort(arrayInput);  
        System.out.println("Mang sau khi sap xep la:");  
        printArray(arrayInput);  
    }  

    static void callMeForInsertionSort(int[] arrayInput) {  
        InsertionSort insertionSortInstance = new InsertionSort();  
        System.out.println("Mang truoc khi sap xep la:");  
        printArray(arrayInput);  
        insertionSortInstance.insertionSort(arrayInput);  
        System.out.println("Mang sau khi sap xep la:");  
        printArray(arrayInput);  
    }  

    // Phuong thuc de in mang  
    static void printArray(int[] array) {  
        for (int value : array) {  
            System.out.print(value + " ");  
        }  
        System.out.println();  
    }  
}
