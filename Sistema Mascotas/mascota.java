import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class mascota {
    private String nombre, dueno, especie;
    private Date fecha_nacimiento;
    private ArrayList<Date> fechas_control;

    public mascota(String nombre, String dueno, String especie, Date fecha_nacimiento,ArrayList<Date> fechas_control) {
        this.nombre = nombre;
        this.dueno = dueno;
        this.especie = especie;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fechas_control= fechas_control;
    }

    public mascota() {
        this.nombre = "nombre";
        this.dueno = "dueno";
        this.especie = "especie";
        this.fecha_nacimiento = new Date();
        this.fechas_control= new ArrayList<>();
    }
    public int devolver_visitas_minimas(){ switch(this.especie){case "perro":return 4 ; case "gato":return 2; case "tortuga": return 1;};return 0; }
    public int cumple_visitas(Date fecha){
        int visitas =0;
        for (Date x:this.fechas_control
             ) {
            if(x.getYear() == fecha.getYear()){visitas+=1;}
        }
        return visitas-devolver_visitas_minimas();
    }
    public boolean asistencia_perfecta_siempre(){  int visitas =0;
        for (Date x:this.fechas_control
        ) {
           visitas+=1;
        };LocalDate hoy=LocalDate.now();int requeridas=(hoy.getYear()-this.fecha_nacimiento.getYear())*devolver_visitas_minimas(); if( visitas >= requeridas ){return true;}return false; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public ArrayList<Date> getFechas_control() {
        return fechas_control;
    }

    public void setFechas_control(ArrayList<Date> fechas_control) {
        this.fechas_control = fechas_control;
    }
}
