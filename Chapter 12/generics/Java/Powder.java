package generics;

public class Powder extends Material {
	
	@Override
	public String toString() {
		
		return "재료는 powder 입니다.";
	}
	
	@Override
	public void doPrinting() {
		
		System.out.println("powder 재료로 출력합니다.");
	}

}
