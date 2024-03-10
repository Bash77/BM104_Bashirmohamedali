public class bubbleSort {
    public void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {10,8,6,4,2,20};
        bubbleSort ob = new bubbleSort();
        ob.bubbleSort(array);
        System.out.println("sirali dizi ");
        ob.printArray(array);
    }
}
