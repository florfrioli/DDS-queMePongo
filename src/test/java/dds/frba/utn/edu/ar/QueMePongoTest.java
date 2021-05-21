package dds.frba.utn.edu.ar;

import dds.frba.utn.edu.ar.clima.AccuWeatherAPI;
import org.junit.jupiter.api.Test;

public class QueMePongoTest {
  // Como usuarie de QuéMePongo, quiero poder conocer las condiciones climáticas
  // de Buenos Aires en un momento dado para obtener sugerencias acordes.
  @Test
  void condicionesClimaticasDeBuenosAires(){
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    apiClima.getWeather("Buenos Aires, Argentina");
  }
}
