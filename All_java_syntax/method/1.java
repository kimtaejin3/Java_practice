import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	//c와는 다르게 예외처리를 해줌, 더 엄격한 규칙
	public static void main(String[] args)  {
	

		String[] name=new String[1000];
		String[] number=new String[1000];
		int n=0;
		
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
		
		for(int i=0; i<n; i++)
		{
			System.out.println(name[i]+": "+number[i]);
		}
	}
}
