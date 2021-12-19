import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.file.FileSystemException;

@SuppressWarnings("serial")
public class MyException extends Exception {
	private int value;
	private String string;
	
	
	public MyException(int i) {
		value=i;
		
	}
	
	public MyException(String s) {
		setString(s);
	
	}
	public MyException() {
		super("MyException came!");
	
	}
	
	@Override
	public String getMessage() {
		
		return String.valueOf(value)+" is not bigger than 9!";
	}

	@Override
	public synchronized Throwable getCause() {
		// TODO Auto-generated method stub
		return super.getCause();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void printStackTrace(PrintStream s) {
	
		super.printStackTrace(s);
	}
	
	
	public  void name() throws FileNotFoundException,FileSystemException {
		throw new FileSystemException("emmi");
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
}
