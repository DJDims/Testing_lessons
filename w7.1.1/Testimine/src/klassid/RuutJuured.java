
package klassid;

public class RuutJuured {
    public static double[] arvutus(double a, double b, double c) {
        double d = b * b -4 * a * c;
        if(d > 0) {
            return new double[] //возвращает массив из 2-х значений
                {(-b + Math.sqrt(d)) /2/a,
                (-d - Math.sqrt(d)) /2/a};
        }else if (d == 0) {
            return new double[]//возвращаем массив из 1-го значения
                {-b /2 /a};
        }else {
            return null; //возвращает пустое значение
            
            }
        }
    }

