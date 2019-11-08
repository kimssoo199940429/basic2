package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1); //문자출력
		System.out.println((int)ch1); //문자에 해당하는 정수값(아스키코드 값) 출력
		
		char ch2 = 66; //정수값 대입
		System.out.println(ch2); //정수 값에 해당하는 문자 출력
		
		int ch3 = 67;
		System.out.println(ch3); //문자 정수 값 출력
		System.out.println((char)ch3); //정수 값에 해당하는 문자출력 
		
		String ch4 = "1234";
		System.out.println(ch4.length()); //배열의 길이를 리턴해주는 함수
		System.out.println(Integer.parseInt(ch4));//String을 int로 바꾸고 싶을때 쓰는거! 
	}

}
