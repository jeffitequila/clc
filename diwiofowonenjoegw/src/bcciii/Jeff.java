package bcciii;
//variavel fora do metodo e global 
        // variavel dentro de qualquer metodo e local 

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
// JOptionPane serve para a mensagem aparacer na caixa // 

public class Jeff extends JFrame implements ActionListener {
    
    JLabel jlnome , jlbairro , jlpeso , jlaltura , jlimc;
    JTextField tfNome, tfbairro , tfpeso, tfaltura, tfimc ;
    JButton jblimpar;
    JButton jbsair;
    JButton jbexecutar;
    JComboBox jcestado, jccidade, jcprofissao ;
    
    
        public Jeff(){
            setLayout(new FlowLayout());
            jlnome = new JLabel("informe seu nome: ");
            add(jlnome);
            tfNome= new JTextField(20);
            tfNome.addActionListener(this);
            add(tfNome);
            tfNome.setToolTipText(" entre com seu nome ");/*
            quando mouse esta em cima 
            */
            jlbairro = new JLabel("informe seu bairro");
            add(jlbairro);
            
            tfbairro = new JTextField(20);
            add(tfbairro);
            tfbairro.setToolTipText("entre com seu bairro");
            
            String estado [] = {" "," MA"," PARÁ"};
            jcestado = new JComboBox (estado);
            add(jcestado);
            jcestado.setToolTipText(" ESCOLHA SEU ESTADO");
             String cidade [] = {" "," IMPEROSA ", " PARAGOMINAS "};
             jccidade = new JComboBox( cidade );
             add(jccidade);
             jccidade.setToolTipText("ESCOLHA SUA CIDADE");
             
             jlpeso = new JLabel(" informe seu peso");
             add(jlpeso);
             
             tfpeso  =  new JTextField(5);
             add(tfpeso);
             
             String profissao [] = {" "," PROGRAMADOR "," PROFESSOR ", 
                " VENDENDOR", " JORNALISTA", "CABALEIREIRA"," OUTRO " };
            jcprofissao = new JComboBox( profissao);
            add(jcprofissao);
            jcprofissao.setToolTipText("ESCOLHA SUA PROFISSAO");
            jlaltura = new JLabel(" INFORME SUA ALTURA ");
            add(jlaltura);
            tfaltura = new JTextField(8);
            add(tfaltura);
            jlimc = new JLabel("I.M.C");
            add(jlimc);
            tfimc = new JTextField(5);
            tfimc.setEditable(false);
            add(tfimc);
         
            jbexecutar = new JButton("CONFIRMAR");
            add(jbexecutar);
            jbexecutar.addActionListener(this);
            jblimpar = new JButton("limpar");
            jblimpar.addActionListener(this);
            add(jblimpar);
            jbsair = new JButton(" SAIR ");
            add(jbsair);
            jbsair.addActionListener(this);
            
            setSize(300, 600);
            setVisible(true);
            setTitle("APLICAÇÃO");
            
        
        }
        

    public static void main(String[] args) {
        Jeff a = new Jeff();
         
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==tfNome){
            if(tfNome.getText().length()==0){
                JOptionPane.showMessageDialog(null,"CAMPO VAZIO");
            }else{
            tfbairro.requestFocus();}
            
        }else if(ae.getSource()== jblimpar ){
            tfNome.setText("");
            tfbairro.setText("");
            jcestado.setSelectedIndex(0);
            jccidade.setSelectedIndex(0);
            
        } else if (ae.getSource()== jbsair){
            System.exit(0);
        } else if (ae.getSource()==jbexecutar){
            JOptionPane.showMessageDialog(null,"SEUS DADOS FORAM GRAVADOS ");
          
        } 
    }     
    
}




