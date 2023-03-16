
package klassid;

public class practika {
    public int taisarv(int a){
        if (a>=0) return a+1; //Если число положительное, возвращаем на 1 больше
        else return a;
    }

    public int taisarvA(int a){
        if (a>0) return a+1;//Если число положительное, возвращаем на 1 больше
        else
            if (a<0) return a-2;
            else
                if (a==0) return 10;
                else
                    return 0;
    }        
}
