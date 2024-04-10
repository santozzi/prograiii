public class Persona {
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private String ciudad;

    public Persona(){}

    public Persona(String nombre, String apellido, char sexo, int edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    public Persona(String nombre, String apellido){
        this(nombre,apellido,'u',0,"Narnya");
    }
    private String mayorDeEdad(){
        String respuesta = "No se puede mostrar los datos de un menor de edad";
        if(this.edad > 18){
            respuesta = String.format(
                    "Nombre: %s , Apellido: %s, edad: %d, sexo: %c, ciudad: %s",
                    this.nombre,this.apellido,this.edad,this.sexo,this.ciudad
            );
        }
        return respuesta;
    }
    public void mostrarDatos(){
        System.out.println(mayorDeEdad());
    }

}
