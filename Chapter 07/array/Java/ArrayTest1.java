package array;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		double[] studentIDs = new double[5];
		
		for(int i = 0; i < studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		}

	}

}
