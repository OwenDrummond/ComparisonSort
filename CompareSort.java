import java.util.Random;
import java.util.Arrays;

public class CompareSort
{
    public static void main(String[] args)
    {
        int size = 100; 
        int start = 1;
        int end = 100;
        int[] randomArrayBubble = RandomizedArray(size, start, end);
        int[] randomArraySelection = randomArrayBubble;
        
        long startTime = System.nanoTime();
        
        BubbleSort(randomArrayBubble);
        
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        
        
        long startTime1 = System.nanoTime();
        
        SelectionSort(randomArraySelection);
        
        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;
        
        System.out.println("Sorting a random array size of " + size + " took bubble sort " + elapsedTime + " nanoseconds to complete.");
        System.out.println("Sorting a random array size of " + size + " took selection sort " + elapsedTime1 + " nanoseconds to complete.");

    }
    public static int[] RandomizedArray(int size, int start, int end)
    {
        int[] arrayResult = new int[size];
        Random random = new Random(); 
        
        for(int i = 0; i < size; i++)
        {
            int randomVal = random.nextInt(end) + start;
            arrayResult[i] = randomVal;
        }
        return arrayResult;
    }
    public static void BubbleSort(int[] array)
    {
        boolean swap; 
        int n = array.length;
        
        for(int i = 0; i < n -1; i++)
        {
            swap = false;
            for(int j = 0; j < n - i - 1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == false)
            {
                break;
            }
        }
        
        System.out.println(Arrays.toString(array));
    }
    public static void SelectionSort(int[] arr)
    {
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++)
        {
            int min = i;
            
            for(int j = i + 1; j < n; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            int temp1 = arr[i];
            arr[i] = arr[min];
            arr[min] = temp1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
