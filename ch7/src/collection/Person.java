package collection;

import java.util.Objects;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	//중복 저장이 안 되도록 설정: equals(), hashCode() 오버라이딩 해야 한다. (메뉴에 한 세트임)
	//name은 중복이 되지 않도록 오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}
	

	
	
	
	
}
