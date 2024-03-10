public class selectionSort {
    public void sort(int [] array){
        for (int i = 0; i < array.length; i++) {
            int mid_index = i;
            for (int j = 0; j < array.length; j++) {
                if(array[j] < array[mid_index]){
                    mid_index = j;
                }
            }
            int tmp = array[mid_index];
            array[mid_index]= array[i];
            array[i] = tmp;
        }
    }
    public void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {15,12,14,20,30,5};
        selectionSort ob = new selectionSort();
        ob.sort(array);
        System.out.println("sirali dizi ");
        ob.printArray(array);
    }
}
