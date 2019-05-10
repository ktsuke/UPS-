package ups;

/**
 *
 * @author ktsuke
 */
import java.util.ArrayList;
public class Finan {
    
    /**
     * Esse método efetua o calculo de câmbio de um produto se baseando também na forma de pagamento escolhida pelo usuário
     * @param price Recebe o preço do produto na moeda original da busca
     * @param cabTax é o valor do câmbio da moeda
     * @param payMet recebe o método de pagamento selecionado pelo usuário (true = cartão de crédito, false = dinheiro em espécie) 
     * e faz a verificação para calculo do IOF sobre a transação
     * @return retorna o valor do produto já com os impostos e câmbio calculados se existir a necessidade
     */
   public double calc(double price, double cabTax, boolean payMet){
     double tot=0;
       if (cabTax!= 0){
           tot=cabTax*price;
          if (payMet==true){
             tot= tot +(tot*0.0638);
          }
          else{
              tot= tot +(tot*0.011);
          }
      }
       else{
           tot=price;
       }
      return tot;       
   }
   /**
    * Compara os preços obitidos de todos os lugares selecionados e já convertidos com impostos de cada um
    * @param resultados recebe os nomes e valores das lojas 
    * @return o menor valor e a loja desse valor para o usuário e os dados para obter o gráfico
   */
   public double compare(ArrayList resultados){
       double min;
       min=(double) resultados.get(0);
       for(int i=0;i<resultados.size();i++){
           if (min>(double)resultados.get(i+1)){
               
           }
       }
       return min;
   }
   
}
