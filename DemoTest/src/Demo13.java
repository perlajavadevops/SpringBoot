import java.util.ArrayList;

public class Demo13 {

	ArrayList<Employee> getEovDailyRate() {
		ArrayList<Employee> ArrList = new ArrayList<Employee>();
		ArrList.add(new Employee("Mukul", 1001, 52000.0, 1));
		ArrList.add(new Employee("Robin", 1002, 65000.0, 2));
		ArrList.add(new Employee("Rahul", 1003, 53000.0, 3));
		ArrList.add(new Employee("Suraj", 1004, 45000.0, 4));
		ArrList.add(new Employee("Akash", 1005, 38000.0, 1));

		return ArrList;
	}

	ArrayList<Employee> getDailyRate() {
		ArrayList<Employee> ArrList = new ArrayList<Employee>();
		ArrList.add(new Employee("Mukul", 1001, 52000.0, 1));
		ArrList.add(new Employee("Robin", 1002, 65000.0, 2));
		ArrList.add(new Employee("Rahul", 1003, 53000.0, 3));
		ArrList.add(new Employee("Suraj", 1004, 45000.0, 4));
		ArrList.add(new Employee("Akash", 1005, 38000.0, 1));

		return ArrList;
	}
}
