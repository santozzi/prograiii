public class Triangulo {
    private float ladoA;
    private float ladoB;
    private float ladoC;

    public Triangulo(float ladoA, float ladoB, float ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    public boolean esTriangulo(){
        return esABMayorQueC(ladoA,ladoB,ladoC) &&
               esABMayorQueC(ladoB,ladoC,ladoA) &&
               esABMayorQueC(ladoA,ladoC,ladoB);
    }
    private static boolean esABMayorQueC(float ladoA, float ladoB, float ladoC){
        return (ladoA + ladoB)>ladoC;

    }

    /***
     * @apiNote Se asume que es un triángulo posible
     * @return El tipo de tringulo según sus lados
     */
    public String clasificacionDeTrianguloSegunSusLados(){
        String tipoDeTriangulo ;

        if(ladoA==ladoB && ladoB==ladoC){
            tipoDeTriangulo = "Equilatero";
        }else if (ladoA == ladoB && ladoB != ladoA){
            tipoDeTriangulo = "Isósceles";
        }else{
            tipoDeTriangulo= "Escaleno";
        }
        return tipoDeTriangulo;
    }

}
