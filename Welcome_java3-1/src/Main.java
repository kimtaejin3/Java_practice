
public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee("김태진",4800);
		Employee e2=new Employee("최진순",3900);
		e2.finalize();
		
		System.out.println("현재 직원 수: "+Employee.getCount());

	}

}
