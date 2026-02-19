package Generics;

public class CustomArrayList {
    private int[] arr;
    private int size;

    public CustomArrayList() {
        arr = new int[2];
        size = 0;
    }

    public void add(int val) {
        if (size == arr.length) {
            int[] newArr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size++] = val;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public int size() {
        return size;
    }
    public static void main(String[] args) {
        CustomArrayList arr = new CustomArrayList();
        arr.add(75);
        arr.add(450);
        arr.add(25);
        System.out.println(arr);
    }
}
