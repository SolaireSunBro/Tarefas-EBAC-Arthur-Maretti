package Ebac_AbstractFactory;

public class SemContrato extends Fabrica{
    @Override
    Carro retrieveCar(String requestedGrade) {
        if ("2".equals(requestedGrade)) {
            return new Carro_AUDI(1500, "GasolinaAditivada", "Azul");
        } else {
            return null;
        }
    }
}
