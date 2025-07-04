package com.javaex.ex02;

public class Point {
	//필드
	private int x;
	private int y;
	//생성자
	public Point() {
	super();	//	Object
	}
	public Point(int x, int y) {
		super();	//Object 클래스
		this.x = x;
		this.y = y;
	}
	//메소드gs
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//메소드일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
