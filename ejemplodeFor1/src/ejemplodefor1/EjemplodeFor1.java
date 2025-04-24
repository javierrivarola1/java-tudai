
package ejemplodefor1;


public class EjemplodeFor1 {


    public static void main(String[] args) {
        int num_1 = 3;
        int num_2 = 10;
        
        System.out.println("Tablas de multiplicador por 1, 2, 3");
        for (int i = 0; i <= num_1; i++) {
            
            System.out.println("Traeme la table de multiplicar del " + i);
            
            for (int j = 0; j <= num_2; j++) {
                
                System.out.println("Tenemos: " + j*i);
                
            }
            
        }
    }
    
}
