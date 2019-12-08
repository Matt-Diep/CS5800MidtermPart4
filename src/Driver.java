
public class Driver {

	public static void main(String[] args) {
		Employee partCollector = new PartCollector();
		Employee assembler = new Assembler();
		Employee welder = new Welder();
		Employee painter = new Painter();
		
		partCollector.setnextEmployee(assembler);
		assembler.setnextEmployee(welder);
		welder.setnextEmployee(painter);
		painter.setnextEmployee(null);
		
		int authorityLevel = 3;
		String message = "Progess: ";
		
		partCollector.doWork(authorityLevel, message);
	}

}
