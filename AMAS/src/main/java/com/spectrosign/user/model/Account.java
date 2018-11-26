package com.spectrosign.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Account {
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
private int id;
private double amount;
@ManyToOne
private User payer;


private String status;
private String amounttype;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public User getPayer() {
	return payer;
}
public void setPayer(User payer) {
	this.payer = payer;
}

public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getAmounttype() {
	return amounttype;
}
public void setAmounttype(String amounttype) {
	this.amounttype = amounttype;
}
public Account(int id, double amount, User payer, String status, String amounttype) {
	super();
	this.id = id;
	this.amount = amount;
	this.payer = payer;
	
	this.status = status;
	this.amounttype = amounttype;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(amount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((amounttype == null) ? 0 : amounttype.hashCode());
	result = prime * result + id;
	result = prime * result + ((payer == null) ? 0 : payer.hashCode());

	result = prime * result + ((status == null) ? 0 : status.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Account other = (Account) obj;
	if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
		return false;
	if (amounttype == null) {
		if (other.amounttype != null)
			return false;
	} else if (!amounttype.equals(other.amounttype))
		return false;
	if (id != other.id)
		return false;
	if (payer == null) {
		if (other.payer != null)
			return false;
	} else if (!payer.equals(other.payer))
		return false;
	
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	return true;
}
@Override
public String toString() {
	return "Account [id=" + id + ", amount=" + amount + ", payer=" + payer + ", status="
			+ status + ", amounttype=" + amounttype + "]";
}

}