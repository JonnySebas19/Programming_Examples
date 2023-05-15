package Recursion;

public class Recursion {
    /*
    Thinking recursively means to just think about the first problem, then worry about the rest of it. Then just do the
    first one, then you can worry about the rest of it.
     */
    public int verticalNumber(int num){
        num %= 10;
        System.out.println(num);
        if (num != 0){
            verticalNumber(num);
        }

        return -1;
    }
    public static int binarySearch(int[] data, int target, int start, int end){
        int mid = (start + end) / 2;

        if (data[mid] == target) {
            return mid;
        }

        if (data[mid] > target){
            return binarySearch(data, target, mid + 1, end);
        }
        if (data[mid] < target){
            return binarySearch(data, target, start, mid - 1);
        }

        return -1;

    }
}
