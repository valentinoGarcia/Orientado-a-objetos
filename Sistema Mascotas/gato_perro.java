import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class gato_perro extends mascota{
    private String raza;

    public gato_perro(String nombre, String dueno, String especie, Date fecha_nacimiento, ArrayList<Date> fechas_control, String raza) {
        super(nombre, dueno, especie, fecha_nacimiento, fechas_control);
        this.raza = raza;
    }
    public gato_perro() {
        super();
        this.raza = "perro";
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
