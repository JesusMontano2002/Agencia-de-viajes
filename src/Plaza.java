import java.util.Date;

public class Plaza {
    private int idPlaza;
    private Vuelo vuelo;
    private Categoria categoria;
    private int numeroPlazas;
    private Date tarifa;

    public Plaza(int idPlaza, Vuelo vuelo, Categoria categoria, int numeroPlazas, Date tarifa) {
        this.idPlaza = idPlaza;
        this.vuelo = vuelo;
        this.categoria = categoria;
        this.numeroPlazas = numeroPlazas;
        this.tarifa = tarifa;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public Date getTarifa() {
        return tarifa;
    }

    public void setTarifa(Date tarifa) {
        this.tarifa = tarifa;
    }
}
