/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**Classe para objetos do tipo Operações, onde serão contidos, valores e métodos para o mesmo
 * @author Wedson e Paulo
 * @since 28/07/2016
 */
public class Operações {
    
    /** Método para calculo do valor da multiplicação
     * @param num1 double - Primeiro valor
     * @param num2 double - Segundo valor
     * @return double - Valor do resultado do calculo
     */
    
    public double multiplicação(double num1, double num2){
         return (num1*num2);
     }
    
    /** Método para calculo do valor da divisão
     * @param num1 double - Primeiro valor
     * @param num2 double - Segundo valor
     * @return double - Valor do resultado do calculo
     */
    
     public double divisão(double num1, double num2){
         return (num1/num2);
     }
     
     /** Método para calculo do valor da subtração
     * @param num1 double - Primeiro valor
     * @param num2 double - Segundo valor
     * @return double - Valor do resultado do calculo
     */
     
     public double subtração(double num1, double num2){
         return num1-num2;
     }
}
