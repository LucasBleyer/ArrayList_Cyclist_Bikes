//Lucas  Bleyer

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Ana");
        
        String nTXT = JOptionPane.showInputDialog("Entre total bikes: ");
        int n = Integer.parseInt(nTXT);
        for (int i = 0; i < n; i++) {
            Bike b = new Bike();
            
            String totalTXT = JOptionPane.showInputDialog("Entre total marchas: ");
            int totalMarchas = Integer.parseInt(totalTXT);
            b.setTotalMarchas(totalMarchas);
            
            String velFinalTXT = JOptionPane.showInputDialog("Vel final: ");
            float velFinal = Float.parseFloat(velFinalTXT);
            b.setVelocidadeFinal(velFinal);
            
            // 1a opcao
            // String dataCompraTxt = JOptionPane.showInputDialog("Data compra: ");
            // LocalDate dataCompra = LocalDate.parse(dataCompraTxt);
            // LocalDate dataCompra = LocalDate.of(dataCompra);
            
            // 2a opcao
             String dataCompraTxt = JOptionPane.showInputDialog("Data compra: ");
             DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
             LocalDate dataCompra = LocalDate.parse(dataCompraTxt, formatador);
             b.setDataCompra(dataCompra);
            
            // 3a opção
//            String diaTxt = JOptionPane.showInputDialog("Entre com dia: ");
//            int dia = Integer.parseInt(diaTxt);
//            
//            String mesTxt = JOptionPane.showInputDialog("Entre com mês: ");
//            int mes = Integer.parseInt(mesTxt);
//            
//            String anoTxt = JOptionPane.showInputDialog("Entre com ano: ");
//            int ano = Integer.parseInt(anoTxt);
            
            //b.setDataCompra( LocalDate.of(ano,mes,dia) );
            p.getListaBikes().add( b );
            System.out.println(b.toString());
            
        }
              
        // processamento
        // b) Apresente o nome da pessoa e todos os dados 
        // das bikes associadas a pessoa em questão
        System.out.println( p.toString() );
        
        
        // c) Informe quantas bikes possuem total de marchas maior que 5
        int totalBikes = p.determineTotalBikeMarchasMaior5();
        System.out.println("Total de bikes com marcha maior que 5:" + totalBikes);
        
        // d) Apresente os dados (todos) da bike 
        // que possui a maior velocidade final
        Bike bikeMaiorVelocidade = p.informeBikeMaiorVelocidade();
        if (bikeMaiorVelocidade == null) 
            System.out.println("Lista vazia!");
        else 
            System.out.println(bikeMaiorVelocidade);
        
        // e) Apresente uma lista contendo dados (todos) das bikes 
        // que foram compradas antes de 20/11/2019
        LocalDate data = LocalDate.of(2019,11,20);
        ArrayList<Bike> listaBikes = p.listaBikeCompradasAntesde(data);
        System.out.println("Lista bikes: " + listaBikes.toString() );
       
    }
}