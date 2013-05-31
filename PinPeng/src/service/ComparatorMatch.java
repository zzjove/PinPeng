package service;

import java.util.Comparator;

public class ComparatorMatch implements Comparator{
	
	public int compare(Object master, Object servant) {
		Match temp_master = (Match) master;
		Match temp_servant = (Match) servant;

		if (temp_master.getValue()>temp_servant.getValue())
			return 1;
		if (temp_master.getValue()==temp_servant.getValue())
			return 0;
		if (temp_master.getValue()<temp_servant.getValue())
			return -1;
		
		return 0;
//		int flag = user0.getAge().compareTo(user1.getAge());
//		if (flag == 0) {
//			return user0.getName().compareTo(user1.getName());
//		} else {
//			return flag;
//		}
	}

}
