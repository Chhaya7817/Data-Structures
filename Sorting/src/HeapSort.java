public class HeapSort {
    void maxHeapify(int arr[],int n,int i)
    {
        int largest=i,left=2*i+1,right=2*i+2;
        if(left<n && arr[left]>arr[largest])
            largest=left;
        if(right<n && arr[right]>arr[largest])
        largest=right;
        if(largest!=i)
        {
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            maxHeapify(arr, n, largest);
        }
    }
    void buildHeap(int arr[],int n)
    {
        for(int i=(n-2)/2;i>=0;i--)
        {
            maxHeapify(arr, n, i);
        }
    }
    void heapSort(int arr[],int n)
    {
        buildHeap(arr,n);
        for(int i=n-1;i>=1;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            maxHeapify(arr, i, 0);
        }
    }
    public static void main(String[] args) {
        HeapSort obj=new HeapSort();
        int arr[]={10,52,36,45};
        
        obj.heapSort(arr, arr.length);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
        
    }
    
}
