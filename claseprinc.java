// Clase principal
public class Main {
    
    public static void main(String[] args) {
        // Crear objetos de tipo Animal, pero en realidad son subclases
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        Animal miVaca = new Vaca();

        // Llamar al método hacerSonido para cada objeto
        miPerro.hacerSonido();  // Debería imprimir: El perro ladra
        miGato.hacerSonido();   // Debería imprimir: El gato maúlla
        miVaca.hacerSonido();   // Debería imprimir: La vaca muge
    }
}


