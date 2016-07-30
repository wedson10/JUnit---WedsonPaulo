/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**Classe para objetos do tipo Media, onde serão contidos, valores e métodos para o mesmo
 * @author Wedson e Paulo
 * @since 28/07/2016
 */
public class Media {
    
    /** Método para calculo do valor de uma media de três valores
     * @param num1 double - Primeiro valor
     * @param num2 double - Segundo valor
     * @param num3 double - Terceiro valor
     * @return double - Valor do resultado do calculo
     */
    
    public double mediatresnumeros(double num1, double num2, double num3){
         return ((num1 + num2 + num3)/3);
     }
    
    /** Método para calculo do valor de uma media de dois valores
     * @param num1 double - Primeiro valor
     * @param num2 double - Segundo valor
     * @return double - Valor do resultado do calculo
     */
    
    public double mediadoisnumeros(double num1, double num2){
         return ((num1 + num2)/2);
     }
    
    /** Método para calculo do valor de uma media com pesos
     * @param num1 double - Primeiro valor
     * @param num2 double - Segundo valor
     * @return double - Valor do resultado do calculo
     */
    
    public double mediaponderada(double num1, double num2){
         return ((num1*2 + num2*3)/5);
     }
}
