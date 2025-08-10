///Ex_6
public class Circulo {
    private Double raio;
    
    public Circulo(Double raio){
        this.raio = raio;
    }

    public double getRaio(){return raio;}

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser maios que 0!");
        }
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

};

