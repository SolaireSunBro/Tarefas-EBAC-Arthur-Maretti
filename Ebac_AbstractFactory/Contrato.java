package Ebac_AbstractFactory;

public class Contrato extends Fabrica{

    @Override
    Carro retrieveCar(String requestedGrade) {
        if ("1".equals(requestedGrade)) {
            return new Carro_BMW(2000, "GasolinaPremium", "Preto");
        } else {
            return null;
        }
    }
}
