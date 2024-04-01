public class Radar {
    // Simulador de multa

    private String placa;
    private Integer velocidadeMotorista;
    private Integer velocidadePermitida;
    private String endereco;

    public static void main(String args[]){

        Radar radar = new Radar();
        radar.setPlaca("BYE8215");
        radar.setVelocidadeMotorista(110);
        radar.setVelocidadePermitida(100);
        radar.setEndereco("AV. Giuseppe Camolli");

        System.out.println("Placa: \t" + radar.getPlaca());
        System.out.println("\nVelocidade permitida: \t" + radar.getVelocidadePermitida());
        System.out.println("\nVelocidade do motorista: \t" + radar.getVelocidadeMotorista());
        System.out.println("\nLocal: \t" + radar.getEndereco());
        if(radar.getVelocidadeMotorista() > radar.getVelocidadePermitida()){System.out.println("Multado\n");}


    }
    public String getPlaca(){
        return placa;
    }
    public Integer getVelocidadeMotorista(){
        return velocidadeMotorista;
    }
    public Integer getVelocidadePermitida(){
        return velocidadePermitida;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setPlaca(String placa){
        this.placa= placa;
    }
    public void setVelocidadeMotorista(Integer velocidadeMotorista){
        this.velocidadeMotorista= velocidadeMotorista;
    }
    public void setVelocidadePermitida(Integer velocidadePermitida){
        this.velocidadePermitida= velocidadePermitida;
    }
    public void setEndereco(String endereco){
        this.endereco= endereco;
    }
}
