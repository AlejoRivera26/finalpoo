package ejercicios;

public class Vector3D {

    //Atributos
    Punto3D puntoInicial;
    Punto3D puntoFinal;

    //Constructores
    public Vector3D(Punto3D puntoIncial, Punto3D puntoFinal) {
        this.puntoInicial = puntoIncial;
        this.puntoFinal = puntoFinal;
    }

    public Vector3D(Punto3D puntoFinal){
        this.puntoFinal = puntoFinal;
        this.puntoInicial = new Punto3D();
    }

    public double calcularMagnitud(){
        return Math.sqrt(Math.pow(puntoFinal.x-puntoInicial.x,2)+Math.pow(puntoFinal.y-puntoInicial.y, 2)+Math.pow(puntoFinal.z-puntoInicial.z,2));
    }

    public void mostrarComponentes(){
        System.out.println(this.puntoFinal.x-this.puntoInicial.x+"\n");
        System.out.println(this.puntoFinal.y-this.puntoInicial.y+"\n");
        System.out.println(this.puntoFinal.z-this.puntoInicial.z+"\n");
    }

    @Override
    public String toString() {
        return "El vector comienza en el punto "+this.puntoInicial+" y termina en el punto "+this.puntoFinal;
    }
}
