package com.test.programmingTest2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Lombok 어노테이션을 사용해 메서드와 생성자들을 자동으로 생성하기
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Calculator {
	
	 // 연산 수행 시 사용하는 내부 상태값 나타내는 변수 선언
	 private int value;

	    // 더하기 메서드
	    public Calculator add(int number) {
	        this.value += number;
	        return this; 
	    }

	    // 빼기 메서드
	    public Calculator subtract(int number) {
	        this.value -= number;
	        return this;
	    }

	    // 현재 값을 반환하는 메서드
	    public int out() {
	        return this.value;
	    }

	}
