public class Fecha {
    private int año;
    private int mes;
    private int dia;

    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void reiniciar(){
        this.dia = 0;
        this.mes=0;
        this.año=0;
    }

    public void adelantar(int d,int m,int a){
        this.dia += d;
        this.mes += m;
        this.año += a;

    }

    public int Dias_mes(){
        int retornar;
        switch(this.mes) {


            case 2: retornar = 28;break;
            case 4:retornar = 30;break;
            case 6:retornar = 30;break;
            case 9:retornar = 30;break;
            case 11:retornar = 30;break;
            default: retornar = 31;break;
        };
        return retornar;
    }
    public void normalizeition () {
        boolean seguir;
        seguir = true;
        int dias_del_mes;
        dias_del_mes = this.Dias_mes();

        while (seguir) {
            normalizar_dia(dias_del_mes);
        }
        seguir = true;
        while (seguir) {
            normalizar_mesardium();
        }

    }

    public boolean normalizar_dia(int dias_del_mes) { ;if (this.dia > dias_del_mes ) {this.dia = this.dia - dias_del_mes ; this.mes +=1; return true;};return false;}

    public boolean normalizar_mesardium () {if (this.mes > 12) {this.mes = this.mes-12; this.año +=1; return true; };return false;}

    public void imprimir(){
        System.out.println("Dia: "+ this.getDia() +" ,Mes: " + this.getMes()+" , Año: "+this.getAño() );

    }


}

