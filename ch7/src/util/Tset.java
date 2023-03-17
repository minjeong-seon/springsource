package util;

public class Tset {
	private String name;
	private int no;
	private String tel;
	
	
	
	public Tset(String name, int no, String tel) {
		super();
		this.name = name;
		this.no = no;
		this.tel = tel;
	}

	public void print() {}
	public int sum() {
		return 0;
		}
	
	@Override
	public String toString() {
		return "Tset [name=" + name + ", no=" + no + ", tel=" + tel + "]";
	}

}
