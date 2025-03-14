public class Pizza {
    private String tipo;
    private boolean masaPreparada;
    private boolean horneada;
    private boolean entregada;

    public Pizza() {
        this.tipo = "desconocido";
        this.masaPreparada = false;
        this.horneada = false;
        this.entregada = false;
    }

    public Pizza(String tipo) {
        this.tipo = tipo;
        this.masaPreparada = false;
        this.horneada = false;
        this.entregada = false;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isMAsaPreparada() {
        return masaPreparada;
    }

    public boolean isEntregada() {
        return entregada;
    }

    public boolean isHorneada() {
        return horneada;
    }

    public void prepararMasa() {
        if (!masaPreparada) {
            masaPreparada = true;
            System.out.println("la masa de la pizza " + tipo +"  "+  "acaba de estar lista");
        } else {
            System.out.println("la masa de la pizza ya estaba lista");
        }
    }

    public void hornear() {
        if (masaPreparada && !horneada) {
            horneada = true;
            System.out.println("la pizza " + tipo +"  "+  "ha sido horneada");

        } else {
            System.out.println("la pizza ya estaba horneada");
        }
    }

    public void entregar() {
        if (horneada && !entregada) {
            entregada = true;
            System.out.println("la pizza " +
                    tipo + "  "+ "ha sido entregada");
        } else {
            System.out.println("la pizza ya habia sido entregada");
        }
    }

    public String toString() {
        return "EL TOSTRING "+"pizza " + "tipo " + tipo+" . " + "masa preparada " +" : "+ masaPreparada +" . "+ "horneada" +" :"+ horneada +" ."+ "entregada" + " : "+ entregada;
    }

}
