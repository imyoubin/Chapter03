package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		//모든 클래스의 부모는 object클래스이다
		Goods camera = new Goods();
		
		camera.hashCode();//내가만든 클래스가 아님
		
		Object obj = new Object();
		System.out.println(obj.getClass());//class java.iang.Object 클래스 정보
		System.out.println(obj.toString());//java.iang.Object@28a418fc 출력정보
		System.out.println(obj.hashCode());//681842940					당분간 주소라고 생강하자 0e333
		System.out.println(obj.equals(camera));//false 					두개가 같냐?
		
	}
}
