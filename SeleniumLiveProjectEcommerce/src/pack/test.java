package pack;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Boolean> list= new ArrayList<>();
		list.add(true);
		list.add(Boolean.parseBoolean("falSe"));
		System.out.println(list.size());
		System.out.println(list.get(1) instanceof Boolean);
		

	}

}
