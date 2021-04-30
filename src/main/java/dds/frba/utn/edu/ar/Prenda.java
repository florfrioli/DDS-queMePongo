package dds.frba.utn.edu.ar;
import dds.frba.utn.edu.ar.excepciones.PrendaInvalidaException;

public class Prenda {
  private Tipo tipo;
  private Categoria categoria;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama tela;

  public Prenda(Tipo tipo, Categoria categoria, Material material, Color colorPrimario, Color colorSecundario, Trama tela) {

      this.chequearPrendaCompleta(categoria, tipo, material, colorPrimario, tela);
      this.categoria = categoria;
      this.tipo = tipo;
      this.tela = tela;
      this.material = material;
      this.colorPrimario = colorPrimario;
      this.colorSecundario = colorSecundario;
  }

  private void chequearPrendaCompleta(Categoria categoria, Tipo tipo, Material material, Color color, Trama tela){
    if(categoria == null || tipo == null || material== null || color == null || tela == null){
      throw new PrendaInvalidaException("Los datos de la prenda están incompletos");
    }
  }
}

