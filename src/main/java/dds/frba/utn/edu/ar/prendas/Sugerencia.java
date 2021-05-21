package dds.frba.utn.edu.ar.prendas;

import dds.frba.utn.edu.ar.caracteristicas.Categoria;
import dds.frba.utn.edu.ar.excepciones.PrendaInvalidaException;

public class Sugerencia {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;
  Prenda accesorio;

  public Sugerencia(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio) {
    validarCategorias(prendaSuperior, prendaInferior, calzado, accesorio);
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
    this.accesorio=accesorio;
  }

  void validarCategorias(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio){
    if(!prendaSuperior.getCategoria().equals(Categoria.PARTE_SUPERIOR) || !prendaInferior.getCategoria().equals(Categoria.PARTE_INFERIOR) || !calzado.getCategoria().equals(Categoria.CALZADO) || !accesorio.getCategoria().equals((Categoria.ACCESORIO))){
      throw new PrendaInvalidaException("Los tipos del atuendo son incorrectos");
    }
  }
}
