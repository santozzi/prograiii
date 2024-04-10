public class Auto {
    private String color;
    private String patente;
    private int año;
    private String modelo;
    private int km;
    public Auto(){}


    public Auto(String color, String patente, int año, String modelo, int km) {
        this.color = color;
        this.patente = patente;
        this.año = año;
        this.modelo = modelo;
        this.km = km;
    }
    public void encender(){
        System.out.println("El auto se encendió");
    }
    public void kilometrajeMayor(){
        String msg= "El auto es muy nuevo aun";
        if(this.km > 100000){
            msg = String.format(
                    "Color: %s, Patente: %s, Año: %d, Modelo: %s, Km: %d",
                    this.color, this.patente,this.año,this.modelo, this.km
            );

        }
        System.out.println(msg);
    }
}
