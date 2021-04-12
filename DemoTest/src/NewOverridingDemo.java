import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class NewOverridingDemo {

	public static void main(String[] args) {
		Demo13 demo13 = new Demo13();
		
		ArrayList<Employee> ArrList = demo13.getEovDailyRate();
		
		ArrayList<Employee> responseList = new ArrayList<Employee>();
		
		List<Employee> maxBookingList=  new ArrayList<Employee>();
		List<Employee> minBookingList=  new ArrayList<Employee>();
		
		HashMap<Integer, Employee> maxMap = new HashMap<Integer, Employee>();
		
		List<Employee> maxBookingList1=  new ArrayList<Employee>();
		List<Employee> minBookingList1=  new ArrayList<Employee>();
		int unitsInDays =15;
		if (unitsInDays== 1) {
			for (Employee employee : ArrList) {
				
				if(employee.getDummyVal() == 4) {
					
					maxBookingList.add(employee);
					responseList.add(employee);
				}else if(employee.getDummyVal() == 3) {
					minBookingList.add(employee);
					responseList.add(employee);
				}
			}
		}else {
			/**
			 * mxmap,list obje ref ---> val in heap
			 *                  diff ref --> val chenge
			 *                    
			 */
			for (int i = 0; i<ArrList.size();i++) {
				Employee employee = ArrList.get(i);
				if(employee.getDummyVal() == 1) {
					maxMap.put(i, employee);
					maxBookingList.add(employee);
					maxBookingList1.add(employee);
					//responseList.add(employee);
				}else if(employee.getDummyVal() == 3) {
					minBookingList1.add(employee);
					minBookingList.add(employee);
				//	responseList.add(employee);
				}
			}
		}
		
		//responseList.addAll(minBookingList1);
		//responseList.addAll(minBookingList);
		//responseList.addAll(maxBookingList);
	//	responseList.addAll(maxBookingList1);
		Collection<Employee> emps = maxMap.values();
		ArrayList el = new ArrayList(emps);
		if (!el.isEmpty()) {
			for (int j=0; j<el.size();j++) {
				
				Employee employee = (Employee) el.get(j);
				System.out.println(employee.hashCode());
				// System.out.println(maxBookingPlan);
				if (employee.getEmployeeId() == 1001) {
					//Employee emp1 = new Employee(name, id, salary, dummyVal)
					employee.setEmployeeSalary(788999);
					responseList.add(employee);

				}
			}
		}
		
		if (!maxBookingList1.isEmpty()) {
				for (Employee employee1 : maxBookingList1) {
					System.out.println(employee1.hashCode());
					double eovDailyRate = 2;
					double val = eovDailyRate * unitsInDays;
					employee1.setEmployeeSalary(val);
					responseList.add(employee1);

			}
		}
		System.out.println(responseList);
		/*
		 * System.out.println(maxBookingList); System.out.println(minBookingList);
		 * System.out.println(minBookingList1); System.out.println(maxBookingList1);
		 */
		
	}
}
