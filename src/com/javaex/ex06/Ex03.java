package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		String s01 = new String("안녕하세요");
		String s02 = new String("안녕하세요");
		
		System.out.println(s01==s02);	//주소가 같니? new는 주소가 다름
		System.out.println(s01.equals(s02));	//실제값이 같니? equals() 사용해야함
		
		System.out.println("---------------------------");
		
		String s03 = "굿모닝";
		String s04 = "굿모닝";
		System.out.println(s03==s04);	//주소가 같니? 주소가 같음
		System.out.println(s03.equals(s04));	//주소가 같으므로 실제값은 같다
		
		s03 = "굿이브닝";	//기존값을 바꾸면 문제가 되므로 새로 만든다
		System.out.println(s03==s04);	//주소가 달라짐
		
		System.out.println(s03.equals(s04));	//굿이브닝!!!!! 굿모닝 같니?
		
		System.out.println("---------------------------");
		
		String s05="안녕";
		
		if(s05.equals("안녕")) {
			System.out.println("같다");
		}
		
		System.out.println("---------------------------");
		
		s05=null;
		if("안녕".equals(s01)) {		//순서를 바꿔쓰면 null point 예외사항을 피할수 있다
			System.out.println("같다");
		}	
	}

}
