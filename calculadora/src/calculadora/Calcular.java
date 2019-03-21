package calculadora;

import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calcular extends JFrame implements ActionListener{
      JLabel jlN1, jlN2;
      JTextField jlN1,jlN2,jlsoma, jlSub,jlMulti,jlDiv;



    public static void main(String[] args) {
   
        float n1, n2, mostrar;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("INFORME O PRIMEIRO NUMERO:");
        
        n1 = ler.nextFloat();
        
        System.out.println("INFORME O PRIMEIRO NUMERO:");
             
        n2 = ler.nextFloat();
        
        Operacao calcular = new Operacao();
        mostrar = calcular.soma(n1, n2);
        
        System.out.println(mostrar);
        
        mostrar = calcular.subtracao(n1, n2);
        
        System.out.println(mostrar);
        
        mostrar = calcular.multiplicacao(n1, n2);
        
        System.out.println(mostrar);
        
        mostrar = calcular.divisao(n1, n2);
        
        System.out.println(mostrar);
    }
    
}
