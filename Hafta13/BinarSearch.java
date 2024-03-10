public class BinarSearch {
    public static void main(String[] args) {
        int[] numbers =  {63,18,51,37,29,49,42,11};
        int[] numbers2 = {11,18,29,37,42,49,51,63};
        int index = BinarySearch(numbers2, 29);
        if (index != -1) {
            System.out.println("elamani indeksi " + index);
        } else {
            System.out.println("elaman bulunamadi");
        }

    }
    public static int BinarySearch(int[] numbers, int target){
        int min = 0;
        int max = numbers.length -1;
        while(min<=max){
            int mid = (max+min)/2;
            if(numbers[mid]==target)
                return mid;
            else if(numbers[mid] < target)
               min = mid+1;
            else
                max = mid -1;
        }
        return -1;
    }
}
