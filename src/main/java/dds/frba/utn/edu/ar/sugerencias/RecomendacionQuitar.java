package dds.frba.utn.edu.ar.sugerencias;

import dds.frba.utn.edu.ar.prendas.Prenda;
import dds.frba.utn.edu.ar.usuarios.Guardarropa;
import dds.frba.utn.edu.ar.usuarios.Usuario;

public class RecomendacionQuitar implements Recomendacion{
  private final Prenda prenda;
  private final Guardarropa guardarropa;

  public RecomendacionQuitar(Prenda prenda, Guardarropa guardarropa) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  @Override
  public void aplicarEn(Usuario usuario) {
    usuario.quitarPrenda(prenda,guardarropa);
  }

  @Override
  public Recomendacion getRecomendacionInversa() {
    return new RecomendacionQuitar(prenda, guardarropa);
  }
}
