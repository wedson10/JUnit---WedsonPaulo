/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**Classe para objetos do tipo Opções, onde serão contidos, valores e métodos para o mesmo
 * @author Wedson e Paulo
 * @since 28/07/2016
 */
public class Opções {
    
    /** Método para saber se uma lâmpada está acesa
     * @param num int - Valor recebido
     * @return boolean - Valor do final da condição
     */
    
     public boolean luzacessa(int num){
         if(num==1){
             System.out.println("luz acessa");
             return true;
         }else{
             System.out.println("luz apagada");
             return false;
         }
     }
     
     /** Método para saber se um número é verdadeiro
     * @param num double - Valor recebido
     * @return double - Valor do final da condição
     */
     
     public boolean numtrue(int num){
         if(num==1){
             return true;
         }else{
             return false;
         }
     }
     
     /** Método para saber se um assento está disponível ou ocupado
     * @param num double - Valor recebido 
     * @return double - Valor do final da condição
     */
     
     public boolean disponivel(int num){
         if(num==1){
             System.out.println("Disponivel");
             return true;
         }else{
             System.out.println("Ocupado");
             return false;
         }
     }
}
