package dds.frba.utn.edu.ar.uniformes;

import dds.frba.utn.edu.ar.caracteristicas.Categoria;
import dds.frba.utn.edu.ar.excepciones.PrendaInvalidaException;
import dds.frba.utn.edu.ar.prendas.Prenda;

public class Uniforme {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.validarUniforme(prendaSuperior, prendaInferior, calzado);
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }

  private void validarUniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado){
    if(prendaSuperior.getCategoria() == Categoria.PARTE_SUPERIOR){
      throw new PrendaInvalidaException("No es una prenda de parte superior");
    }
    if(prendaInferior.getCategoria() == Categoria.PARTE_INFERIOR){
      throw new PrendaInvalidaException("No es una prenda de parte inferior");
    }
    if(calzado.getCategoria() == Categoria.CALZADO){
      throw new PrendaInvalidaException("No es un calzado");
    }
  }

  public Uniforme getUniformeDe(ConstructorUniformes constructorUniformes){
    return new Uniforme(
        constructorUniformes.crearPrendaSuperior(),
        constructorUniformes.crearPrendaInferior(),
        constructorUniformes.crearCalzado()
    );
  }

}
