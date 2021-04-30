package dds.frba.utn.edu.ar.excepciones;

public class PrendaInvalidaException extends RuntimeException{
  public PrendaInvalidaException(String causa){
    super("La prenda no es correcta porque: " + causa);
  }
}
