package dds.frba.utn.edu.ar.sugerencias;

import dds.frba.utn.edu.ar.caracteristicas.Categoria;
import dds.frba.utn.edu.ar.excepciones.PrendaOtraCategoriaException;
import dds.frba.utn.edu.ar.prendas.Prenda;

public class Atuendo {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda calzado;
  Prenda accesorio;

  public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio) {
    validarCategorias(prendaSuperior, prendaInferior, calzado, accesorio);
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
    this.accesorio=accesorio;
  }

  void validarCategorias(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio) {
    if (!prendaSuperior.getCategoria().equals(Categoria.PARTE_SUPERIOR)) {
      throw new PrendaOtraCategoriaException("La parte superior es incorrecta");
    }
    if (!prendaInferior.getCategoria().equals(Categoria.PARTE_INFERIOR)) {
      throw new PrendaOtraCategoriaException("La parte inferior es incorrecta");
    }
    if (!calzado.getCategoria().equals(Categoria.CALZADO)) {
      throw new PrendaOtraCategoriaException("El calzado es incorrecta");
    }
    if(!accesorio.getCategoria().equals(Categoria.ACCESORIO)){
      throw new PrendaOtraCategoriaException("El accesorio es incorrecta");
    }
  }

  public Prenda getPrendaSuperior() {
    return prendaSuperior;
  }
}
