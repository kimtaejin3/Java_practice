import java.util.Scanner;

public class ArrayProc {
	private int[] array;
	
	
	public void getValue(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.print("성적을 입력하세요: ");
			Scanner scan=new Scanner(System.in);
			array[i]=scan.nextInt();
		}
	}
	
	public double getAverage(int[] array) {
		double sum=0;
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		return (double)sum/array.length;
	}
	
	
}
