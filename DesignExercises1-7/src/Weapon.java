import java.util.HashMap;
import java.util.Map;

public class Weapon implements IWeapon{
	
	Map<String, String> map=new HashMap<>();
	
	public void add(String weaponName, String strength) {
		map.put(weaponName, strength);
	}
	
	public String get(String weaponName) {
		if(map.containsKey(weaponName)) {
			return map.get(weaponName);
		}else {
			return ("No items match your search");
			//return the statement instead of throwing exception
		}
	}
}