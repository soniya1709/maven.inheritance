package inheritance.single_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Contr-Emp")
public class ContractEmployee extends Employee{
int pay_per_hour;
String duration;
public int getPay_per_hour() {
	return pay_per_hour;
}
public void setPay_per_hour(int pay_per_hour) {
	this.pay_per_hour = pay_per_hour;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "ContractEmployee [pay_per_hour=" + pay_per_hour + ", duration=" + duration + "]";
}

}
