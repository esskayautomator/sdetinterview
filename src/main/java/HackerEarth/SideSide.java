package HackerEarth;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SideSide 
{

	private static int[] moveZeroes(int[] a) {

		int index = -1;
		int num_zeroes = 0;

		// find the first zero
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				index = i;
				num_zeroes++;
				break;
			}
		}
		if (index != -1) {
			int j = index + 1;
			while (j < a.length) {
				if (a[j] != 0) {
					a[index] = a[j];
					index++;
					j++;
				} else if (a[j] == 0) {
					j++;
					num_zeroes++;
				}
			}
			while(num_zeroes-- > 0){
				a[index++]=0;
			}			
		}
		return a;
	}
		public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        int[] res;
	        
	        int _nums_size = 0;
	        _nums_size = Integer.parseInt(in.nextLine().trim());
	        int[] _nums = new int[_nums_size];
	        int _nums_item;
	        for(int _nums_i = 0; _nums_i < _nums_size; _nums_i++) {
	            _nums_item = Integer.parseInt(in.nextLine().trim());
	            _nums[_nums_i] = _nums_item;
	        }
	        
	        res = moveZeroes(_nums);
	        for(int res_i=0; res_i < res.length; res_i++) {
	            bw.write(String.valueOf(res[res_i]));
	            bw.newLine();
	        }
	        
	        bw.close();
	    }
	}