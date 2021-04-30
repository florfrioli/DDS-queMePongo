package dds.frba.utn.edu.ar.uniformes;

import dds.frba.utn.edu.ar.caracteristicas.Color;
import dds.frba.utn.edu.ar.caracteristicas.Tipo;
import dds.frba.utn.edu.ar.prendas.Prenda;
import dds.frba.utn.edu.ar.prendas.PrendaBorrador;
import dds.frba.utn.edu.ar.uniformes.ConstructorUniformes;

public class UniformeJohnson implements ConstructorUniformes {

  @Override
  public Prenda crearPrendaSuperior(){
    PrendaBorrador borrador = new PrendaBorrador(Tipo.CAMISA_MANGA_CORTA);
    borrador.setTela(null);
    borrador.setColorPrimario(new Color(255,255,255));
    return borrador.crearPrenda();
  }

  @Override
  public Prenda crearPrendaInferior() {
    PrendaBorrador borrador = new PrendaBorrador(Tipo.PANTALON);
    borrador.setTela(null);
    borrador.setColorPrimario(new Color(0,0,0));
    return borrador.crearPrenda();
  }

  @Override
  public Prenda crearCalzado() {
    PrendaBorrador borrador = new PrendaBorrador(Tipo.ZAPATOS);
    borrador.setTela(null);
    borrador.setColorPrimario(new Color(0,0,0));
    return borrador.crearPrenda();
  }
}

