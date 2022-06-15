import java.util.ArrayList;
import java.util.Date;

public class veterinaria {
private ArrayList<mascota> mascotas;

/*
public ArrayList<String> razas_perros_menos_asistencia(Date fecha){ArrayList<String> raza=new ArrayList<>();
    for (gato_perro x:this.mascotas
         ) {
        if(x.getEspecie() == "perro"){if(x.cumple_visitas(fecha)>=0){raza.add(x.getRaza());}}
    }

;}
*/
public String especie_mejor_asistencia(Date fecha){String especie;mascota mejor=new mascota();
    for (mascota x:this.mascotas
         ) {
        if(x.cumple_visitas(fecha)>mejor.cumple_visitas(fecha) ){mejor=x;}
    }return mejor.getEspecie();
}
}
