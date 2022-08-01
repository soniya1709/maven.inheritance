package inheritance.single_table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestSingleTableInheritance {
public static void main(String[] args) {
	Employee emp1=new Employee();
	emp1.setName("AAA");
	
	
	RegularEmployee emp2=new RegularEmployee();
	emp2.setName("BBB");
	emp2.setSalary(80000);
	emp2.setBonus(35000);
	
	
	ContractEmployee emp3=new ContractEmployee();
	emp3.setName("CCC");
	emp3.setPay_per_hour(8);
	emp3.setDuration("one year");
	
	Configuration con=new Configuration();
	con.configure();
	SessionFactory factory=con.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(emp1);
	session.save(emp2);
	session.save(emp3);
	tx.commit();
	session.close();
	factory.close();
}
}
