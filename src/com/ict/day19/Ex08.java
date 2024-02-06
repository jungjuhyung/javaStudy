package com.ict.day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	Stream : 데이터를 원하는 목적지까지 입/출력하는 방법
	종류 : Byte 스트림, 문자 스트림, 결합 스트림, 객체(Object) 스트림
	
	1. 바이트 스트림 : 모든 처리를 1byte 처리(기계 위주)
		대상 : 바이트로 이루어진 모든 파일(사진, 동영상, 소리 등등)
		최상위 클래스 : InputStream(입력), OutputStream(출력)
	2. 문자 스트림 : 모든 처리를 2byte 처리(닝겐 위주)
		대상 : 세계 모든 문자로 구성된 파일을 입출력에 적합
		최상위 클래스 : Reader(입력), Writer(출력)
	
	1-2. 결합 스트림 : 바이트 스트림 => 문자 스트림
		특징 : 기계를 통해 입/출력 된 정보를 사람이 알아볼 수 있도록 입/출력한다.
				바이트 스트림과 문자 스트림 사이에서 중계자 역할 스트림
		최상위 클래스 : InputStreamReader(입력), OutputStreamWriter(출력)
	3. 오브젝트 스트림 : 객체 직렬화 객체 단위로 입/출력
		대상 : 객체
		최상위 클래스 : ObjectInputStream(readObject() : 객체 역직렬화)
					ObjectOutputStream(wiriteObject() : 객체 직렬화)
 */
public class Ex08 {
	public static void main(String[] args) {
		// 바이트 출력 스트림 : OutputStream 자식 클래스 FileOutputStream 사용
		// 컴퓨터 입장에서는 컴퓨터가 파일에 입력하는 것이 곧 출력이다.
		//			FileOutputStream : 해당 파일에 내용을 1byte 쓰기(출력)
		//	주요메서드 : write(int b) : int -> 숫자(아스키코드(0~255), 한 글자
		//						**아스키 코드(숫자, 소문자, 대문자, 일부 특수문자만 가능)
		//			write(byte[] b) : 배열 b에 존재하는 아스키 코드 출력
		//						** String 클래스에 getBytes()를 이용하면 byte[]로 만들어진다. 
		//			flush() : 출력 버퍼 용략이 다 차지 않아도 바로 출력하게 만드는 메서드
		//			close() : 출력 스트림 닫기
		
		// 파일 만들 위치 지정
		String pathname = "D:/jjh/util/exam01.txt";
		File file = new File(pathname);
		// try 안에서 객체생성하면 지역변수가 되서 안된다.
		// 그래서 close()를 못부르기 때문에 밖에서 선언만 한다.
		// 객체선언과 close()를 try~catch하는 것까지는 기본 베이스이다.
		FileOutputStream fos = null;
		try {
			// 파일이 존재하지 않으면 생성된다.
			// 파일이 존재하면 기존 파일을 덮어씌운다.
			// 계속 실행시키면 이어써지는 것이 아닌 기존 내용을 삭제하고 계속 덮어씌워진다.
			fos = new FileOutputStream(file);
			fos.write(106); // j,숫자에 해당하는 아스키 코드 문자가 출력된다. / 한글 한자 안됨
			fos.write(97); // a
			fos.write(118); // v
			fos.write(97); // a
			fos.write(13); // 줄바꿈

			
			fos.write('H'); // 아스키 코드에 한해서 한문자씩 출력할 수 있다.
			fos.write('e'); // 한글, 한자 안됨
			fos.write('l'); 
			fos.write('l'); 
			fos.write('o'); 
			fos.write(13); // 줄바꿈
			
			// String.getBytes() 여러글자 사용 가능
			// string.getBytes() 한글과 한자 등의 문자를 아스키 코드 범위 내로 변환이 가능하다
			// 정확히는 지원 안되는 글자를 쪼개서 읽을 수 있는 숫자로 만드는 것이다.
			// ex) 가 => (124+100)
			String msg = "Hi~~~\n안녕\n대한\nBye~~~";
			byte[] b = msg.getBytes();
			fos.write(b); // write의 오류는 다중 catch문으로 처리
			
			// 원래는 특정 용량이 채워지지 않으면 출력이 안되기 때문에
			// 바로 출력되도록 flush()를 써준다.
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
}
