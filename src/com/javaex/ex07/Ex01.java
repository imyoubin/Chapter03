package com.javaex.ex07;

public class Ex01 {
	//메소드일반
	public static void main(String[] args) {
		
		int a=4;
		System.out.println(a);
		
		Integer i = new Integer(3);
		System.out.println(i);
		
		Integer sum = new Integer(3) + new Integer(3);
		System.out.println(sum);
		
		//박싱
		Integer v01=3;		//new Integer(3); --> 박싱
		System.out.println(v01);
		
		//언박싱
		Integer i01 = new Integer(3);	// i01은 주소
		int b=i01;						//언박싱
		System.out.println(b);
		
		System.out.println("------------------------------");
		
		
		//덜 좋은방식 --> 의미없는 99를 넣어야함
		//Integer r01=new Integer(3);
		Integer r01=3;		//박싱
		int reuslt = r01.parseInt("12345");	//"12345"  --> 숫자로 변경(12345)
		System.out.println(reuslt+3);
		
		//조금 더 좋은 방식 -->문자열을 정수로 바꿔주는 방식
		int reuslt01=Integer.parseInt("12345");
		System.out.println(reuslt01+3);
		//////////////////////////////////////////////////////
		
		//정수를 문자열로	12345 -->"13245"
		//절 좋은 방식 -->필요없는 "안녕"을 만들어야함
		String s =new String("안녕하세요");
		String sNum = s.valueOf(1345);
		System.out.println(sNum+i);
		
		//조금더 좋은 방신 (정수,실수-->문자열) static 공부
		String sNum2= String.valueOf(13245.4);
		System.out.println(sNum2);
		
		//(실수-->문자열) static 공부,메소드 오버로딩		
		String sNum3= String.valueOf(13245.33333);
		System.out.println(sNum3);
		
		//숫자-->문자열
		//System.out.println(12345+1);
		String sNum4=""+13245;
		System.out.println(sNum4+1);
		
		
		
	}

}
