package sorting;

public class BubbleSortExample {  
	public static int[] bubbleSort (int[] list) {
		int i, j, temp = 0;
		for (i = 0; i < list.length - 1; i++) {
			for (j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		return list;
	}
    public static void main(String[] args) {  
                int[] arr ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
               /* for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                
                
                
   */
                
                for(int k: arr){
                	System.out.print(k+ " ");
                }
        }  
}  