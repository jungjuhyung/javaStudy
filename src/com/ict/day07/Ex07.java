package com.ict.day07;

import java.util.Iterator;

public class Ex07 {
	public static void main(String[] args) {
		// 순위 구하기
		// 크기 비교 + rank의 값을 올려야되기 때문에 오름차순과는 다르게 싸이클마다 처음부터 끝까지 비교한다.
		// rank를 모두 1로 줬기 때문에 앞에 있는 값과도 비교해서 순위를 누적으로 쌓아야한다.
		int[] su = {90,80,70,95,65,85,75};
		int[] rank = {1,1,1,1,1,1,1};
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if(i == j) {
					continue;
				}else if (su[i] < su[j]) {
					rank[i] = rank[i]+1; // rank[i]++로도 작성 가능
				}
			}
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}
		
		
	}
}
