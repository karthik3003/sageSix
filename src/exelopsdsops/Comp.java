package exelopsdsops;

import java.util.Comparator;

public class Comp implements Comparator {

	public Comp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return (((Employee)arg0).getName()).compareTo(((Employee)arg1).getName());
	}
	
	
}
