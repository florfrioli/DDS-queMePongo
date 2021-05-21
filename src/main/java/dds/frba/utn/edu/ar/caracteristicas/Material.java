package dds.frba.utn.edu.ar.caracteristicas;

import dds.frba.utn.edu.ar.excepciones.PrendaInvalidaException;

public class Material {
  Trama trama;
  Tela tela;

  public Material(Trama trama, Tela tela) {
    this.trama = trama == null ? Trama.LISA :trama;
    this.verificarTelaNull(tela);
    this.tela = tela;
  }

  public void verificarTelaNull(Tela tela){
    if(tela == null){
      throw new PrendaInvalidaException("Tela incompleta");
    }
  }
}