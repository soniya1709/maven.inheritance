package inheritance.joined_table;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
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
