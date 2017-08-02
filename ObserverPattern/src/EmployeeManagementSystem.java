import java.util.ArrayList;

import domain.Employee;

/**
 * tungdt9
 * Aug 1, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class EmployeeManagementSystem implements ISubject {
	ArrayList<IObserver> observers = new ArrayList<>();
	
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}
	
	public void hireNewEmployee(Employee e) {
		for (IObserver o : observers) {
			o.newHireEmployee(e);
		}
	}
}
