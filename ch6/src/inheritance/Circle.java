package inheritance;  //패키지명은 소문자
/*{클래스 관계}
 * 	1) 상송관계(is-a): ex) Circle is a Point(원은 점이다.)
 * 	2) 포함관계(has-a): ex) Circle has a Point(원은 점을 가지고 있다.)
 *	>>1)과 2) 중 적절한 것으로 결정
 *
 *	ex)Car
 *	엔진 클래스
 *	도어 클래스	
 */
public class Circle {
//	int x;  //x좌표
//	int y;  //y좌표
	
	//포함관계: 한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언
	//여러개도 상관 없음
	Point p= new Point();
	
	int r;  //반지름
}
