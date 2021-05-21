package dds.frba.utn.edu.ar.clima;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioMeteorologico {
  private String ciudad = "Buenos Aires, Argentina";
  private AccuWeatherAPI apiClima = new AccuWeatherAPI();
  private List<Map<String,Object>> condicionesClimaticas = apiClima.getWeather(ciudad);

  public ServicioMeteorologico(String ciudad) {
    this.ciudad = ciudad;
  }

  public double temperaturaActual(){
    HashMap<String, Object> temperatura = (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
    return temperaturaEnCelsius((Integer)temperatura.get("Value"));
  }

  private double temperaturaEnCelsius(Integer temperatura){
    return (temperatura-32)*5/9;
  }
}
