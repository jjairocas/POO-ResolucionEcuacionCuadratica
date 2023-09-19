package AppResolucionCuadratica;

public class CalculoCuadratica {
    double ValorA;
    double ValorB;
    double ValorC;

    public CalculoCuadratica(double valorA, double valorB, double valorC) {
        ValorA = valorA;
        ValorB = valorB;
        ValorC = valorC;
    }

    boolean CalculoDiscriminante(){
        double Discriminante;
        Discriminante=((Math.pow(ValorB,2)-(4*ValorA*ValorC)));

        if(Discriminante >=0){

            return true;
        }

        else{
            return false;

        }
    }
    double CalcularRaiz1(){
        double Raiz1;
        Raiz1=(-ValorB+(Math.sqrt(((Math.pow(ValorB,2)-(4*ValorA*ValorC))))))/(2*ValorA);
        return Raiz1;
    }
    double CalcularRaiz2(){
        double Raiz2;
        Raiz2=(-ValorB-(Math.sqrt(((Math.pow(ValorB,2)-(4*ValorA*ValorC))))))/(2*ValorA);
        return Raiz2;
    }

}
