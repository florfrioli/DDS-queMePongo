package dds.frba.utn.edu.ar.usuarios;

import dds.frba.utn.edu.ar.clima.ServicioMeteorologico;
import dds.frba.utn.edu.ar.prendas.Prenda;
import dds.frba.utn.edu.ar.sugerencias.Atuendo;
import dds.frba.utn.edu.ar.sugerencias.Recomendacion;
import dds.frba.utn.edu.ar.sugerencias.SugerenciasClimaticas;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  String nombre;
  List<Guardarropa>guardarropas = new ArrayList<>();
  String ciudad;
  List<Recomendacion> recomendaciones = new ArrayList<>();
  List<Recomendacion> recomendacionesAceptadas = new ArrayList<>();

  public Usuario(String nombre, String ciudad) {
    this.nombre = nombre;
    this.ciudad = (ciudad != null) ? ciudad : "Buenos Aires, Argentina";
  }

  public void agregarGuardarropa(Guardarropa guardarropa) {
    guardarropas.add(guardarropa);
  }

  public void agregarPrenda(Prenda prenda, Guardarropa guardarropa) {
    if(!guardarropas.contains(guardarropa)) {
      throw new RuntimeException("No existe el guardarropa");
    }
    int indice = guardarropas.indexOf(guardarropa);
    Guardarropa guardarropaBuscado = guardarropas.get(indice);
    guardarropaBuscado.agregarUnaPrenda(prenda);
  }

  public void quitarPrenda(Prenda prenda, Guardarropa guardarropa) {
    if(!guardarropas.contains(guardarropa)) {
      throw new RuntimeException("No existe el guardarropa");
    }
    int indice = guardarropas.indexOf(guardarropa);
    Guardarropa guardarropaBuscado = guardarropas.get(indice);
    guardarropaBuscado.quitarUnaPrenda(prenda);
  }

  public List<Atuendo> recibirSugerenciaClimatica() {
    ServicioMeteorologico servicioMeteorologico = new ServicioMeteorologico(ciudad);
    SugerenciasClimaticas sugerenciaClima = new SugerenciasClimaticas(servicioMeteorologico.temperaturaActual());
    return sugerenciaClima.generarSugerenciasDesde(guardarropas.get(0).getPrendas());
  }

  public void recibirRecomendacion(Recomendacion recomendacionRecibida) {
    this.recomendaciones.add(recomendacionRecibida);
  }

  private void quitarRecomendacion(Recomendacion recomendacion) {
    this.recomendaciones.remove(recomendacion);
  }

  public void aceptarRecomendacion(Recomendacion recomendacion) {
    recomendacion.aplicarEn(this);
    this.quitarRecomendacion(recomendacion);
    this.recomendacionesAceptadas.add(recomendacion);
  }

  public void deshacerRecomendaciones(){
    this.recomendacionesAceptadas
        .stream().forEach(recomendacion ->
          recomendacion.getRecomendacionInversa().aplicarEn(this));
    this.recomendacionesAceptadas.clear();
  }

  public void rechazarRecomendacion(Recomendacion recomendacion) {
    this.quitarRecomendacion(recomendacion);
  }

  public List<Prenda> getPrendas() {
    return guardarropas.get(0).getPrendas();
  }

  public List<Recomendacion> getRecomendaciones() {
    return recomendaciones;
  }
}
