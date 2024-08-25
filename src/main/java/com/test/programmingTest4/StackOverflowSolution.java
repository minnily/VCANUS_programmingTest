package com.test.programmingTest4;

public class StackOverflowSolution {
	
	public static void solution(int i) {
		// result라는 변수에 호출한 overFlowFactorial 결과를 저장
		long result = overFlowFactorial(i,1);
		// 결과 출력
		System.out.println(result);
	}

	// 입력 값이 큰 경우 StackOverflow 해결 방법
	private static long overFlowFactorial(int i, long parm) {
		// while을 사용해 반복구조로 생성
		while( i> 1){ 
			//누적된 곱을 저장하는 parm 변수
			parm *=i;
			// 다음 값으로 넘어가기 위ㅣ해 1감소시키기
			i--;
		}
		//현재 parm과 i를 곱하고 i를 감소시키며 재귀호출
		return parm;
		
	}
}
