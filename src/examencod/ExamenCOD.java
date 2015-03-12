
package examencod;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int num = 11;
            	if (parimpar(num))
System.out.println("Es numero primo");
else
 JOptionPane.showMessageDialog(null,"NO es numero primo");

                System.out.println("Queremos un problema");
          	 
for (int x=2;x<1000;x++){
if (parimpar(x))
System.out.print(x + " ");                         	 
}         	 
	}

    /**
     * Devuelve  verdadero si es par
     * @param var
     * @return boolean ver
     */
    public static boolean parimpar(int var) {
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
