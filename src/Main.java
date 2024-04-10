import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.jar.JarInputStream;

public class Main {
    static Persona pepe;
    static Auto car;
    public static void main(String[] args) {
        int opcion= -1;
        Scanner leerOpcion = new Scanner(System.in);
        limpiar();
        while(opcion != 0){

            switch (opcion){
                case -1:

                    menu();
                    opcion = leerOpcion.nextInt();

                break;
                case 1:
                    limpiar();
                    opcion = -1;

                break;
                case 3:{
                    limpiar();
                    ejercicio3();
                    opcion = -1;
                 }
                break;
                case 4:{
                    ejercicio4();
                    opcion = -1;
                }
                break;
                case 5:{
                    ejercicio5();
                    opcion = -1;
                }
                break;
                case 6:{
                    ejercicio6();
                    opcion = -1;
                }
                break;
                case 7:{
                    ejercicio7();
                    opcion = -1;
                }
                break;
                case 8:{
                    ejercicio8();
                    opcion = -1;
                }
                break;
                case 9:{
                    ejercicio9();
                    opcion = -1;
                }
                break;
                case 11:{
                    ejercicio11();
                    opcion = -1;
                }
                break;
                case 12:{
                    ejercicio12();
                    opcion = -1;
                }
                break;
                case 13:{
                    ejercicio13();
                    opcion = -1;
                }
                break;
                case 14:{
                    ejercicio14();
                    opcion = -1;
                }
                break;
                case 151:{
                    ejercicio15a();
                    opcion = -1;
                }
                break;
                case 152:{
                    ejercicio15b();
                    opcion = -1;
                }
                break;
                case 153:{
                    ejercicio15c();
                    opcion = -1;
                }
                break;
                case 154:{
                    ejercicio15d();
                    opcion = -1;
                }
                break;
                case 16:{
                    ejercicio16();
                    opcion = -1;
                }
                break;
                case 17:{
                    ejercicio17();
                    opcion = -1;
                }
                break;
                case 19:{
                    ejercicio19();
                    opcion = -1;
                }
                break;
                default:
                    System.out.println("Una de las opciones");
                    opcion = -1;
            }


        }

        System.out.println("Chau gracias por venir \uD83D\uDE0A");


    }
    private static void menu(){
        System.out.println();
        System.out.println("Practico 1 de Programación 3");
        System.out.println("----------------------------");
        System.out.println("➤ 1: limpiar                ➤ 6: llamada              ➤ 11: 100-1        ➤ 151: a)par-impar-neg-pos     ➤ 16: miilas to km");
        System.out.println("➤ 3: crear un nuevo objeto  ➤ 7: par/impar            ➤ 12: factorial    ➤ 152: b)par-impar-neg-pos     ➤ 17: dia");
        System.out.println("➤ 4: mostrar mayor          ➤ 8: es Mayúscula         ➤ 13: 500 - 200    ➤ 153: c)par-impar-neg-pos     ➤ 19: palabrota");
        System.out.println("➤ 5: encender auto          ➤ 9: es triangulo y tipo  ➤ 14: pares        ➤ 154: d)par-impar-neg-pos     ➤ 0: salir");
    }
    private static void ejercicio3(){
        pepe = new Persona("José","Peres",'m',35,"Bahía Blanca");
        System.out.println("La persona pepe fué creada");
        car = new Auto();
        System.out.println("El auto car fué creado");


    }
    private static void ejercicio4(){
        Persona menor = new Persona("Maggie","Lopez",'f',5,"Mar del Plata");
        if(pepe==null){
            ejercicio3();
        }
        System.out.println("Persona de 35 años");
        pepe.mostrarDatos();
        System.out.println("Persona de 5 años");
        menor.mostrarDatos();
    }
    private static void ejercicio5(){
        Auto carKilometrajeAlto = new Auto("verde","axl560",2002,"corza",100001);
        Auto carKilometrajeBajo = new Auto("rojo","axl561",2002,"corza",99000);
        carKilometrajeAlto.encender();
        carKilometrajeAlto.kilometrajeMayor();

        carKilometrajeBajo.encender();
        carKilometrajeBajo.kilometrajeMayor();
    }
    private static void ejercicio6(){
        Celular motorola = new Celular("Motorola","x15");
        System.out.println("celular creado");
        motorola.realizarLlamada();
        motorola.cortarLlamada();
    }
    private static void ejercicio7(){
        Scanner entradaCaracter = new Scanner(System.in);
        System.out.print("Ingrese un número por favor ➤");
        int numero = entradaCaracter.nextInt();
        if(numero % 2 ==0){
            System.out.println(String.format("El número %d es par",numero));
        }else{
            System.out.println(String.format("El número %d es impar",numero));
        }
    }
    private static void ejercicio8(){
        Scanner entradaCaracter = new Scanner(System.in);
        System.out.print("Ingrese un caracter por favor ➤");
        char caracter = entradaCaracter.next().charAt(0);
        if(caracter >= 'A' && caracter<='Z'){
            System.out.println(String.format("El caracter %c es Mayuscula",caracter));
        }else{
            System.out.println(String.format("El caracter %c no es Mayuscula",caracter));
        }
    }
    private static void ejercicio9(){
        Triangulo triangulo = tomarDatos();

        if(triangulo.esTriangulo()){
            System.out.println(String.format("Triangulo: %s",triangulo.clasificacionDeTrianguloSegunSusLados()));


        }else{
            System.out.println(String.format("No triangulo"));
        }
    }
    private static Triangulo tomarDatos(){
        Scanner entradaCaracter = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado A ➤");
        float ladoA = 0;
        float ladoB = 0;
        float ladoC = 0;

        float caracter = entradaCaracter.nextFloat();
        ladoA = caracter;
        System.out.print("Ingrese el valor del lado B ➤");
        caracter = entradaCaracter.nextFloat();
        ladoB = caracter;
        System.out.print("Ingrese el valor del lado C ➤");
        caracter = entradaCaracter.nextFloat();
        ladoC = caracter;
        Triangulo triangulo = new Triangulo(ladoA,ladoB,ladoC);
        return triangulo;
    }
    private static void ejercicio11(){
      int num = 100;
        System.out.print("-");
      do{
          System.out.print(num+"-");
          num--;
      }while(num >=1);
    }
    private static void ejercicio12(){
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = lectura.nextInt();

        int factorial= 1;
        for(int i=1;i<=num;i++){
            factorial *=i;
        }
        System.out.println(factorial);
    }
    private static void ejercicio13(){
        System.out.print("-");
            int j = 1;
            int interlineado = 37;
            for(int i=500; i>=200;i--){

                System.out.print(i+"-");
                if(j % interlineado ==0){
                    System.out.println();
                    System.out.print("-");
                }
                j++;
            }
    }
    private static void ejercicio14(){

        boolean seguir= true;
            int[] numeros = pedirDosNumeros();
            int a = numeros[0];
            int b = numeros[1];
            while(a>=b){
                System.out.println("A debe ser menor que B");
                numeros = pedirDosNumeros();
                a = numeros[0];
                b = numeros[1];
            }
            for(int i = a; i<=b;i++){
                if(i % 2 ==0){
                    System.out.println(i+" Es un número par ");
                }
            }

    }
    private static void ejercicio15a(){
        Scanner lectura = new Scanner(System.in);
        int numero=1;
        while (numero != 0){
            System.out.print("Ingrese un numero distinto de 0 o 0 para salir: ");
            numero = lectura.nextInt();
            logicaEj15(numero);
        }
    }
    private static void ejercicio15b() {
        Scanner lectura = new Scanner(System.in);


        int numero;
        do{
            System.out.print("Ingrese un numero distinto de 0 o 0 para salir: ");
            numero = lectura.nextInt();
            logicaEj15(numero);
        } while (numero != 0);

    }
    private static void ejercicio15c() {
        Scanner lectura = new Scanner(System.in);

        boolean salir = false;
        String letra;
        int numero;
        do{
            System.out.print("Ingrese un numero : ");

            numero = lectura.nextInt();
            logicaEj15(numero);

            System.out.print("Desea continuar? (S/N): ");
            letra = lectura.next();
            if(letra.charAt(0)=='N' || letra.charAt(0)=='n'){
                salir = true;
            }



        } while (!salir);

    }
    private static void logicaEj15(int numero){
        if(numero>0){
            System.out.println(numero + " es un numero positivo");
        }else if(numero==0){
            System.out.println(numero + " no tiene signo");
        }else{
            System.out.println(numero + " es un numero negativo");
        }
        if(numero % 2==0){
            System.out.println(numero + " es un numero par");
        }else{
            System.out.println(numero + " es un numero impar");
        }
    }
    private static void ejercicio15d(){
        Scanner lectura = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese numeros seguidos de espacios por ej: 2 -9 5 : ");
        while(lectura.hasNext()){
            numero = lectura.nextInt();
            if(numero>0){
                System.out.println(numero + " es un numero positivo");
            }else if(numero==0){
                System.out.println(numero + " no tiene signo");
            }else{
                System.out.println(numero + " es un numero negativo");
            }
            if(numero % 2==0){
                System.out.println(numero + " es un numero par");
            }else{
                System.out.println(numero + " es un numero impar");
            }
        }
    }
    private static void ejercicio16(){
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese las millas: ");
        System.out.println("Son "+ df.format(lectura.nextInt()*1.6093f)+" kilometros");

    }
    private static void ejercicio17(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7: ");
        int num = lectura.nextInt();
        String dia;

            switch (num){
                case 1: dia="Lunes";
                    break;
                case 2: dia = "Martes";
                    break;
                case 3: dia ="Miércoles"    ;
                    break;
                case 4: dia ="Jueves"    ;
                    break;
                case 5: dia ="Viernes"    ;
                    break;
                case 6: dia ="Sábado"    ;
                    break;
                case 7: dia ="Domingo"    ;
                    break;
                default:dia="Debe ser un número del 1 al 7";
            }
        System.out.println(dia);
    }
    private static void ejercicio19(){
        Scanner lectura = new Scanner(System.in);
        String palabra;
        String cadena = "";

        do{
            System.out.print("Ingrese una palabra o vacio para salir: ");
            palabra = lectura.nextLine();

            cadena += palabra;
        }while(!palabra.isEmpty());
        System.out.println(cadena);
    }
    private static int[] pedirDosNumeros(){

        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese A: ");

        int a = lectura.nextInt();
        System.out.print("Ingrese B: ");
        int b = lectura.nextInt();
        int[] numeros = {a,b};

        return numeros;

    }
    private static void limpiar(){
        for(int i = 0;i<20;i++)
            System.out.println();

    }

}