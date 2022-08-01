package inheritance.joined_table;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class RegularEmployee extends Employee{
int salary;
int bonus;
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
@Override
public String toString() {
	return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
}

}
