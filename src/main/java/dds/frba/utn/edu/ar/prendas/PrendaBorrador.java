package dds.frba.utn.edu.ar.prendas;

import dds.frba.utn.edu.ar.caracteristicas.*;
import dds.frba.utn.edu.ar.excepciones.PrendaInvalidaException;


public class PrendaBorrador {
  private Tipo tipo;
  private Categoria categoria;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Integer temperaturaMaxima = 20;

  void cargarTipoPrenda(Categoria categoria, Tipo tipo) {
    this.categoria = categoria;
    this.tipo = tipo;
  }

  void cargarPrenda(Material material, Color colorPrimario, Color colorSecundario) {
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  void cargarTemperatura(Integer temperaturaMaxima){
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public Prenda crearPrenda() {
    chequearPrendaCompleta(this.categoria, this.tipo, this.material, this.colorPrimario);
    return new Prenda(this.tipo, this.categoria, this.material, this.colorPrimario, this.colorSecundario, this.temperaturaMaxima);
  }

  private void chequearPrendaCompleta(Categoria categoria, Tipo tipo, Material material, Color color) {
    if (categoria == null || tipo == null || material == null || color == null) {
      throw new PrendaInvalidaException("Los datos de la prenda están incompletos");
    }
  }
}



