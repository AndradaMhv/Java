package Problema2;
public class Produs {
    private String denumire;
    private double pretunitar;
    
    Produs(String denumire,double pretunitar){
        this.denumire=denumire;
        this.pretunitar=pretunitar;
    }
    Produs(){
        this("ciocolata",6.00);
    }
    public void afiseazaProdus(){
        System.out.println("Denumirea produsului: "+denumire+"; Pret unitar: "+pretunitar);
    }
    public double getPret(){
        return pretunitar;
    }
    public void setPret(double val){
        pretunitar=val;
    }
    public void aplicaReducere(double procent){
        pretunitar=pretunitar-((procent/100.00)*pretunitar); 
    }
            
}
public class Test {
    public static void main(String []args){
        Produs p=new Produs("corn",2.00);
        Produs pr=new Produs("biscuiti",4.00);
        p.afiseazaProdus();
        System.out.println();
        pr.afiseazaProdus();
        System.out.println();
        p.aplicaReducere(10);
        pr.aplicaReducere(10);
        System.out.println("Preturile produselor dupa reducere sunt: ");
        p.afiseazaProdus();
        System.out.println();
        pr.afiseazaProdus();
        System.out.println();
        
       
    }
    
}
