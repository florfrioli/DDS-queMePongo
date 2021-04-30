package dds.frba.utn.edu.ar.prendas;

import dds.frba.utn.edu.ar.caracteristicas.*;
import dds.frba.utn.edu.ar.excepciones.PrendaInvalidaException;


public class PrendaBorrador {
  private Tipo tipo;
  private Categoria categoria;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama tela = Trama.LISA;

  public PrendaBorrador(Tipo tipo) {
    if(tipo == null) {
      throw new PrendaInvalidaException("No se especificó un tipo");
    }
    this.tipo = tipo;
    this.categoria = tipo.getCategoria();
  }

  public void setMaterial(Material material) {
    if(material == null) {
      throw new PrendaInvalidaException("No se especificó un material");
    }
    if(!this.tipo.esMaterialValido(material)) {
      throw new PrendaInvalidaException("el material no es válido para la prenda");
    }
    this.material = material;
  }

  public void setColorPrimario(Color colorPrimario) {
    if(colorPrimario == null) {
      throw new PrendaInvalidaException("No se especificó un color");
    }
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setTela(Trama tela) {
    if(tela == null) {
      this.tela = Trama.LISA;
    }
    this.tela = tela;
  }

  public Prenda crearPrenda() {
    return new Prenda(this.tipo, this.categoria, this.material, this.colorPrimario, this.colorSecundario, this.tela);
  }
}



