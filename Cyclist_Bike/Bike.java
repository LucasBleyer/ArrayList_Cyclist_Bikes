import java.time.LocalDate;

public class Bike {
    private int totalMarchas;
    private float velocidadeFinal;
    private LocalDate dataCompra;

    public Bike() {
    }

    public int getTotalMarchas() {
        return totalMarchas;
    }

    public void setTotalMarchas(int totalMarchas) {
        this.totalMarchas = totalMarchas;
    }

    public float getVelocidadeFinal() {
        return velocidadeFinal;
    }

    public void setVelocidadeFinal(float velocidadeFinal) {
        this.velocidadeFinal = velocidadeFinal;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    @Override
    public String toString() {
        return "Total de Marchas: " + totalMarchas + " Velocidade Final: " + velocidadeFinal + " Data da compra: " + dataCompra;
    }
}