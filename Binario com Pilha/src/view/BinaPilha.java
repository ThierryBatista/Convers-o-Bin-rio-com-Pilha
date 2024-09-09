package view;
import controller.BinaPilhaController;
import javax.swing.JOptionPane;

public class BinaPilha
{
 public static void main(String Args[])
 {
  BinaPilhaController b = new BinaPilhaController();
  int valor = 0;
  valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número até 1000 para ser convertido em binário"));
  while(valor > 1000)
  {
   System.out.println("valor inválido");
   valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número até 1000 >=("));
  }
  b.Bin(valor);
  
   
 }
}
