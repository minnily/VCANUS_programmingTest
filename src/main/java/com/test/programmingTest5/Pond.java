package com.test.programmingTest5;

public class Pond {
	
	public static void main(String[] args) {
		
		// 연못 상태 초기화 하기 earth 땅=0/ water 물=1 (2차원 배열)
        int[][] pond = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
		
        int rows = pond.length; // 연못 배열의 행 수
        int cols = pond[0].length; // 연못 배열의 열 수 
        boolean changed = true; // 배열이 변경되었는지 추적하기 위한 변수

        // 값을 증가시키기 위한 While로 반복함
        while (changed) { 
            changed = false; // 변경 여부 초기화 
            int[][] newPond = new int[rows][cols]; 

            // 현재 연못 배열을 복사하여 새로운 상태로 생성
            for (int i = 0; i < rows; i++) {
                System.arraycopy(pond[i], 0, newPond[i], 0, cols);
            }
            // for문을 통해 연못 배열을 하나씩 접근해 물의 깊이 증가시키기
            for (int i = 1; i < rows - 1; i++) {
                for (int j = 1; j < cols - 1; j++) {
                    if (pond[i][j] > 0) {  // 값이 1인경우(= 물))
                        // 물이 1이상인 주변(상, 하, 좌, 우)의 값이 현재 값보다 크거나 같으면
                        if (pond[i - 1][j] >= pond[i][j] &&
                            pond[i + 1][j] >= pond[i][j] &&
                            pond[i][j - 1] >= pond[i][j] &&
                            pond[i][j + 1] >= pond[i][j]) {
                        	// 현재 위치의 값을 1 증가시키고 배열이 변경됨을 표시함
                            newPond[i][j]++;
                            changed = true;
                        }
                    }
                }
            }
            // 연못의 현재 상태를 새로운 상태의 배열로 변경함.
            pond = newPond;
        }

        // 최종 연못 배열 출력
        System.out.println("최종 상태:");
        for (int[] row : pond) {
            for (int depth : row) {
                System.out.print(depth + " ");
            }
            System.out.println();
        }

        // 연못 물 깊이의 총합 계산
        int totalDepth = 0; //총 합을 담을 변수
        for (int[] row : pond) {
            for (int depth : row) {
                totalDepth += depth;
            }
        }
        System.out.println("연못 물 깊이 총합: " + totalDepth);
    }
	
	
}


