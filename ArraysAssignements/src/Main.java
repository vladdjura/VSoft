import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array  = {1,4,1000,51,4,100};
		int[] array2 = {5,55,10006,26,11,7,19,3333};
		String [] sArray = {"BMW","Audi","Aston-Martin","Audi"};
		String [] strArray = {"Budweiser","Corona","Becks","BMW"};
		Integer[]intArray = new Integer[array.length];
		intArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
		/*calculateAverage(array);
		specialValues(array, 5);
		findIndex(array, 4);
		remove(array, 4);
		minMax(array);
		reverseArray(array);
		
		findDuplicate(array);
		findDuplicateString(sArray);
		findSimiliarValue(sArray,strArray);
		uniqueArray(array);
		secondLargestElement(array);
		secondSmallestElement(array);
		evenOdd(array);
		largestKElement(intArray, 3);
		smallestKElement(intArray);
		swapTwoArraysWithTemp(array, array2);
		swapThreeNumbers(3, 5, 8);*/
		copyAllElements(array, array2);
		arrayFrequency(array);
		arrayReverseOrder(array2);
		evenIndexNumbers(array2);
		oddIndexNumber(array2);
		sumAllElements(array2);
		sortACS(array2);
		sortDSC(array2);
	}
	public static void calculateAverage(int [] array) {
		double result = 0;
		for(int a:array) {
			result += a;
		}
		result /= array.length;
		System.out.println("Average value of array is "+result);
		
	}
	
	public static void specialValues(int []array, int specialValue) {
		boolean flag = false;
		for(int i:array) {
			if(i == specialValue) {
				System.out.println("Value exist in this array");
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Value does not exist in this array");
		}
	}
	public static void findIndex(int []array, int value) {
		boolean flag = false;
		for(int i = 0; i<array.length;i++) {
			if(array[i]==value) {
				System.out.println("Index of the array element is: "+i);
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Value does not exist in this array");
		}
	}
	public static void remove(int []array, int removedValue) {
		System.out.println("Array before deleting "+Arrays.toString(array));
		for(int i = 0;i <=array.length;i++) {
			if(array[i]==removedValue) {
				for(int j = i;j<array.length-1;j++) {
					array[j]=array[j+1];
					
				}
				break;
				
			}
		}
		System.out.println("Array after deleting "+Arrays.toString(array));
		
	}
	public static void minMax(int []array) {
		int min = array[0];
		int max = array[0];
		for(int i = 1;i<array.length-1;i=i+2) {
			if(i+1>array.length) {
				if(array[i]>max) {
					max = array[i];
				}
				if(array[1]<min) {
					min = array[i];	
				}
			}
			if(array[i]>array[i+1]) {
				if(array[i]>max) {
					max = array[i];
				}
				if(array[i+1]<min) {
					
					min = array[i+1];	
				}
			}
			if(array[i]<array[i+1]) {
				if(array[i+1]>max) {
					max = array[i+1];
				}
				if(array[1]<min) {
					min = array[i];	
				}
			}
			}
		System.out.println("Array " + Arrays.toString(array));
		System.out.println("Max value from the array "+max);
		System.out.println("Min value from the array "+min);
		
	}
	public static void reverseArray(int []array) {
		int[] reverse = new int [array.length];
		int counter = 0;
		
		for(int i = array.length-1;i>=0;i--) {
			reverse[counter]=array[i];
			counter++;
			
		}
		System.out.println("Array " + Arrays.toString(array));
		System.out.println("Reverse Array " + Arrays.toString(reverse));
	}
		public static void findDuplicate(int [] array){
        for (int i = 0; i < array.length-1; i++)        {
            for (int j = i+1; j < array.length; j++)
            {
                if (array[i] == array[j] && i != j)
                {
                    System.out.println("Duplicate Element : "+array[j]);
                }
            }
        }
    }
		public static void findDuplicateString(String[]array) {
			
			for (int i = 0; i < array.length-1; i++)        {
            for (int j = i+1; j < array.length; j++)
            {
                if (array[i].equals(array[j]) && i != j)
                {
                    System.out.println("Duplicate Element : "+array[j]);
                }
            }
        }
			
		}
		public static void findSimiliarValue(String[]array1, String[]array2) {
			
			HashSet<String> set = new HashSet<>();

	        for (int i = 0; i < array1.length; i++)
	        {
	            for (int j = 0; j < array2.length; j++)
	            {
	                if(array1[i].equals(array2[j]))
	                {
	                    set.add(array1[i]);
	                }
	            }
	        }

	        System.out.println("Common element : "+(set));

		}
	
		
		public static void uniqueArray(int[] myArray) {
	        System.out.println("Original Array : ");

	        for (int i = 0; i < myArray.length; i++) {
	            System.out.print(myArray[i] + " ");
	        }

	        int noUniqueElements = myArray.length;


	        for (int i = 0; i < noUniqueElements; i++) {
	            for (int j = i + 1; j < noUniqueElements; j++) {

	                if (myArray[i] == myArray[j]) {

	                    myArray[j] = myArray[noUniqueElements - 1];

	                    noUniqueElements--;

	                    j--;
	                }
	            }
	        }


	        int[] array1 = Arrays.copyOf(myArray, noUniqueElements);
	        System.out.println();
	        System.out.println("Array with unique values : ");

	        for (int i = 0; i < array1.length; i++) {
	            System.out.print(array1[i] + " ");
	        }
	        System.out.println();

	    }
		public static void secondLargestElement(int[] array) {
			
			int temp = 0;
			for(int i = 0; i < array.length;i++) {
				for(int j = i+1;j<array.length;j++) {
					if(array[i]>array[j]) {
						temp = array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
			System.out.println("The second largest number is: " + array[array.length-2]);
		}
		public static void secondSmallestElement(int []array) {
			Arrays.sort(array);
			System.out.println("The second smallest number is "+ array[1]);
		}
		public static void evenOdd(int []array) {
			int odd = array.length-1;
			int even = 0;
			while(even<odd) {
				while(array[even]%2==0 && even<odd) {
					even++;
				}
				while(array[odd]%2==1 && even<odd) {
					odd --;
				}
				if(even<odd) {
					int temp = array[even];
					array[even]= array[odd];
					array[odd] = temp;
					even++;
					odd--;
				}
			}
			System.out.println(Arrays.toString(array));
		}
		public static void largestKElement(Integer []array, int k) {
			Arrays.sort(array,Collections.reverseOrder());
			for(int i = 0; i<k; i++) {
				System.out.print(array[i]+" ");
			}System.out.println();
		}
		public static void smallestKElement(Integer []array) {
			System.out.println("put the K for the smallest elements in the array. size of array is  "+ array.length );
			int k = sc.nextInt();
			Arrays.sort(array);
			for(int i = 0; i<k;i++) {
				System.out.println(array[i]+" "); 
			}
			System.out.println();
		}
		public static void swapTwoArraysWithTemp(int []array, int []arrayK) {
			System.out.println("original array a "+Arrays.toString(array));
			System.out.println("original array b "+Arrays.toString(arrayK));
			int[] temp;
			if(array.length>arrayK.length) {
				temp = new int[array.length];
				
			}
			else if(arrayK.length>array.length) {
				temp = new int[arrayK.length];
			}else {
				temp = new int[array.length];
			}
			temp = array;
			array = new int[arrayK.length];
			array = arrayK;
			arrayK = new int[temp.length];
			arrayK = temp;
			System.out.println("swap array a "+Arrays.toString(array));
			System.out.println("swap array b "+Arrays.toString(arrayK));
			
			
		}
		public static void swapThreeNumbers(int a, int b, int c) {
			int temp;
			System.out.println("Original a = " +a);
			System.out.println("Original b = " +b);
			System.out.println("Original c = " +c);
			
			temp = a;
			a = c;
			c = b;
			b = temp;
			
			System.out.println("Swapped a = " +a);
			System.out.println("Swapped b = " +b);
			System.out.println("Swapped c = " +c);
		}
		public static void copyAllElements(int []array, int []arrayS) {
			
			int [] temp;
			System.out.println("select 1 to copy array1 into array2");
			System.out.println("select 2 to copy array2 into array1");
			int command = sc.nextInt();
			if(command==1) {
			temp = arrayS;
			arrayS = new int[temp.length+array.length];
			for(int i = 0;i<temp.length;i++) {
				arrayS [i] = temp[i];
			}
			int counter = temp.length;
			for(int i = 0;i<array.length;i++) {
				arrayS[counter]=array[i];
				counter++;
			}
			System.out.println("new array" + Arrays.toString(arrayS));
			}
			else if(command == 2) {
				temp = array;
				array = new int[temp.length+arrayS.length];
				for(int i = 0;i<temp.length;i++) {
					array[i] = temp[i];
				}
				int counter = temp.length;
				for(int i = 0;i<arrayS.length;i++) {
					array[counter]=arrayS[i];
					counter++;
				}
				System.out.println("new array" + Arrays.toString(array));
			}
		}
		public static void arrayFrequency(int []array) {
			int temp []= new int [array.length];
			int v = -1;
			for(int i = 0; i<array.length;i++) {
				int counter = 1;
				for(int j = i+1; j<array.length;j++) {
					if(array[i]==array[j]) {
						counter ++;
						temp[j] = v;
					}
				}
				if(temp[i]!= v) {
					temp[i]=counter;
					
				}
			}
			for(int i = 0;i<temp.length;i++) {
				if(temp[i]!=v) {
					System.out.println(array[i]+" |  "+temp[i]);
				}
			}
		}
		public static void arrayReverseOrder(int []array) {
			System.out.println("original array"+Arrays.toString(array));
			for(int i = array.length-1;i>=0;i--) {
				System.out.print(array[i]+" ");
			}
			System.out.println();
		}
		public static void evenIndexNumbers(int []array) {
			for(int i = 0 ; i <array.length;i+=2) {
				System.out.print(array[i]+ " ");
			}
			System.out.println();
		}
		public static void oddIndexNumber(int []array) {
			for(int i = 1 ; i <array.length;i+=2) {
				System.out.print(array[i]+ " ");
			}
			System.out.println();
		}
		public static void sumAllElements(int []array) {
			int sum = 0;
			for(int i = 0;i<array.length;i++) {
				sum += array[i];
				
			}
			System.out.println("the sum of all elements in array is "+ sum);
			
		}
		public static void sortACS(int[]array) {
			System.out.println("Original array "+Arrays.toString(array));
			int temp = 0;
			for(int i = 0; i<array.length;i++) {
				for(int j = i+1; j<array.length;j++) {
					if(array[i]>array[j]) {
						temp = array[i];
						array[i]=array[j];
						array[j]=temp;
						
					}
				}
			}
			System.out.println("sort by ACS"+Arrays.toString(array));
			
		}
		public static void sortDSC(int []array) {
			System.out.println("Original array "+Arrays.toString(array));
			int temp = 0;
			for(int i = 0; i<array.length;i++) {
				for(int j = i+1; j<array.length;j++) {
					if(array[i]<array[j]) {
						temp = array[i];
						array[i]=array[j];
						array[j]=temp;
						
					}
				}
			
		}
			System.out.println("sort by DSC"+Arrays.toString(array));	
}
}