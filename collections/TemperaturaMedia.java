/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TemperaturaMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Double> temperaturas = new ArrayList<Double>();

    int count = 0;
    while (true) {
      if(count == 6) break;

      System.out.println("Digite a temperatura: ");
      double temp = scan.nextDouble();
      temperaturas.add(temp);
      count++;
    }
    System.out.println("-----------------");

    System.out.println("Todas as temperaturas: ");
    for(int i = 0;i < temperaturas.size();i++){
      System.out.println(temperaturas.get(i));      
    }

    double soma = 0;
    for ( int i=0; i < temperaturas.size() ; i++) {
      // assuming the product class has a price
      soma += temperaturas.get(i);
    }
    
    Double media = (double)soma / temperaturas.size();
    System.out.printf("\nMedia das temperaturas: %.1f\n", media);

    System.out.println("Temperaturas acima da media:");
    for(int i = 0; i < temperaturas.size(); i++) {
      if(temperaturas.get(i) > media) {
        System.out.println(temperaturas.get(i));
      }
    }
    System.out.print("\n\nMeses das temperaturas acima da media: \n");
    Iterator<Double> iterator = temperaturas.iterator();

    count = 0;
    while (iterator.hasNext()) {
      Double temp = iterator.next();
        if (temp>media) {
          switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");   
               
        }
      count += 1;
      }
    }
  }
}
