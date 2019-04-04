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
    JComboBox jcestado, jccidade, jcprofissao ,jcbairro;
    
    
        public Jeff(){
            setLayout(new FlowLayout());
            
            //CRIANDO JLABEL PARA DIZER O O NOME
            jlnome = new JLabel("informe seu nome: ");
            add(jlnome);
            tfNome= new JTextField(20);
            tfNome.addActionListener(this);
            add(tfNome);
            tfNome.setToolTipText(" entre com seu nome ");
            
            //CRIANDO O INFORMADOR DE ESTADO
            
            
            String estado [] = {" ","AC", "AL","AP","AM", "BA","CE", "DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","SE","TO"};
            jcestado = new JComboBox (estado);
           jcestado.addActionListener(this);
            add(jcestado);
            jcestado.setToolTipText(" ESCOLHA SEU ESTADO");
             
            //CRIANDO O INFORMADOR DE CIDADE
            String cidade [] = {" "};
             jccidade = new JComboBox( cidade );
             add(jccidade);
             jccidade.setToolTipText("ESCOLHA SUA CIDADE");
             
             //CRIANDO O INDORMADO DE PESO
             jlpeso = new JLabel(" informe seu peso");
             
             //COMBOBOX DE BAIRRO
             jcbairro = new JComboBox(bairro);
             jcbairro.addActionListener(this);
             add(jcbairro);
             jcbairro.setToolTipText("ESCOLHA SEU BAIRRO");
             
             //JLABEL DE PESO
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
          
        } else if (ae.getSource() == jcestado){
            if (jcestado.getSelectedIndex() == 0){
            
                String estado [] = {""};
                jccidade.removeAllItems();
                jccidade.insertItemAt(estado[0],0);
            
            }else if( jcestado.getSelectedIndex() == 10){
            
                String [] ma = {"", "Imperatriz", "Açaolandia","São Luiz"};
                jccidade.removeAllItems();
                for (int i = 0 ; i< 3 ; i++) {
                    
                    jccidade.insertItemAt(ma[i], i);}
                    
            }else if (jcestado.getSelectedIndex() == 14){
            
                String [] pa = {"", "MARABA","PARAGOMINAS"};
                jccidade.removeAllItems();
                for(int i = 0; i<3; i++){
                    
                    jccidade.insertItemAt(pa[i], i);
                    
                }    
            
            }
                
            }
            
            }
        
        
        }
    }     
    
}




