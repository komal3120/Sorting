/*
1. We are given with an input array which is supposed to be sorted in ascending order
2. We start with the first element and i=0 index and check if the element present at i+1 is greater then we swap the elements at index i and i+1.
3. If above is not the case, then no swapping will take place.
4. Now  “ i ” gets incremented and the above 2 steps happen again until the array is exhausted.
5. We will ignore the last index as it is already sorted.
6. Now the largest element will be at the last index of the array.
7. Now we will again set i=0 and continue with the same steps that will eventually place second largest at second last place in the array. Now the last 2 indexes of the array are sorted.
*/

class BubbleSort {
  void bubbleSort(int arr[]) {
    int size = arr.length;
    
   
    for (int i = 0; i < size - 1; i++)
      for (int j = 0; j < size - i - 1; j++)

        if (arr[j] > arr[j + 1]) {

          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
for (int i = 0; i < size; i++)
		System.out.println(arr[i]+" ");
  }

  public static void main(String args[]) {
    int[] arr = { 81,1,45,95,45,52,11,47,0,45,67,82};
    BubbleSort bs = new BubbleSort();
    bs.bubbleSort(arr);
  }
}
