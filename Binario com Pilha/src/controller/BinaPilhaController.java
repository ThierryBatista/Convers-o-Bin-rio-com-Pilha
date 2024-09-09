package controller;
import model.PilhaInt;
public class BinaPilhaController
{
 public BinaPilhaController()
 {
 super();
 }
 
 public void Bin(int valor)
 {
 int valorI = valor;
 PilhaInt p = new PilhaInt();
 String binario = "";
 
  while (valor >= 2)
  {
  int rest = valor % 2;
  p.push(rest);
  valor = valor / 2;
  
  }
  p.push(valor);

   while(!p.isEmpty())
   {
    try {
		binario = binario + String.valueOf(p.pop());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   System.out.println(valorI + " em binario é " + binario);
 }
 
 public void teste()
 {
	 PilhaInt p = new PilhaInt();
	 for (int i = 0; i < 10; i++)
	 {
	 p.push((int) (Math.random() * 100) + 1);
	 }
	 int b = 0; 
	 try {
		 b = p.max();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		
	}
	 System.out.println(b);
 }
 
}