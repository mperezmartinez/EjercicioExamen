
package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int num = 11;
            	if (metodoMio(num))
System.out.println("Es numero primo");
else
 System.out.println("NO es numero primo");           	 
          	 
for (int x=2;x<1000;x++){
if (metodoMio(x))
System.out.print(x + " ");                         	 
}         	 
	}
public static boolean metodoMio(int var) {
int i = 2;
boolean ver=true;
while ((ver) && (i!=var)){
if (var % i == 0)
ver = false;
i++;
}
return ver;
  } 	 
    
}
