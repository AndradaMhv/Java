import javax.swing.JOptionPane;
//problema 4
public class PbLab{
    public static float procent_partial=0.2f;
    public static float procent_lab1=0.2f;
    public static float procent_lab2=0.3f;
    public static float procent_exam1=0.6f;
    public static float procent_exam2=0.7f;
    public static void calculMedie(float a,float b,float c)
    {
        JOptionPane.showMessageDialog(null,"Media studentului cu partial este : "+(procent_partial*a+procent_lab1*b+procent_exam1*c), "NOTA STUDENT",
            JOptionPane.INFORMATION_MESSAGE);
    }
    public static void calculMedie(int b,int c)
    {
         JOptionPane.showMessageDialog(null,"Media studentului fara partial este : "+(procent_lab2*b+procent_exam2*c), "NOTA STUDENT",
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main (String[] args)
    {
        int a,b,c;
        do{
         a=Integer.parseInt(JOptionPane.showInputDialog("Introduceti nota la partial"));
         b=Integer.parseInt(JOptionPane.showInputDialog("Introduceti nota la laborator"));
         c=Integer.parseInt(JOptionPane.showInputDialog("Introduceti nota la examen"));
        }while(a<1||a>10 && b<1||b>10 && c<1||c>10);
        
         calculMedie(a,b,c);
         calculMedie(b,c);
    }
}