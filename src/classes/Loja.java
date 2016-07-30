/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**Classe para objetos do tipo Loja, onde serão contidos, valores e métodos para o mesmo
 * @author Wedson e Paulo
 * @since 28/07/2016
 */
public class Loja {
    
    /** Método para calculo do valor de uma soma
     * @param num1 double - Primeiro valor
     * @param num2 double - Segundo valor
     * @return double - Valor do resultado do calculo
     */
    
    public int soma(int num1, int num2){
         return num1 + num2;
     }
    
    /** Método para calculo do valor do juros com base no valor multiplicado por um taxa
     * @param valor double - Primeiro valor
     * @return double - Valor do resultado do calculo
     */
    
     public double juros(double valor){
         double juros = valor*0.20;
         return valor+juros;
     }
     
     /** Método para calculo do valor do desconto com base no valor multiplicado por uma taxa
     * @param valor double - Primeiro valor
     * @return double - Valor do resultado do calculo
     */
     
     public double desconto(double valor){
         double desconto = valor*0.20;
         return valor-desconto;
     }
}
