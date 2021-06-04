package heapsort;

public class HeapSort {

	public int getParent(int child) {
		return (child - 1)/2;
	}
	
	public void heapify(int []arr,int parent, int last) {
		int left = 2 * parent + 1;
		int right = 2 * parent + 2;
		int large = parent;
	
		if(left < last && arr[large] < arr[left]) {
			large = left;
		}
		
		if(right < last && arr[large] < arr[right]) {
			large = right;
		}
		
		if(large != parent) {
		  swap(arr,large,parent);
		  heapify(arr,large,last);
		}
	}
	
	public void swap(int[] arr, int m, int n) {
		int temp = 0;
		temp = arr[m];
		arr[m] = arr[n];
		arr[n] = temp;
		
	}
	
	public void sort(int []arr) {
		int size = arr.length;
		int parent = getParent(size-1);
		for(int i = parent; i >=0; i--) {
			heapify(arr, i, size-1);
		}
		for(int i = size -1; i >0; i--) {
			swap(arr,0,i);
			heapify(arr,0,i-1);
		}
		
	}
	public void Print(int []arr) {
		int n = arr.length;
		for(int i = 0; i < n; ++i) {
			System.out.println(arr[i] + " ");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort h1 = new HeapSort();
		int[] arr = {3,1,7,6,4,8,2};
		h1.sort(arr);
		h1.Print(arr);
       
	}

}
