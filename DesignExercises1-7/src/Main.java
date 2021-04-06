
public class Main {
	public static void main(String[] args) {
		Weapon w=new Weapon();
		
		w.add("katana", "2");
		w.add("gun", "3");
		w.add("lance", "2");
		
		System.out.println("katana: "+w.get("katana"));
		System.out.println("gun: "+w.get("gun"));
		System.out.println("lance: "+w.get("lance"));
		System.out.println("bomb: "+w.get("bomb")); //not exist
	}
}
