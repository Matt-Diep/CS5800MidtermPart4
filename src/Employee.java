
public abstract class Employee {
	public static int PART_COLLECTOR = 4;
	public static int ASSEMBLER = 3;
	public static int WELDER = 2;
	public static int PAINTER = 1;
	
	protected int authorityLevel;
	protected Employee nextEmployee;
	public void setnextEmployee(Employee employee) {
		this.nextEmployee = employee;
	}
	
	public void doWork(int authorityLevel, String message) {
		if(this.authorityLevel <= authorityLevel) {
			write(message);
		}
		if(nextEmployee != null) {
			nextEmployee.doWork(authorityLevel, message);
		}
	}
	
	abstract protected void write(String message);
}

class PartCollector extends Employee{
	PartCollector(){
		authorityLevel = PART_COLLECTOR;
	}
	
	@Override
	protected void write(String message) {
		System.out.println(message + "all parts have been gathered");
	}	
}

class Assembler extends Employee{
	Assembler(){
		authorityLevel = ASSEMBLER;
	}
	
	@Override
	protected void write(String message) {
		System.out.println(message + "all parts have been put together");
	}	
}

class Welder extends Employee{
	Welder(){
		authorityLevel = WELDER;
	}
	
	@Override
	protected void write(String message) {
		System.out.println(message + "all parts have been welded together");
	}	
}

class Painter extends Employee{
	Painter(){
		authorityLevel = PAINTER;
	}
	
	@Override
	protected void write(String message) {
		System.out.println(message + "car complete");
	}	
}
