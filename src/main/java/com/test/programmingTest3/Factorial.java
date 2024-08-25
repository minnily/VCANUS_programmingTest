package com.test.programmingTest3;

public class Factorial {
	public static void main(String[] args) {
		// result라는 변수에 호출한 factorial(4) 값을 저장
		int result = factorial(4);
		// 결과 출력
		System.out.println(result);
	}

	// factorial 계산하는 재귀함수 메서드
	private static int factorial(int i) {
		// 종료조건 (i가 0일때 함수 종료,1반환)
		if(i==0){
			return 1;
		}else {
			// 해당 조건이 아닌경우 i에 i-1한 값을 곱해 계산
			return i*factorial(i-1);
		}
		
	}
}
