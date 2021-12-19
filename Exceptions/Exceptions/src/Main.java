import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) throws Exception{
			Scanner keyboard = new Scanner(System.in);
		

	        try
	        {
	            int a[]= {1, 2, 3, 4};
	            for (int i = 1; i <= 4; i++)
	            {
	                int girdi = keyboard.nextInt();
	                if(girdi == 3)
	                	throw new MyException();
	                else if(girdi==2)
	                	throw new DerivedMyException();
	            }
	        }
	        catch (DerivedMyException e) {
				System.out.println(e+" derived exception önce geldi bile.");
			}
	        catch (MyException e)
	        {
	            System.out.println ("error = " + e);
	        }
	        catch (Exception e) {
				System.out.println();
			}
	        finally {
				System.out.println("Bu kod her kosulda çalışacak!");
			}
	
		
	}
}
