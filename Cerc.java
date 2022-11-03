package Problema1;
public class Cerc{
    private double r;
    
    Cerc(double r){
        this.r=r;
    }
    public double getr(){
        return r;
    }
    public double getArie()
    {
        return Math.PI*(r*r);
    }
    public double getCircumferinta()
    {
        return 2*Math.PI*r;
    }
    
    
}
class Test{
    public static void main (String []args){
        Cerc c= new Cerc(20);
        System.out.println("Raza: "+c.getr());
        System.out.println("Aria cercului este: "+c.getArie());
        System.out.println("Circumferinta cercului este: "+c.getCircumferinta());
        
    }
}
