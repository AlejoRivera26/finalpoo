package ejercicios;

public class Main {

    public static void main(String[] args) {

        Punto3D primerPunto = new Punto3D(3,4,5);
        Punto3D segundoPunto = new Punto3D(5, 4,3);
        Punto3D tercerPunto = new Punto3D(3);
        System.out.println(primerPunto);
        System.out.println(segundoPunto);
        System.out.println(tercerPunto);

        System.out.println(segundoPunto.calcularDistanciaOrigen());
        System.out.println(segundoPunto.calcularDistanciaOtroPunto(0,0,0));
        System.out.println(segundoPunto.calcularDistanciaOtroPunto(primerPunto));

        Vector3D primerVector = new Vector3D(primerPunto, segundoPunto);
        Vector3D segundoVector = new Vector3D(tercerPunto);

        System.out.println(primerVector);
        System.out.println(primerVector.calcularMagnitud());
        primerVector.mostrarComponentes();
        System.out.println(segundoVector);
        System.out.println(segundoVector.calcularMagnitud());
        segundoVector.mostrarComponentes();

    }

}
