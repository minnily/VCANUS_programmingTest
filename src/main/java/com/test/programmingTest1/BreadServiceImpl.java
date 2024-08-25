package com.test.programmingTest1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BreadServiceImpl implements BreadService{

	// 빵 종류별 레시피 
	@Override
	public List<Bread> selectRecipe() {
		
		// 1. 레시피 담을 리스트 초기화하기
		List<Bread> breadList = new ArrayList<>();
		
		// 예외 처리하기
		try {
			// 2. 빵 종류별로 레시피 생성하기
			// 1) cream
			Map<String, Integer> creamRecipe = new HashMap<>();
	        creamRecipe.put("flour", 100);
	        creamRecipe.put("water", 100);
	        creamRecipe.put("cream", 200);
		        
			// 2) sugar
	        Map<String, Integer> sugarRecipe = new HashMap<>();
	        sugarRecipe.put("flour", 100);
	        sugarRecipe.put("water", 50);
	        sugarRecipe.put("sugar", 200);
		        
			// 3) butter
	        Map<String, Integer> butterRecipe = new HashMap<>();
	        butterRecipe.put("flour", 100);
	        butterRecipe.put("water", 100);
	        butterRecipe.put("butter", 50);
		            
		     // 3. Bread 객체 생성 후 리스트에 추가
	        breadList.add(new Bread("cream", creamRecipe));
	        breadList.add(new Bread("sugar", sugarRecipe));
	        breadList.add(new Bread("butter", butterRecipe));
		} catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
	    // 4. 생성된 빵 객체 리스트 반환
	    return breadList;
		
	}

}
