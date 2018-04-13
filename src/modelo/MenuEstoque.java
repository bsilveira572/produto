package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Bruno Ramos
 */
public class MenuEstoque {
    static Integer valorMenu = 0;
    static Scanner teclado = new Scanner(System.in);
    static List<Produto> estoque = new ArrayList<Produto>();
    
    public static void main (String[] args) {
        while(valorMenu != 3){
            if(null == valorMenu){
                chamarMenu();
            } else switch (valorMenu) {
                case 1:
                    cadastrarProduto();
                    chamarMenu();
                    break;
                case 2:
                    for(Produto p : estoque){
                        System.out.println(
                                "Nome: "+p.getNome()
                                +"  Quant.: "+p.getQuantidade()
                                +"  Preço: "+p.getPreco()
                                +"  Valor Total:"+p.getValorTotal()
                        );
                    }
                    chamarMenu();
                    break;
                case 3:
                    System.exit(0);
                default:
                    chamarMenu();
                    break;
            }
        }
    }
    
    private static void chamarMenu(){
        System.out.println ("#####################");
        System.out.println ("#    MENU ESTOQUE   #");
        System.out.println ("# 1:CADASTRAR       #");
        System.out.println ("# 2:EXIBIR          #");
        System.out.println ("# 3:SAIR            #");
        System.out.println ("#####################");
        valorMenu = teclado.nextInt();
    }
    private static void cadastrarProduto(){
        Produto produto = new Produto();
        produto.setNome(JOptionPane.showInputDialog("Insira o nome do produto"));
        produto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto")));
        produto.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do produto")));
        
        estoque.add(produto);
    }
}