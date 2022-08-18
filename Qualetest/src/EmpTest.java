

public class EmpTest {

	public static void main(String[] args) {
		
		
		Employe emp1 = new Employe("Udara", "913252274V", "12,Kottawa,Pannipitiya" , "23vnm","SDB12");
		Employe emp2 = new Employe("Waruna", "941131522V", "128/E,Mattegoda", "2fds2", "SSD23");
		Employe emp3 = new Employe("Nisansala", "909006535V", "34,Gall Road,Hikkaduwa", "23vnm", "SDB12");
		
		if ( emp1.equals( emp2 ) )
		{
			System.out.println("Emp 1 and Emp2 are equal");
		}
		else
		{
			System.out.println(" " );
		}
		if ( emp2.equals( emp3 ) )
		{
			System.out.println( "Emp 2 and Emp3 are equal" );
		}
		else
		{
			System.out.println( " " );
		}
		if ( emp3.equals( emp1 ) )
		{
			System.out.println( "Emp 1 and Emp3 are equal\" " );
		}
		else
		{
			System.out.println( " " );
		}
		

	}

}
