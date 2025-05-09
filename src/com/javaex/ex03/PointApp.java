package com.javaex.ex03;

public class PointApp {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 3;
		int c = 6;
		System.out.println(a==b);	//true
		System.out.println(b==c);	//false
		
		System.out.println("----------------");
		
		//보통의 경우 주소값이 같을수 없다
		Point p01 = new Point(3,3);
		Point p02 = new Point(3,3);		
		System.out.println(p01==p02); // false 0x333==0x789	//조소값이 같냐?
		
		System.out.println(p01.equals(p02));
		
		//주소값이 같을경우
		Point p03 = p01;	//같은주소 복사
		//System.out.println(p03==p01);	//주소값이 같냐?
		
		
		
	}
	

}
