package inheritance.table_per_class;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
	@AttributeOverride(name="id", column = @Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})
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
