package DayEight.Interfaces.extendinginterfaces;

public class ExtendingInterfaceDemo implements childinterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
}