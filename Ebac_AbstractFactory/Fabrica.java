package Ebac_AbstractFactory;

public abstract class Fabrica {

    public Carro create(String requerimento){

        Carro carro = retrieveCar(requerimento);
        carro = check(carro);
        return carro;

    }
    private Carro check(Carro carro){
        carro.inspecao();
        return carro;
    }
    abstract Carro retrieveCar(String requestedGrade);
}
