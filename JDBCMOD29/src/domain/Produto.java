package domain;

public class Produto {

    private String cod;

    private String nomeProd;

    private long idProd;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public long getIdProd() {
        return idProd;
    }

    public void setIdProd(long idProd) {
        this.idProd = idProd;
    }
}
