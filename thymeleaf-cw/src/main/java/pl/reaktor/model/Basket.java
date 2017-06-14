package pl.reaktor.model;

public class Basket {
	private String p1, p2, p3; //products
	private double c1, c2, c3, sum; //price
	private int i1, i2, i3; //quantity
	
	public Basket(){}
	
	public Basket(int i1, int i2, int i3) {
		this.i1 = i1;
		this.i2 = i2;
		this.i3 = i3;
	}
	
	public void suma() {
		sum = c1 + c2 + c3;
	}
	
	public String getP1() {
		return p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
	}

	public String getP2() {
		return p2;
	}

	public void setP2(String p2) {
		this.p2 = p2;
	}

	public String getP3() {
		return p3;
	}

	public void setP3(String p3) {
		this.p3 = p3;
	}

	public double getC1() {
		return c1;
	}

	public void setC1(double c1) {
		this.c1 = c1;
	}

	public double getC2() {
		return c2;
	}

	public void setC2(double c2) {
		this.c2 = c2;
	}

	public double getC3() {
		return c3;
	}

	public void setC3(double c3) {
		this.c3 = c3;
	}

	public int getI1() {
		return i1;
	}

	public void setI1(int i1) {
		this.i1 = i1;
	}

	public int getI2() {
		return i2;
	}

	public void setI2(int i2) {
		this.i2 = i2;
	}

	public int getI3() {
		return i3;
	}

	public void setI3(int i3) {
		this.i3 = i3;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}
	
	
	
}
