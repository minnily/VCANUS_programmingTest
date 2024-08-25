package com.test.programmingTest1;

import java.util.List;
import org.springframework.stereotype.Controller;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@AllArgsConstructor
@Slf4j
public class BreadController {
	
	
	private final BreadService service;
	
	public void test1() {
		// 1. BreadService를 사용하여 빵 레시피 리스트 생성하기
		List<Bread> breadList = service.selectRecipe();
        
		// 2. 생성된 빵 리스트를 순회하며 출력하기
        for (Bread bread : breadList) {
            System.out.println(bread.toString()); 
        }
	}

	
}
