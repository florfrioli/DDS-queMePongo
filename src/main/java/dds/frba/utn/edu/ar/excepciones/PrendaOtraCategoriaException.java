package dds.frba.utn.edu.ar.excepciones;

public class PrendaOtraCategoriaException extends RuntimeException{
  public PrendaOtraCategoriaException(String causa){
    super("La prenda no es correcta porque: " + causa);
  }
}
