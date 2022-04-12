public class Persona {
        private String nombre;
        private int edad;
        private int dni;
        private int telefono;
        private String direccion;

        public Persona(){
            this.nombre = "Johnny";
            this.edad = 96;
            this.dni = 11033847;
            this.telefono = 44104321;
            this.direccion = "Constituyentes 6234";
        }

    public Persona(String nombre, int edad, int dni,int telefono,String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }
        public String getnombre (){

            return this.nombre;
        }

    public int getEdad(){
        return this.edad;
    }

    public int getdni(){
        return this.dni;
    }
    public int getTelefono(){
        return this.telefono;
    }

    public String getdireccion(){
        return this.direccion;
    }


    public void setnombre (String nombre){
            this.nombre=nombre;
    }

    public void setEdad(int edad){
         this.edad=edad;
    }

    public void setdni(int dni){
         this.dni=dni;
    }
    public void setTelefono(int telefono){
         this.telefono=telefono;
    }

    public void setdireccion(String direccion){
         this.direccion=direccion;
    }


    public boolean EsMayorDeEdad() {
         return this.edad >= 18;
    }

    public boolean SonLaMismaPersona (Persona p2 ) {
          return this.dni== p2.getdni();
    }

    public boolean TienenLaMismaEdad (Persona p2) {
         return this.edad== p2.getEdad();
    }
    public void mostrar(){
        System.out.println("nombre: " + this.getnombre()+"  "+this.getEdad()+" Dni: "+this.getdni()+" Telefono " + this.getTelefono()+" Direccion: "+this.getdireccion());
    }

}
