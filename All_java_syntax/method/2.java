import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	static String[] name=new String[1000];
	static String[] number=new String[1000];
	static int n=0;
	
	//c와는 다르게 예외처리를 해줌, 더 엄격한 규칙
	public static void main(String[] args)  {
	

		try {
			Scanner infile = new Scanner(new File("input.txt"));
			
			while(infile.hasNext()) {// detect end of file
				name[n]=infile.next();
				number[n]=infile.next();
				n++;
			}
			
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			//return;프로그램 종류
			System.exit(1);//0으로 프로그램의 정상적인 종류
		}
		
		bubbleSort();
		
		for(int i=0; i<n; i++)
		{
			System.out.println(name[i]+": "+number[i]);
		}
	}
	
	static void bubbleSort() {
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<i; j++)
			{
				if(name[j].compareTo(name[j+1])>0) {//name[j]가 더큰지 검사
					String tmp=name[j];
					name[j]=name[j+1];
					name[j+1]=tmp;
					
					tmp=number[j];
					number[j]=number[j+1];
					number[j+1]=tmp;
					
				}
			}
		}
	}
}
