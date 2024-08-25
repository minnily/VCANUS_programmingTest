package com.test.programmingTest1;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// Lombok 어노테이션을 사용해 메서드와 생성자들을 자동으로 생성하기
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bread {
	
	// 필드 설정하기
	private String breadType; // 빵종류
	private Map<String,Integer> recipe; // 레시피(재료명,양) Map으로 담기
	
	// 원하는 결과 방식으로 출력하기 위한 toString 작성하기
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("breadType: ").append(breadType).append("\nrecipe\n");
		for (String key : recipe.keySet()) {
		    sb.append(key).append(": ").append(recipe.get(key)).append("\n");
		}
		return sb.toString();
		
		
	}

	
}
