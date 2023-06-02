package lamda;

// 람다식은 어디에 포함해서 쓸 것인가?
// @FunctionalInterface : 필수요소는 아니지만 하나의 추상 메소드만 정의되도록 컴파일 단계에서 처리함

@FunctionalInterface
public interface Lamda5 {
	public int min(int x, int y);
}
