public class TarefaCalculoMedia {

    private double nota1, nota2, nota3, nota4, media;

    public static void main(String args[]){

        TarefaCalculoMedia tfc = new TarefaCalculoMedia();
        tfc.setNota1(2.50);
        tfc.setNota2(10.00);
        tfc.setNota3(6.50);
        tfc.setNota4(8.50);
        System.out.printf("Média = %.1f", tfc.getMedia() );

    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    public double getNota3(){
        return nota3;
    }
    public double getNota4(){
        return nota4;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    public double getMedia() {

       return (getNota1()+getNota2()+getNota3()+getNota4())/4;
    }

}
