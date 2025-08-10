///Ex_5
public class Carro {
    // Atributos (estado do objeto)
    private String marca;
    private String modelo;
    private Integer ano;
    
    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String getMarca() {return marca; }
    public String getModelo() {return modelo; }
    public Integer getAno() {return ano; }

    public void exibirInfo(){
        System.out.print("A marca é " + marca + ", modelo " + modelo + ", do ano " + ano);
        }
};
