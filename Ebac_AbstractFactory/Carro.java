package Ebac_AbstractFactory;

public abstract class Carro {

    private int potencia;
    private String combustivel;
    private String cor;

    public Carro(int potencia, String combustivel,String cor){

        this.potencia = potencia;
        this.combustivel = combustivel;
        this.cor = cor;

    }

    public void nomeCarro(){

        System.out.println(getClass().getSimpleName());

    }

    public void inspecao(){

        System.out.println("Motor com potência :" + potencia);
        System.out.println("Tanque cheio de :" + combustivel);
        System.out.println("Carro pintado com a cor :" + cor);

    }
}
