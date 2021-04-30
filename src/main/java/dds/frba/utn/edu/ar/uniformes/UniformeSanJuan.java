package dds.frba.utn.edu.ar.uniformes;

import dds.frba.utn.edu.ar.caracteristicas.Color;
import dds.frba.utn.edu.ar.caracteristicas.Tipo;
import dds.frba.utn.edu.ar.caracteristicas.Trama;
import dds.frba.utn.edu.ar.prendas.Prenda;
import dds.frba.utn.edu.ar.prendas.PrendaBorrador;
import dds.frba.utn.edu.ar.uniformes.ConstructorUniformes;

public class UniformeSanJuan implements ConstructorUniformes {
    @Override
    public Prenda crearPrendaSuperior(){
      PrendaBorrador borrador = new PrendaBorrador(Tipo.CHOMBA);
      borrador.setTela(Trama.PIQUE);
      borrador.setColorPrimario(Color.VERDE);
      return borrador.crearPrenda();
    }

    @Override
    public Prenda crearPrendaInferior() {
      PrendaBorrador borrador = new PrendaBorrador(Tipo.PANTALON);
      borrador.setTela(Trama.ACETATO);
      borrador.setColorPrimario(Color.GRIS);
      return borrador.crearPrenda();
    }

    @Override
    public Prenda crearCalzado() {
      PrendaBorrador borrador = new PrendaBorrador(Tipo.ZAPATILLAS);
      borrador.setTela(null);
      borrador.setColorPrimario(Color.BLANCO);
      return borrador.crearPrenda();
    }

}
