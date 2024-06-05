import java.util.Scanner;

public class Media {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, n4;

        System.out.println("Nota 1= ");
        n1 = sc.nextFloat();

        System.out.println("Nota 2= ");
        n2 = sc.nextFloat();

        System.out.println("Nota 3= ");
        n3 = sc.nextFloat();

        System.out.println("Nota 4= ");
        n4 = sc.nextFloat();

        float getMedia = (n1+n2+n3+n4)/4;
        System.out.println("Média= " + getMedia +"\n");

        if(getMedia < 5){

            System.out.println("Reprovado\n");

        } else if (getMedia == 5 || getMedia <7) {

            System.out.println("Recuperação\n");

        }else{

            System.out.println("Aprovado\n");
        }


    }

}