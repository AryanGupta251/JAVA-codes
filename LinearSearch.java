public class LinearSearch {

    public static int linearsearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arry[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int index = linearsearch(arry, key);
        System.out.println("Key found at index : " + index);
    }

}
