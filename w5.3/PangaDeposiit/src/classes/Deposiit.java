package classes;

public class Deposiit {

    public Deposiit() {
    }
    
    public static double[] deposiit(double percent){
        if (percent < 0 || percent > 25) return null;
        
        double[] result = new double[2];
        double money = 1000;
        int months = 0;
        
        while(money < 1100){
            money *= 1 + percent/100;
            months++;
        }
        result[0] = money;
        result[1] = months;
        return result;
    }
}
