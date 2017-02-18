import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Extra_Credit {

	public static void merge(int[] nums1, int m, int[] nums2, int n){

		int i = 0;
		int j = 0;
		int k = 0;

		int[] result = new int[m+n];

		if(nums1.length==0){
			System.out.println("The array nums1 is empty.Printing array nums2 alone "+Arrays.toString(nums2));
		}
		else if(nums2.length==0){
			System.out.println("The array nums2 is empty.Printing array nums1 alone "+Arrays.toString(nums1));
		}
		else{
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


			for(i=cbeg;i<=clst;i++){  //Loop beginning the first row
				result.add(matrix[rbeg][i]);
			}
			rbeg++;	//One row is already printed, so increment it(from the first row) 


			for(i=rbeg;i<=rlst;i++){  //Loop from the last column
				result.add(matrix[i][clst]);
			}
			clst--;	//This column is already printed, so decrement it(from the last column)


			for(i=clst;i>=cbeg;i--){  //Loop from the last row
				result.add(matrix[rlst][i]);
			}
			rlst--;


			for(i=rlst;i>=rbeg;i--){  //Loop the first column
				result.add(matrix[i][cbeg]);
			}
			cbeg++;
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args){

		int[] mergeArray1 = {1,4,7};
		int[] mergeArray2 = {2,8,9};

		merge(mergeArray1,3,mergeArray2,3);

		int[][] spiralMatrix = {{1,2,3},{4,5,6},{7,8,9}};
		spiralOrder(spiralMatrix);

	}
}
