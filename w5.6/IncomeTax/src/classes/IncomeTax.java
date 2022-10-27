package classes;

public class IncomeTax {

    public IncomeTax() {
    }
    
	public int yearIncome(int monthIncome){
		return monthIncome*12;
	}
	
	public double taxFreeIncome(int monthIncome){
		if(monthIncome*12 <= 14400){
			return 6000;
		} else if(monthIncome*12 > 25200){
			return 0;
		} else {
			return 6000 - 6000/10800*(monthIncome*12 - 14400);
		}
	}
	
	public double taxIncomePercent(int monthIncome){
		
	}
}
