import javax.swing.JOptionPane;
public class PoligonSimplu {
 private int []A,B,M;
 private int [][]D;
 private int m;
 
 private void citire()
 {
        
   
    M=new int[2];
     int n=2;
     m=Integer.parseInt(JOptionPane.showInputDialog("Introduceti numarul de colturi:"));
     m=m+1;
    D=new int[m][n];
    int i,j;
    for(i=0;i<m-1;i++)
        for(j=0;j<n;j++)
        {
            D[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Introduceti coordonatele colturilor:"));
        }
    D[m-1][0]=D[0][0];
    D[m-1][1]=D[0][1];
     for( i=0;i<2;i++)
      {
        M[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduceti coordonatele punctului "));
      }  
    
   
 }
  private int determinant(int a[], int b[], int c[])
   {int d=0;
       
       d=(a[0]*b[1]+b[0]*c[1]+a[1]*c[0])-(c[0]*b[1]+c[1]*a[0]+b[0]*a[1]);
      return d;
   }
  public PoligonSimplu()
  {  citire(); 
    A=new int[2];
    B=new int[2];
 
   
    int i,c=0,ok=0;
      
      for(i=0;i<m-1;i++)
      { 
          if(((M[0]-D[i][0])*(M[0]-D[i+1][0]))<=0 &&D[i][1]==D[i+1][1]&&M[1]==D[i][1] )
           {
            System.out.println("M apartine frontierei");ok=1; break; 
           }
          if(D[i][1]>D[i+1][1])
           {
            A[0]=D[i][0];
            A[1]=D[i][1];
            B[0]=D[i+1][0];
            B[1]=D[i+1][1];
           }
         else
          {
            B[0] = D[i][0];
            B[1] = D[i][1];
            A[0] = D[i+1][0];
            A[1] = D[i+1][1];  
          }
          
         if(A[1]!=B[1])
         {
          if( M[1]<A[1]&& M[1]>B[1])
         {
             if(determinant(A,M,B)>0)
             {
                 c++;
             }
            if(determinant(A,M,B)==0)
             {  JOptionPane.showMessageDialog(null, "M apartine frontierei", "FRONTIERA", JOptionPane.INFORMATION_MESSAGE);
                ok=1; break;
             } 
         }
        if(A[1]==M[1] && M[0]<A[0])
        {c++;}
        if((M[1]==B[1]&& B[0]==M[0]) ||(M[1]==A[1] && M[0]==A[0]))
        {   JOptionPane.showMessageDialog(null, "M apartine frontierei", "FRONTIERA", JOptionPane.INFORMATION_MESSAGE);
            ok=1; break;}
      }
      
      
  }
       
      if(ok==0){
      if(c%2==0)
          JOptionPane.showMessageDialog(null, "M se afla in exteriorul poligonului", "EXTERIOR", JOptionPane.INFORMATION_MESSAGE);
      else
          JOptionPane.showMessageDialog(null, "M se afla in interiorul poligonului", "INTERIOR", JOptionPane.INFORMATION_MESSAGE);
  }
  }
    public static void main(String[] args) 
    {
     new PoligonSimplu();
    }
    
}
