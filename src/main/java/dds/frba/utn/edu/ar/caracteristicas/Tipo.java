package dds.frba.utn.edu.ar.caracteristicas;
import dds.frba.utn.edu.ar.caracteristicas.Categoria;
import dds.frba.utn.edu.ar.caracteristicas.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Tipo {
  ZAPATOS(Categoria.CALZADO, Arrays.asList(Material.CUERO)),
  BOTAS(Categoria.CALZADO, Arrays.asList(Material.CUERO, Material.GAMUZA)),
  ZAPATILLAS(Categoria.CALZADO, Arrays.asList(Material.CUERO, Material.GAMUZA)),
  CROCS(Categoria.CALZADO, Arrays.asList(Material.CUERO)),
  CHOMBA(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.LYCRA, Material.ALGODON)),
  REMERA_MANGA_CORTA(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.LYCRA, Material.ALGODON)),
  CAMISA_MANGA_CORTA(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.LYCRA, Material.ALGODON)),
  REMERA_MANGA_LARGA(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.LYCRA, Material.ALGODON)),
  MUSCULOSA(Categoria.PARTE_SUPERIOR, Arrays.asList(Material.LYCRA, Material.ALGODON)),
  PANTALON(Categoria.PARTE_INFERIOR, Arrays.asList(Material.LYCRA, Material.ALGODON, Material.JEAN, Material.CUERO)),
  PANUELO(Categoria.ACCESORIO, Arrays.asList(Material.LYCRA, Material.ALGODON)),
  ANTEOJOS_DE_SOL(Categoria.ACCESORIO, Arrays.asList(Material.PLASTICO));

  Categoria categoria;
  List<Material> materiales = new ArrayList<Material>();

  public Categoria getCategoria() {
    return categoria;
  }

  Tipo(Categoria categoria, List<Material> materiales) {
    this.categoria = categoria;
    this.materiales = new ArrayList<Material>();
    this.materiales.addAll(materiales);
  }

  public Boolean esCategoriaValida(Categoria categoria) {
    return this.categoria.equals(categoria);
  }
  public Boolean esMaterialValido(Material material){
    return this.materiales.contains(material);
  }
}

