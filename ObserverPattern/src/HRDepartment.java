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
public class HRDepartment implements IObserver {

	/* (non-Javadoc)
	 * @see IObserver#newHireEmployee(domain.Employee)
	 */
	@Override
	public void newHireEmployee(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("HR department notified...");
		System.out.println("New Hire: " + e.getName());
	}

}
