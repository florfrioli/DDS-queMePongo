package dds.frba.utn.edu.ar;


import dds.frba.utn.edu.ar.clima.ServicioMeteorologico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueMePongo4Test {
  @Test
  public void condicionesClimaticasDeBuenosAires() {
    Double temperaturaActual = 14.0;
    ServicioMeteorologico servicioMeteorologico = new ServicioMeteorologico("Buenos Aires, Argentina");
    assertEquals(servicioMeteorologico.temperaturaActual(), temperaturaActual, 1);
  }
}
