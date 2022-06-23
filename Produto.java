import java.util.Scanner;

class Produto{
  

 
 nome string;
 loja Loja;
 valor float;
  
 public static void main(String[] args) {
  System.out.println("Digite um número: ");
    Scanner in = new Scanner( System.in );
    System.out.println(in.nextLine());
 }
  
 String nome1 = "produto1";
 String nome2 = "produto2";
 
 System.out.println("nome2.compareTO(nome1) = "+ 
 nome2.compareTO(nome1));
 System.out.println("nome1.compareTO(nome2) = "+ 
 nome1.compareTO(nome2));
 

}