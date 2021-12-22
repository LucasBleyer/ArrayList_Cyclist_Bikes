
import java.time.LocalDate;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<Bike> listaBikes;

    public Pessoa() {
        this.listaBikes = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Bike> getListaBikes() {
        return listaBikes;
    }

    public void setListaBikes(ArrayList<Bike> listaBikes) {
        this.listaBikes = listaBikes;
    }

    
    public int determineTotalBikeMarchasMaior5() {
        
        int total = 0;
        for (Bike bike : this.listaBikes) {
            if (bike.getTotalMarchas() > 5) {
                total++;
            }
        }
        return total;
        
    }
    
    public Bike informeBikeMaiorVelocidade(){
        
        Bike bikeMaiorVelocidade = null;
        if ( this.listaBikes.size() > 0 ) {
            bikeMaiorVelocidade = this.listaBikes.get(0);
            
            // tradicional
//            for (int i = 0; i < this.listaBikes.size(); i++) {
//                Bike b = this.listaBikes.get(i);
//                if (b.getVelocidadeFinal() > bikeMaiorVelocidade.getVelocidadeFinal()) {
//                    bikeMaiorVelocidade = b;
//                }
//            }
            // usando um foreach, para cada um dos objs que estiver na coleção
            for (Bike bike : this.listaBikes) {
                if (bike.getVelocidadeFinal() > bikeMaiorVelocidade.getVelocidadeFinal()) {
                    bikeMaiorVelocidade = bike;
                }
            }
        }
        
        return bikeMaiorVelocidade;
    }
    
    public ArrayList<Bike> listaBikeCompradasAntesde(LocalDate data) {
        
        ArrayList<Bike> bikes = new ArrayList();
        
        for (Bike b : this.listaBikes) {
            if ( b.getDataCompra().isBefore( data )) {
                bikes.add( b );
            }
        }
        
        return bikes;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", listaBikes=" + listaBikes + '}';
    }
}