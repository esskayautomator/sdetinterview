package SDET;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContractTest {

	public static void main(String[] args) {
		
		EmployeeKey ek1 = new EmployeeKey("101", "1121212");
		EmployeeKey ek2 = new EmployeeKey("101", "1121212");
		EmployeeKey ek3 = new EmployeeKey("105", "11212127");
		EmployeeKey ek4 = new EmployeeKey("106", "1121213");

		Set<EmployeeKey> set = new HashSet<EmployeeKey>();
		set.add(ek1);
		set.add(ek2);
		set.add(ek3);
		set.add(ek4);
		System.out.println(set);

	}

}

class EmployeeKey {

	String empId;

	@Override
	public String toString() {
		return "EmployeeKey [empId=" + empId + ", dob=" + dob + "]";
	}

	String dob;

	EmployeeKey(String theId, String theDob) {

		empId = theId;
		dob = theDob;

	}

}
