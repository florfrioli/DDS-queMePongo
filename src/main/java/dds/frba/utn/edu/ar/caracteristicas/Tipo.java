package dds.frba.utn.edu.ar.caracteristicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Tipo {
  ZAPATOS(Categoria.CALZADO, Arrays.asList(new Material(Trama.LISA,Tela.CUERO))),
  ZAPATILLAS(Categoria.CALZADO, Arrays.asList(new Material(Trama.LISA,Tela.CUERO))),
  CHOMBA(Categoria.PARTE_SUPERIOR, Arrays.asList(new Material(Trama.LISA,Tela.CUERO))),
  CAMISA_MANGA_CORTA(Categoria.PARTE_SUPERIOR, Arrays.asList(new Material(Trama.LISA,Tela.ALGODON))),
  PANTALON(Categoria.PARTE_INFERIOR, Arrays.asList(new Material(Trama.LISA,Tela.ALGODON))),
  ANTEOJOS_DE_SOL(Categoria.ACCESORIO, Arrays.asList(new Material(Trama.LISA,Tela.ALGODON)));

  Categoria categoria;
  List<Material> materialesAdecuados = new ArrayList<>();

  Tipo(Categoria categoria, List<Material> materiales) {
    this.categoria = categoria;
    this.materialesAdecuados.addAll(materiales);
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public Boolean esCategoriaValida(Categoria categoria) {
    return this.categoria.equals(categoria);
  }
  public Boolean esMaterialValido(Material material){
    return this.materialesAdecuados.contains(material);
  }
}

