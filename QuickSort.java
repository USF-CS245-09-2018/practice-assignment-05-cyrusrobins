public class QuickSort implements SortingAlgorithm{

    public void sort(int[] arr){
        QuickSort(arr,0,arr.length-1);
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int splitPoint = low-1;
        for(int i=low;i<high;i++){
            if(arr[i]<=pivot){
                splitPoint++;
                int temp = arr[splitPoint];
                arr[splitPoint] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[splitPoint+1];
        arr[splitPoint+1] = arr[high];
        arr[high] = temp;
        return splitPoint+1;
    }

    public void QuickSort(int[] arr, int low, int high){
        if(low<high){
            int partitionIndex = partition(arr,low,high);
            QuickSort(arr,low,partitionIndex-1);
            QuickSort(arr,partitionIndex,high);
        }
    }
}
