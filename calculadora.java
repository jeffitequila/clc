package calculadora;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JTextField;
import java.awt.event.ActionListener; 
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Calculadora extends JFrame implements ActionListener{
    
    JLabel jlN1, jlN2;
    JTextField jtfN1, jtfN2, jtfRes;
    JButton  jbSoma, jbSubtração, jbCalc , jbMultiplicacao , jbDivisão;
    
    public Calculadora(){
              
              
            setLayout(new FlowLayout());
            
            //Pegando primeiro numero
            
            jlN1 = new JLabel("ESCREVA O PRIMEIRO NUMERO");
            add(jlN1);
            jtfN1 = new JTextField (4);
            jtfN1.addActionListener(this);
            add(jtfN1);
            
            //Pegando o segundo numero
            
            jlN2 = new JLabel ("ESCREVA O SEGUNDO NUMERO");
            add(jlN2);
            jtfN2 = new JTextField(4);
            jtfN2.addActionListener(this);
            add(jtfN2);
            
            //PROPORÇÕES DA TELA
            setSize(300, 300);
            setVisible(true);
            setTitle("Calculadora");
            
            //Mostrando resultado
            jtfRes = new JTextField(4);
            jtfRes.setEditable(false);
            jtfRes.addActionListener(this);
            add(jtfRes);
            
            //Criando os botões
            //Botão de soma      
            jbSoma = new JButton("SOMA");
            add(jbSoma);
            jbSoma.setEnabled(true);
            jbSoma.addActionListener(this);
            //Botão de subtração
            jbSubtração = new JButton("SUBTRAÇÃO");
            add(jbSubtração);
            jbSubtração.setEnabled(true);
            jbSubtração.addActionListener(this);
            //Botão de multiplicação
            jbMultiplicacao = new JButton("MUlTIPLICAÇÃO");
            add(jbMultiplicacao);
            jbMultiplicacao.setEnabled(true);
            jbMultiplicacao.addActionListener(this);
            //Botão de Divisão 
            jbDivisão = new JButton("DIVISÃO");
            add(jbDivisão);
            jbDivisão.setEnabled(true);
            jbDivisão.addActionListener(this);

            
    }

    public static void main(String[] args) {
        
    Calculadora calc = new Calculadora();
    calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

    @Override
    
    public void actionPerformed(ActionEvent ae) {
    //Função que soma
        if (ae.getSource()== jbSoma ){
        int num1 = Integer.parseInt(jtfN1.getText());
        int num2 = Integer.parseInt(jtfN2.getText());
        int res = num1 + num2;
        jtfRes.setText(Integer.toString(res));
        //Função que Subtrai
        }else if (ae.getSource()== jbSubtração ){
        int num1 = Integer.parseInt(jtfN1.getText());
        int num2 = Integer.parseInt(jtfN2.getText());
        int res = num1 - num2;
        jtfRes.setText(Integer.toString(res));
            //Função que Multiplica
        }else if (ae.getSource()== jbMultiplicacao){
        int num1 = Integer.parseInt(jtfN1.getText());
        int num2 = Integer.parseInt(jtfN2.getText());
        int res = num1 * num2;
        jtfRes.setText(Integer.toString(res));
            //Função que Divide
        }else if (ae.getSource() == jbDivisão){
        int num1 = Integer.parseInt(jtfN1.getText());
        int num2 = Integer.parseInt(jtfN2.getText());
        double res = num1 / num2;
        jtfRes.setText(Double.toString(res));
        }
    }
    }
    
}
