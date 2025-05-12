package com.javaex.ex06;

public class Ex01 {
	
	//필드
	//생성자
	//메소드gs
	//메소드일반
	public static void main(String[] args) {
		
		//우리가 알고 있는 일반적인 규칙
		String s01 = new String("안녕하세요");
		String s02 = new String("안녕하세요");
		//String str01 = "굿모닝";
		
		System.out.println(s01.toString());
		System.out.println(s02.toString());
		
		System.out.println(s01==s02);	// ==주소가 같니?
		System.out.println(s01.equals(s02));	//글자가 같니?
		System.out.println("-------------------------------");
		///////////////////////////////////////////////
		//String 약식으로 사용할떄
		//같은 문자열이 있는지 체크함
		//있으면 새로 만들지 않고 같은곳 기다림
		//-->문자열을 변경하면 같이 변경되어야함 -->이렇게 되면 안됨
		
		String str00 = "hi";
		String str01 = "굿모닝";
		String str02 = "굿모닝";	//str01과 같은 주소
		
		System.out.println(str00.toString());
		System.out.println(str01.toString());
		System.out.println(str02.toString());
		System.out.println("-------------------------------");
		System.out.println(str01==str02);	//주소가 같음을 확인	
		System.out.println(str01.equals(str02));	//값을 비교할때 equals() 사용
		
		//****문자열을 변경하면 메모리에서는 변경되어야 하나
		//실제로는 따로 변경됨		
		//약식으로 문자열 만들고 같은 주소를 갖을경우 변경할수 없다
		//문자열을 변경하면 새로만듬
		str01 ="굿이브닝";
		System.out.println(str01==str02);	// 주소가 바뀐다 -->새로만들었음
				
		System.out.println(str01.toString());
		System.out.println(str02.toString());
		
	}
	
}
