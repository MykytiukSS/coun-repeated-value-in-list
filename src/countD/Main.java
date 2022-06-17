package countD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	 List<String>stringList=new ArrayList<>(Arrays.asList("game","home","room","table","and","lamp","tree","home","car","and","tree","and"));
	 List<Integer>intList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,3,5,6,4,8,7,6,1,6,7,5,5));
	 
	CountDoubles<String> string = new CountDoubles();
	CountDoubles <Integer>integ = new CountDoubles();
	
	string.countD(stringList);
	integ.countD(intList);
	

	}

}
