import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	// attributes of an Employee
	private String EmployeeName;
	private int EmployeeId;
	private double EmployeeSalary;
	private Integer dummyVal;

	// Create Constructor that accept
	// name id and salary as
	// an argument
	Employee(String name, int id, double salary, int dummyVal) {
		this.EmployeeSalary = salary;
		this.EmployeeName = name;
		this.EmployeeId = id;
		this.dummyVal = dummyVal;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", EmployeeId=" + EmployeeId + ", EmployeeSalary="
				+ EmployeeSalary + ", dummyVal=" + dummyVal + "]";
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public double getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	public Integer getDummyVal() {
		return dummyVal;
	}

	public void setDummyVal(Integer dummyVal) {
		this.dummyVal = dummyVal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + EmployeeId;
		result = prime * result + ((EmployeeName == null) ? 0 : EmployeeName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(EmployeeSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dummyVal == null) ? 0 : dummyVal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (EmployeeId != other.EmployeeId)
			return false;
		if (EmployeeName == null) {
			if (other.EmployeeName != null)
				return false;
		} else if (!EmployeeName.equals(other.EmployeeName))
			return false;
		if (Double.doubleToLongBits(EmployeeSalary) != Double.doubleToLongBits(other.EmployeeSalary))
			return false;
		if (dummyVal == null) {
			if (other.dummyVal != null)
				return false;
		} else if (!dummyVal.equals(other.dummyVal))
			return false;
		return true;
	}
	
	

}

public class OverridingList { 

	public static void main(String[] args) {
		// Create a ArrayList of Employee Class Type
		Demo13 demo13 = new Demo13();
		ArrayList<Employee> ArrList = demo13.getEovDailyRate();
		ArrayList<Employee> ArrList1 = demo13.getDailyRate();
		
		ArrayList<Employee> responseList = new ArrayList<Employee>();
		List<Employee> maxBookingList = ArrList1.stream().filter(p -> p.getDummyVal().equals(Integer.valueOf(4)))
				.collect(Collectors.toList());
		if (!maxBookingList.isEmpty()) {
			System.out.println("Preparing plan list for four device");
			Employee maxBookingPlan = maxBookingList.stream().min(Comparator.comparing(Employee::getDummyVal)).get();
			// System.out.println(maxBookingPlan);
			System.out.println(maxBookingPlan.hashCode());
			if (maxBookingPlan.getEmployeeId() == 1004) {

				maxBookingPlan.setEmployeeSalary(788999);
				responseList.add(maxBookingPlan);

			}
		}
		/*List<Employee> minBookingList = ArrList1.stream().filter(p -> p.getDummyVal().equals(Integer.valueOf(3)))
				.collect(Collectors.toList());
		if (!minBookingList.isEmpty()) {
			System.out.println("Preparing plan list for one device");
			Employee minBookingPlan = minBookingList.stream().min(Comparator.comparing(Employee::getDummyVal)).get();
			// System.out.println(minBookingList);
			System.out.println(minBookingPlan.hashCode());
			if (minBookingPlan.getEmployeeId() == 1003) {

				minBookingPlan.setEmployeeSalary(788);
				responseList.add(minBookingPlan);

			}
		}*/
		
		System.out.println("===================================");
		System.out.println(responseList);
		System.out.println("===================================");
		int unitsInDays =15;
		if (unitsInDays> 1) {
			ArrayList<Employee> maxBookingList1 = (ArrayList<Employee>) ArrList.stream()
					.filter(p -> p.getDummyVal().equals(Integer.valueOf(4))).collect(Collectors.toList());
			if (!maxBookingList1.isEmpty()) {
				System.out.println("Preparing plan list for four devices");
				Employee carnivalPlanMaxDayPlan = maxBookingList1.stream()
						.max(Comparator.comparing(Employee::getDummyVal)).get();
				
				System.out.println(carnivalPlanMaxDayPlan.hashCode());
				double eovDailyRate = 2;
				double val = eovDailyRate * unitsInDays;
				carnivalPlanMaxDayPlan.setEmployeeSalary(val);
				System.out.println(carnivalPlanMaxDayPlan);
				responseList.add(carnivalPlanMaxDayPlan);

			}
			/*List<Employee> minBookingList1 = ArrList.stream()
					.filter(p -> p.getDummyVal().equals(Integer.valueOf(3))).collect(Collectors.toList());
			if (!minBookingList1.isEmpty()){
				System.out.println("Preparing plan list for single device");
				Employee maxBookingPlan = minBookingList1.stream()
						.max(Comparator.comparing(Employee::getDummyVal)).get();

				double eovDailyRate = 100;
				double val = eovDailyRate * unitsInDays;
				maxBookingPlan.setEmployeeSalary(val);

				responseList.add(maxBookingPlan);
			}
*/
		}
		System.out.println("################################################");
		System.out.println(responseList);
		System.out.println("################################################");

	}

}
