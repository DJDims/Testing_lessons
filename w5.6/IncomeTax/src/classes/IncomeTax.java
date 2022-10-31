package classes;

public class IncomeTax {

    public IncomeTax() {
    }
    
	public int yearIncome(int monthIncome){
            return monthIncome*12;
	}
	
	public double taxFreeIncome(int monthIncome){   //необлагаемая налогом сумма
            if(yearIncome(monthIncome) <= 14400){
                return 6000;
            } else if(yearIncome(monthIncome) >= 25200){
                return 0;
            } else {
                return 6000 - 6000d/10800d*(yearIncome(monthIncome) - 14400);
            }
	}
        
	public double taxIncome(int monthIncome){       //облагаемая налогом сумма
            if(yearIncome(monthIncome) < 14400){
                return 14400 - yearIncome(monthIncome);
            } else if(yearIncome(monthIncome) > 25200){
                return yearIncome(monthIncome);
            } else {
                return yearIncome(monthIncome) - (6000 - 6000d/10800d*(yearIncome(monthIncome) - 14400));
            }
	}
	
	public double taxIncomePercent(int monthIncome){
            return yearIncome(monthIncome) - (yearIncome(monthIncome) - taxFreeIncome(monthIncome)) * 0.2;
	}
}
