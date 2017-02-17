

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Extra_Credit {

	public static void merge(int[] nums1, int m, int[] nums2, int n){

		int i = 0;
		int j = 0;
		int k = 0;

		int[] result = new int[m+n];

		//Keep looping to get the numbers in the array in ascending order, we will be left with one
		while(i<m && j<n){
			if(nums1[i]<nums2[j]){
				result[k++]=nums1[i++];
			}
			else{
				result[k++]=nums2[j++];
			}
		}
		//To get the last element from the array, do the below, one of the while loops will not have an output, which is okay
		while(i<m){
			result[k++]=nums1[i++];
		}
		while(j<n){
			result[k++]=nums2[j++];
		}
		System.out.println(Arrays.toString(result)); //Print the result
	}


	public static List<Integer> spiralOrder(int[][] matrix){

		List<Integer> result = new ArrayList<Integer>();

		int m = matrix.length;
		int n = matrix[0].length;
		int rbeg=0; //Initializing the first row
		int rlst=m-1; //Initializing the last row
		int cbeg=0; //Initializing the first column
		int clst=n-1; //Initializing the last column
		int  i; //Variable to iterate

		while(rbeg<m && cbeg<n){

			//Loop the first row
			for(i=cbeg;i<=clst;++i){
				result.add(matrix[rbeg][i]);
			}
			rbeg++;	//One row is already printed, so increment it(from the first row) 

			//Loop the last column
			for(i=rbeg;i<=rlst;++i){
				result.add(matrix[i][clst]);
			}
			clst--;	//This column is already printed, so decrement it(from the last column)

			//Loop the last row from last column
			for(i=clst;i>=cbeg;--i){
				result.add(matrix[rlst][i]);
			}
			rlst--;

			//Loop the first column from the last row
			for(i=rlst;i>=rbeg;--i){
				result.add(matrix[i][cbeg]);
			}
			cbeg++;
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args){

		int[] mergeArray1 = {1,6,7};
		int[] mergeArray2 = {2,3,8};

		merge(mergeArray1,3,mergeArray2,3);

		int[][] spiralMatrix = {{1,2,3},{4,5,6},{7,8,9}};
		spiralOrder(spiralMatrix);

	}




}
