package dds.frba.utn.edu.ar.usuarios;

import dds.frba.utn.edu.ar.clima.ServicioMeteorologico;
import dds.frba.utn.edu.ar.prendas.Prenda;
import dds.frba.utn.edu.ar.prendas.PrendaBorrador;
import dds.frba.utn.edu.ar.sugerencias.Sugerencia;
import dds.frba.utn.edu.ar.sugerencias.SugerenciasClimaticas;

import java.util.List;

public class Usuario {
  String nombre;
  Guardarropas guardarropas = new Guardarropas();
  String ciudad;

  public Usuario(String nombre, String ciudad) {
    this.nombre = nombre;
    this.ciudad = (ciudad != null) ? ciudad : "Buenos Aires, Argentina";
  }

  public void agregarPrenda(Prenda prenda){
    guardarropas.agregarUnaPrenda(prenda);
  }

  public List<Sugerencia> recibirSugerenciaClimatica(){
    ServicioMeteorologico servicioMeteorologico = new ServicioMeteorologico(ciudad);
    SugerenciasClimaticas sugerenciaClima = new SugerenciasClimaticas(servicioMeteorologico.temperaturaActual());
    return sugerenciaClima.generarSugerenciasDesde(guardarropas.getPrendas());
  }

  public List<Prenda> getPrendas() {
    return guardarropas.getPrendas();
  }
}
