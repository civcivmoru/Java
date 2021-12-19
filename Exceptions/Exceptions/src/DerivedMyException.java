import java.io.FileNotFoundException;

public class DerivedMyException extends MyException{


	/**
	 */
	private static final long serialVersionUID = 1L;


	public DerivedMyException() {
	}

	
	/*a
	 * A derived class may not add any exceptions to the throws
	 * clause, but it can delete.
	 */
	@Override
	public void name() throws FileNotFoundException,ArithmeticException{
		// TODO Auto-generated method stub
		throw new FileNotFoundException();
	}
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}
