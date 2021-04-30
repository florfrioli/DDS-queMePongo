package dds.frba.utn.edu.ar;
import dds.frba.utn.edu.ar.excepciones.PrendaInvalidaException;

public class Prenda {
  private Tipo tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(Tipo tipo, Categoria categoria, Material material, Color colorPrimario, Color colorSecundario) {

      this.chequearPrendaCompleta(categoria, tipo, material, colorPrimario);
      this.chequearTipo(categoria, tipo);
      this.tipo = tipo;
      this.material = material;
      this.colorPrimario = colorPrimario;
      this.colorSecundario = colorSecundario;


  }

  private void chequearPrendaCompleta(Categoria categoria, Tipo tipo, Material material, Color color){
    if(categoria == null || tipo == null || material== null || color == null){
      throw new PrendaInvalidaException("Los datos de la prenda están incompletos");
    }
  }

  private void chequearTipo(Categoria categoria, Tipo tipo){
    if(!tipo.esCategoriaValida(categoria)){
      throw new PrendaInvalidaException("La categoría no es válida");
    }
  }


  public Tipo getTipo() {
    return tipo;
  }

  public Material getMaterial() {
    return material;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

}

