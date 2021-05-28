package dds.frba.utn.edu.ar.sugerencias;

import dds.frba.utn.edu.ar.caracteristicas.Categoria;
import dds.frba.utn.edu.ar.prendas.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciasClimaticas implements GeneradorSugerencias {
  Double temperaturaActual;

  public SugerenciasClimaticas(Double temperaturaActual) {
    this.temperaturaActual = temperaturaActual;
  }

  @Override
  public List<Atuendo> generarSugerenciasDesde(List<Prenda> prendasAptas) {
   List<Prenda> prendasAptasTemperatura = prendasAptas.stream().filter(prenda -> prenda.esAptaPara(temperaturaActual)).collect(Collectors.toList());
   List<Prenda> superiores = prendasAptasTemperatura.stream().filter(prenda -> prenda.getCategoria().equals(Categoria.PARTE_SUPERIOR)).collect(Collectors.toList());
   List<Prenda> inferiores = prendasAptasTemperatura.stream().filter(prenda -> prenda.getCategoria().equals(Categoria.PARTE_INFERIOR)).collect(Collectors.toList());
   List<Prenda> calzados = prendasAptasTemperatura.stream().filter(prenda -> prenda.getCategoria().equals(Categoria.CALZADO)).collect(Collectors.toList());
   List<Prenda> accesorios = prendasAptasTemperatura.stream().filter(prenda -> prenda.getCategoria().equals(Categoria.ACCESORIO)).collect(Collectors.toList());
   List<Atuendo> atuendos = new ArrayList<>();
   atuendos.add(new Atuendo(superiores.get(0), inferiores.get(0), calzados.get(0), accesorios.get(0)));
   return atuendos;
  }
}
