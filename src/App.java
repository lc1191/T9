public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente c1 = new Cliente();
            c1.credito = 33;
            c1.nombre = "Luis";
            c1.edad = 30;
            c1.telefono = "60500000";
        
            System.out.println("El cliente " + c1.nombre +
                " tiene " + c1.edad + " años," + " su numero de telefono es " + c1.telefono +
                " y tiene un credito de " + c1.credito + " euros" );
            System.out.println("Hola");
    }
        
}