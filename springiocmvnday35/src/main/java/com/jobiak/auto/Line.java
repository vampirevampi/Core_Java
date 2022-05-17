package com.jobiak.auto;

public class Line {
	private Point a;
	private Point b;
	public Line(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Line() {
		super();
	}
	/**
	 * @return the a
	 */
	public Point getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(Point a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public Point getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(Point b) {
		this.b = b;
	}
	public void draw() {
		System.out.println(a+"to"+b);
	}

}
