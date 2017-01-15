import java.util.Locale;
import java.text.NumberFormat;

public class calculate extends Thread{
	public static void main(String args[]){
		System.out.println("calculate...");
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		int hourlyRate = Integer.valueOf(args[0]);
		int numEmployees = Integer.valueOf(args[1]);
		int hoursTotal = Integer.valueOf(args[2]);
		int tax = Integer.valueOf(args[3]);
		try{
		sleep(5000);
		
		int fund = numEmployees*hourlyRate*hoursTotal;
		System.out.println("фонд заработной платы составл€ет " + currency.format(fund));
		
		sleep(2000);
		
		double dirtyPayment = fund / numEmployees;
		System.out.println("зарплата сотрудника без вычета налога составл€ет " + currency.format(dirtyPayment));
		
		sleep(2000);
		
		double netPayment = (fund - (fund / 100 * tax)) / numEmployees;
		System.out.println("«арплата сотрудника после вычета налога составл€ет " + currency.format(netPayment));
		} catch(InterruptedException e){}
	}
}