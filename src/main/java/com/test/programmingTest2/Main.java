package com.test.programmingTest2;

public class Main {
	
	 // 체이닝 메소드로 결과 출력하기
	 public static void main(String[] args) {
		 
		// calculator 객체 생성
	    Calculator calculator = new Calculator();
	    // 연산 수행하기
	    int result = calculator.add(4).add(5).subtract(3).out();
	    // 결과 출력하기
	    System.out.println(result); 
	 }
}
