package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {8,7,9,2,3,1,5,4,6};
		
		selectonSort(array);
		
		for(int i : array) {
			System.out.print(i+" ");
		}

	}

	private static void selectonSort(int[] array) {
		// TODO Auto-generated method stub
		for(int i =0; i<array.length-1;i++) {
			int min =i;
			for(int j =i+1; j<array.length;j++) {
				if(array[min]>array[j]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i]= array[min];
			array[min]= temp;
		}
		
	}

}
