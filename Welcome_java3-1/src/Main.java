
public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee("������",4800);
		Employee e2=new Employee("������",3900);
		e2.finalize();
		
		System.out.println("���� ���� ��: "+Employee.getCount());

	}

}
