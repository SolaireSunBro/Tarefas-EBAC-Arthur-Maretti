package Ebac_AbstractFactory;

public class PoloIndustrial {

    public static void main(String[] args){

        Cliente cliente = new Cliente("1",true);
        Fabrica fabrica = qualFabrica(cliente);
        Carro carro = fabrica.create(cliente.requerimento());
        carro.nomeCarro();
        cliente = new Cliente("2",false);
        fabrica = qualFabrica(cliente);
        carro = fabrica.create(cliente.requerimento());
        carro.nomeCarro();
    }

    private static Fabrica qualFabrica(Cliente cliente){

        if(cliente.hasContrato()){

            return new Contrato();
        }else{

            return new SemContrato();
        }
    }
}
