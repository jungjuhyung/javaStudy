package com.ict.day19;

import java.io.File;

/*
	File 클래스 : 특정위치에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
	- 주요 생성자 : File(String 경로), File(String 상위경로, String 하위경로)
				File(File 상위경로, File 하위경로)
	- 주요 메서드 : .createNewFile() : 파일 생성
				.mkdir() : 만들 때 상위 디렉토리 없으면 생성불가
				.mkdirs() : 만들 때 상위 디렉토리가 없으면 상위 디렉토리까지 생성
				.delete() : 삭제
				.isFile() : 파일이면 true
				.isDirectory() : 디렉토리면 true
				.exists() : 파일이 있으면 true // contain과 비슷한 포함여부 확인
				.getName() : 이름 반환
				.length() : 파일의 크기를 byte로 반환(디렉토리는 크기가 없다)
				.list() : 특정 위치의 내용을 String 배열로 만들어서 저장, 가지고 있는 파일 및 디렉토리명 String 배열로 반환
				.getAbsolutePath() : 절대주소
				.getPath() : 상대주소
				
				파일 크기
				bit(0,1), Byte(8bit), KB(1024Byte), MB(1024KB),....
 */
public class Ex06 {
	public static void main(String[] args) {
		//String pathname = "D:\\jjh\\javastudy";
		String pathname = "D:/jjh/javastudy"; // 이렇게 써도 된다. 애는 부모 경로
		File file = new File(pathname);
		String[] arr = file.list(); // file이 가지고 있는 파일 및 디렉토리명 String 배열 반환
		for (String k : arr) {
			//System.out.println(k);
			File file2 = new File(pathname, k); // 그래서 부모주소와 list를 통해 나온 자식 주소 넣기
			//System.out.println(file2);
			if (file2.isDirectory()) {
				System.out.println("디렉토리 : "+k);
			}else {
				System.out.println("파일"+k+","+k.length()+"Byte");
				System.out.println("파일"+k+","+(int)(Math.ceil(1.0*k.length()/1024))+"KB");
			}
		}
		
		
		
	}
}
