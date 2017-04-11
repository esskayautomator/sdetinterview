package sorting;

public class MyOwnInsertion 
{
	



	
	
	public static void main(String[] args) {
		
		int[] arr = {5,8,1, 3, 9, 7};
		
		int temp, key ;
		for(int i =0; i<arr.length;i++){
			
			key= arr[i];
			for(int j =0;j<i;j++){
				
				
				if (key<arr[j]){
					
					
					temp = arr[j-1];
					arr[j-1]= arr[j];
					arr[j]= temp;
					
				}
			}
			
			
		}
		
		for(int list:arr){
			System.out.print(list);
		}
	
		
		
		
		
		
	}

}
