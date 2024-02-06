package com.ict.day06;

import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		System.out.println("1번 라인---------------------------");
		String str = "ICT 인재개발원 5강의장";
		
		// 1. charAt(int index) : char // 메서드 형태 : 결과값 자료형
		// 위치정보(index, 0부터 시작)가 숫자로 들어오면 해당 위치의 값을 반환한다.
		// 띄어쓰기도 하나의 index로 취급한다.
		
		char c1 = str.charAt(7);
		System.out.println(c1);

		// str의 모든 글자를 대문자로 만들자(소문자는 대문자에 -32)
		// str.length는 문자열의 개수를 반환한다.(문자열의 개수는 1부터 시작하기 때문에 +1 할 필요없음)
		// 해당 문자의 위치정보를 가지고 하나씩 꺼내서 검사 할 수 있다.
		str = "대한민국 I Love You 1004 ♥";		
		for (int i = 0; i < str.length(); i++) {
			char c2 =str.charAt(i);
			if (c2>='a'&&c2<='z') {
				c2 = (char)(c2-32);
			}
			System.out.print(c2);
		}
		System.out.println("\n2번 라인---------------------------");
		
		// 2. .concat(String str) : String
		// 입력된 문자열을 현재 문자열과 합친다.("문자열" + "문자열"과 같은 결과)
		String s1 = "대한민국";
		String s2 = s1.concat("KOREA");
		System.out.println(s2);
		
		// 괄호 안에 직접 문자열을 입력하는 것보다 변수로 저장해서 변수로 넣는게 좋다
		String s3 = " KOREA";
		String s4 = s1.concat(s3);
		System.out.println(s4);
		
		System.out.println("\n3번 라인---------------------------");
		// 3. .contains(CharSequence s) : boolean
		// CharSequence는 char 값을 순서대로 읽을 수 있는 Class자료형
		// 지금은 CharSequence를 String이라고 생각하자
		// String을 넣어주면 해당 문자열에 입력된 String값이 존재하면 true, 존재하지 않으면 false
		// 회원가입 시 @ 포함여부나 문장에 욕설 포함여부를 검사하는 메서드
		
		String s5 = "wngud2582@naver.com";
		boolean res = s5.contains("@");
		// boolean res = s5.contains('@'); (오류) //한글자라도 String형으로 입력해야한다. char형은 안됨
		System.out.println("res = " + res);
		// 대소문자 구별할 수 있음
		System.out.println("결과는 = " + s5.contains(".com"));
		System.out.println("결과는 = " + s5.contains(".COM"));
		
		System.out.println("\n4, 5번 라인---------------------------");
		
		// 4. .equals(Object anObject) : boolean
		// 		입력된 문자열과 현재 문자열이 같으면 true, 다르면 false(대소문자 구별함)
		// 5. .equalsIgnoreCase(String anotherString) : boolean
		// 		입력된 문자열과 현재 문자열이 같으면 true, 다르면 false(대소문자 구별안함)
		// 중요** 문자열과 문자열을 같다고 비교할 때는 ==를 사용하지 않는다.
		
		String s6 = "Korea";
		String s7 = "KOREA";
		// .equals(Object anObject) 대소문자 구별
		if (s6.equals(s7)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");			
		}
		
		// .equalsIgnoreCase(String anotherString) 대소문자 관계없음
		if (s6.equalsIgnoreCase(s7)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");			
		}
		
		System.out.println("\n6번 라인---------------------------");
		
		// 6. .format(String format, Object... args) : static String(일단 결과는 String으로 나옴)
		// 		형식을 지정하고 형식에 맞춰서 문자열 생성
		// .format("%s", 변수명) 일 때 %와 변수명의 자료형은 일치해야하며 %의 값은 변수명에 저장된 값을 따른다.
		String s8 = "한국 ICT 인재 개발원";
		
		// %s 는 문자열식 지정
		String s9 =String.format("%s", s8); // %s가 s9의 값으로 취급된다.
		System.out.println(s9);
		s9 =String.format("@@ %s !! 화이팅", s8); // %s에 s9의 내용이 들어가서 출력됨
		System.out.println(s9);
		
		// %30s 는 오른쪽 끝부터 왼쪽으로 30자리 차지하는 문자열을 비워둔다.(남은 자리는 공백) 오른쪽 정렬
		String s10 =String.format("%30s", s8);
		System.out.println(s10); // 왼쪽 30-s8의 문자개수만큼 칸이 비워져있음
		
		// %-30s 는 왼쪽 끝부터 오른쪽으로 30자리 차지하는 문자열을 비워둔다(남은 자리는 공백) 왼쪽 정렬
		String s11 =String.format("%-30s", s8);
		System.out.println(s11); // 안보이지만 오른쪽 30-s8의 문자개수만큼 칸이 비워져있음
		
		// %6s // 저장된 문자보다 값이 공백값이 작으면 변화 없이 붙는다.
		String s12 =String.format("%6s !!", s8); 
		System.out.println(s12); // s8이 6글자가 넘기 때문에 그냥 뒤에 !!가 붙었다.
		
		System.out.println("%d라인---------------------------");

		// %d 는 정수형식 시정
		int k1 = 2134;
		String s13 = String.format("%d &&", k1); // int형이 들어와도 저장은 String형으로 변환되고 이어져서 저장됨
		System.out.println(s13);
		
		String s14 = String.format("%5d @@", k1);
		System.out.println(s14);
		
		String s15 = String.format("%-5d @@", k1);
		System.out.println(s15);
		
		System.out.println("%f라인---------------------------");
		// %f 는 실수형식 지정
		double s16 = 123.445678;
		String s17 = String.format("%f", s16);
		System.out.println(s17);
		
		// 소수점 구하기(2번째자리)
		// 이것의 단점은 자동으로 반올림한다는 것이다.
		// 반올림의 여부를 확인하려면 소수점 뒷자리까지 해봐서 확인해야한다.
		String s18 = String.format("%.2f", s16);
		System.out.println(s18);
		
		// 소수점 구하기(4번째 자리)
		String s19 = String.format("%.4f", s16);
		System.out.println(s19);
		
		System.out.println("\n7번 라인(나중에 추가)---------------------------");
		
		// 7. .getBytes() : byte[]
		// 해당 문자열을 byte[]로 변환시킨다.
		// 보통 입/출력할 때 사용한다.(대소문자, 숫자 가능. 영어 이외에 글자는 안됨
		// 중요하지만 배열을 배워야 사용가능 정의만 알아두기
		
		System.out.println("\n8번 라인---------------------------");
		
		// 8. .indexOf(int ch), indexOf(String str) : int
		// 입력된 문자(ch), 문자열(str)의 위치값(index)을 알려준다. 반환되는 값은 index의 int형이다.
		// 찾으려는 문자나 문자열이 여려개이면 가장 앞에 있는 문자나 문자열의 위치값 1개만 반환한다.
		// charAt()과 반대의 개념
		// 찾으려는 문자나 문자열이 없으면 -1값을 반환한다.
		String h1 = "BufferedReader";
		 // char형을 넣어서 찾음 ''주의
		int h2 = h1.indexOf('f');
		System.out.println(h2);
		
		// str형을 넣어서 찾음 ""주의
		// 이때 반환값은 er의 첫글자인 e의 index값을 반환함
		h2 = h1.indexOf("er");
		System.out.println(h2);
		
		// 없는 글자 찾아보기
		h2 = h1.indexOf("err");
		System.out.println(h2);
		
		System.out.println("\n9번 라인---------------------------");
		
		// 9. .indexOf(int ch, int fromIndex), .indexOf(String str, int from Index) : int
		// fromIndex는 시작 위치를 말한다.
		// 2번째, 3번째 문자나 글자를 찾기 위함
		
		// 두번째 e를 찾자(우선 첫번째 e를 찾아라
		int h3 = h1.indexOf('e'); // 4가 나옴
		System.out.println(h3);
		// 두번째 e 찾기
		int h4 = h1.indexOf('e', h3+1);
		System.out.println(h4);

		System.out.println("\n10번 라인---------------------------");
		
		// 10. .lastIndexOf(int ch), lastIndexOf(String str) : int
		// 마지막 문자나 문자열을 찾을 때 사용
		int h5 = h1.lastIndexOf('e');
		System.out.println(h5);
		
		System.out.println("\n11번 라인---------------------------");
		
		// 11. .length()
		// 주의 for문에 나오는 args.length는 ()가 없기 때문에 메서드가 아니다. 아예 다른 것임
		// 문자열의 길이를 구한다. (1부터 시작한다. # index와 다르다는 것을 주의)
		
		String str1 = "Hello";
		System.out.println("길이 : " + str1.length());
		
		System.out.println("\n12번 라인---------------------------");
		
		// 12. .replace(char oldChar, char newChar) : String
		//      replace(CharSequence target, CharSequence replacement) : String
		// 지금은 .replace(String oldString, String newString) : String
		// 새로운 문자나 문자열을 받아서 치환(바꾸기)한다.
		// 없는 문자를 넣고 치환하면 오류가 나는 것이 아닌 원래 있는 값을 그대로 반환한다.
		
		String str2 = "대한민국";
		String str3 = str2.replace('민', '民');
		System.out.println(str3);
		
		String str4 = str2.replace("민", "민 ♥ "); // 형식을 맞추기 위해 "민"으로 입력
		System.out.println(str4);
		
		System.out.println("\n13번 라인---------------------------");
		// 13. .isEmpty() : boolean
		// 해당 문자열이 비어 있으면 true, 내용이 있으면 false
		String str5 = "대한민국";
		System.out.println(str5.isEmpty());
		
		String str6 = "";
		System.out.println(str6.isEmpty());
		
		// 오류발생 : Exception 아직 null의 개념을 안배웠기에 패스
		// String str7 = null; /
		// System.out.println(str7.isEmpty());
	
		System.out.println("\n14번 라인(나중에 추가)---------------------------");
		
		// 14. .split(String regex) : String[]
		// 	   .split(string regex, int limit) : String[]
		// 배열 배운 이후에 나중에 하기
		
		System.out.println("\n15번 라인---------------------------");
		// 15. .substring(int beginIndex)               : String
		//		입력된 시작위치부터 끝까지 문자열 추출
		
		//     .substring(int beginIndex, int endIndex) : String
		//		입력된 시작위치부터 입력된 끝위치 전까지 문자열 추출(끝 위치 포함하지 않음)
		// beginIndex는 시작 위치값을 뜻한다.
		// endIndex - beginIndex = 추출할 문자의 길이 수
		String t1 = "010-9732-9110";
		String t2 = t1.substring(4);
		System.out.println(t2); // 9732-9110
		
		// 끝번호 4자리
		t2 = t1.substring(9); // 이쪽도 9110
		t2 = t1.substring(t1.lastIndexOf('-')+1); // 9110
		System.out.println(t2); // 9110
		
		// 중간 4자리
		String t3 = t1.substring(4, 8);
		System.out.println(t3); // 9732
		
		// 010-7777-9999 => 010-7777-****, 010-****-9999로 치환
		String t4 = "010-7777-9999";
		String t5 = "****";
		System.out.println(t4.replace(t4.substring(9), t5)); // 끝자리 변환
		System.out.println(t4.replace(t4.substring(4,8), t5)); // 중간자리 변환
		
		System.out.println("\n16, 17번 라인---------------------------");
		// 16. .toLowerCase() : String
		// 해당 문자열을 모두 소문자로 변경
		// 17. .toUpperCase() : String
		// 해당 문자열 모두 대문자로 변경
		
		String t6 = "대한민국 I Love You @ 1004";
		System.out.println(t6.toLowerCase());
		System.out.println(t6.toUpperCase());
		
		System.out.println("\n18번 라인---------------------------");
		// 18, .toString() : String
		// 모든 클래수의 toString : 모든 객체(클래스)에서 사용가능.
		//						객체(클래스)가 가지고 있는 정보나 값(데이터)들을
		//						문자열로 만들어서 반환하는 메서드
		// String의 toString()은 문자열 자체를 반환
		String t7 = "java 17 자바 17";
		String t8 = t7.toString();
		System.out.println(t7);
		System.out.println(t8);
		
		System.out.println("\n19번 라인---------------------------");
		// 19. .trim() : String
		// 해당 문자열의 앞, 뒤 공백 제거, 중간 공백은 제거하지 않는다.
		String t9 = "  java 자바 JAVA  ";
		String t10 =t9.trim();
		
		System.out.println(t9);
		System.out.println(t9.length());
		System.out.println(t10);
		System.out.println(t10.length());
		
		System.out.println("\n20번 라인---------------------------");
		// 20. .startsWith(String prefix) : boolean
		// 주어진 문자열로 시작하는지 검색
		//	   .startsWith(String prefix, int toffset) : boolean
		// 시작위치(int toffset, index이다)를 주고 주어진 문자열로 시작하는지 검색
		// .endswith(String suffix) :boolean
		// 주어진 문자열로 끝나는지 검색
		
		boolean b1 = t10.startsWith("j"); //true
		System.out.println(b1);
		
		boolean b2 = t10.startsWith("JAVA"); //false
		System.out.println(b2);
		
		boolean b3 = t10.startsWith("자바",5); //true
		System.out.println(b3);
		
		boolean b4 = t10.endsWith("JAVA"); //true
		System.out.println(b4);
		
		System.out.println("\n21번 라인---------------------------");
		// 21. .valueOf(기본자료형) : static String
		// 이것도 특이하게 String.valueOf(변수명);으로 사용한다.
		// 어떤 기본 자료형이든지 String으로 변경시킴(기본자료형 + "")
		// (기본자료형 + "")보다 .valueOf()가 훨씬 더 메모리를 덜 잡아먹는다.
		boolean bo1 = true;
		char ch1 = 'c';
		int num1 = 34;
		long num2 = 37L;
		float num3 = 3.1572f;
		double num4 = 3654.1241;
		
		// 자료형 +1 = 실제로 덧셈을 한다.
		System.out.println(bo1);
		System.out.println(ch1+1);
		System.out.println((char)(ch1+1));
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println(num4+1);
		// valueOf를 이용하여 +1 해보기 = String의 연산과 같아짐
		System.out.println(String.valueOf(bo1)+1);
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		System.out.println(String.valueOf(num4)+1);
		
		System.out.println("\n22번 라인---------------------------");

		// 22. Wrapper Class(Boolean 등등)
		// 기본 자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키느 Class들
		// 기본 자료형을 객체로 만들 때 사용하는 Class
		
		// 22-1. Boolean.parseBoolean(String)
		// "true", "false" 문자열을 기본 자료형 boolean형으로 변경 
		// "true", "false" => true, false
		// "true"를 제외한 문자열이면 모두 false로 나온다.
		String msg = "true";
		boolean msg2 = Boolean.parseBoolean(msg); // "true" => true
		System.out.println(msg+1);
		// System.out.println(msg2+1); boolean형으로 바뀌었기때문에 오류남
		
		msg2 = Boolean.parseBoolean("가나다");
		System.out.println(msg2); // false "true"를 제외한 모든 인자는 false로 반환됨
		
		// 22-2. Integer.parseInt(String s);
		// "10", "124" 문자열을 기본자료형 int형으로 변경
		msg = "124";
		int msg3 = Integer.parseInt(msg);
		System.out.println(msg + 10); // 12410
		System.out.println(msg3 + 10); // 134
		
		// 22-3. Long.parseLong();
		// 문자열을 기본자료형 long형으로 변경
		// "숫자"로 넣으면 작동하지만 "숫자L"을 넣으면 작동하다가 오류가 난다.
		msg = "12345612312L";
		String msg5 = "12345612312";
		// long msg4 = 12345612312L; 이렇게 정수형 범위를 초과한 long형은 L을 꼭 붙여야한다.
		// long msg5 = 1234L;
		// long msg6 = 1234;
		
		// long msg4 =Long.parseLong(msg); // 이건 입력 오류는 안나지만 작동하다가 오류가 난다.
		long msg4 =Long.parseLong(msg5); // 이렇게 숫자 문자열을 기본 자료형으로 변환할 때는 안에 F,L같은 문자가 없어야한다.
		
		// 22-4 Float.parseFloat()
		// 문자열을 float로 변경
		// 이 메서드는 특이하게 숫자 문자열에 f가 있어도 작동한다.....
		// float는 왠만하면 쓰지 않는다.
		msg = "32.14f";
		float msg6 = Float.parseFloat(msg);
		System.out.println(msg6+10); // 42.14
		
		
		// 22-5 Double.parseDouble()
		// 문자열을 double 변경
		msg = "3.17598";
		double msg7 = Double.parseDouble(msg);
		System.out.println(msg7+10); // 13.17598
		
		// 22-6. charAt()을 이용하여 문자열을 char형으로 변경
		// character는 parse 메서드가 없다
		msg = "A";
		char msg8 = msg.charAt(0);
		System.out.println(msg+1); // A1
		System.out.println(msg8+1); // 정수값 66
		
		System.out.println("\n23번 라인---------------------------");
		// 23. 배열을 배운 후 학습
		// String.getBytes();
		// String.toCharArray();
		// split(String regex) : String[]
		// split(String regex, int limit) : String[]
		
		
		
		
	}
}
