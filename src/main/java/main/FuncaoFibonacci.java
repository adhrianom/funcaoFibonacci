

package main;
import java.util.Scanner;
public class FuncaoFibonacci {
    
    private static int fRecursivo(int N){
       if (N == 0){
           return 0;
       }                        // Calculo recursivo de fibonacci
       if (N == 1){
           return 1;
       }
       return fRecursivo(N - 1) + fRecursivo(N - 2);
   }
   
   private static int fLinear(int N){
       
       if (N == 0) return 0;
       int a = 0;
       int b = 1;
                                        // Calculo linear de fibonacci
       for (int i = 2; i <= N; i++){
          int aux = a + b;
          a = b;
          b = aux;
       }
       return b;
   }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        if (N >= 0){  // Verificação do input
            System.out.print("Insira um número maior que 0: ");
            N = sc.nextInt();
            
            System.out.println();
            // Efetuando os calculos
            int fibonacciR = fRecursivo(N);
            System.out.println("Recursiva: fib(" + N + ") = " + fibonacciR);
            int fibonacciL = fLinear(N);
            System.out.println("Linear: fib(" + N + ") = " + fibonacciL);
            }
        else {
            System.out.println("Só é permitido números acima de 0. Tente novamente.");
            N = sc.nextInt();
        }
        
        
        
        
        
        
        sc.close();
    }
}
