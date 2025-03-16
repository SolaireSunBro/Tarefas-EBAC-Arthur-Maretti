package Ebac_AbstractFactory;

public class Cliente {

    private boolean hasContrato;
    private String requerimento;

    public Cliente(String requerimento, boolean hasContrato){

        this.requerimento = requerimento;
        this.hasContrato = hasContrato;
    }

    public boolean hasContrato() {
        return hasContrato;
    }
    public String requerimento() {
        return requerimento;
    }
}
