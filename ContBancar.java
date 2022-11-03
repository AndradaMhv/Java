package Problema3;
public class ContBancar {
    private String numarCont;
    private long sumaCont;
    
    ContBancar(String numarCont,long sumaCont){
        this.numarCont=numarCont;
        this.sumaCont=sumaCont;
    }
    ContBancar(){
        this("124563",899999);
    }
    public void retragereNumerar(long suma){
        if(suma>sumaCont){
            System.out.println("EROARE! SUMA INTRODUSA ESTE MAI MARE DECAT SUMA DISPONIBILA IN CONT.");
        }
        else
            sumaCont-=suma;
    }
    public void depunereNumerar(long suma){
        sumaCont+=suma;
    }
    public void afisare(){
        System.out.println("Numar de cont: "+numarCont);
        System.out.println("Suma disponibila in cont: "+sumaCont);
    }
}
public class Test {
    public static void main(String []args){
        ContBancar c=new ContBancar("40",10);
        c.afisare();
        c.retragereNumerar(100);
        c.afisare();
        c.depunereNumerar(1700);
        c.afisare();
        
    }
}
