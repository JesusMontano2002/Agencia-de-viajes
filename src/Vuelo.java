import java.util.Date;
import java.util.List;

public class Vuelo {

    private String idVuelo;
    private Date salida;
    private List<Billete> billetes;
    private Aeropuerto origen;
    private Aeropuerto destino;

    public Vuelo(String idVuelo, Date salida, Aeropuerto origen, Aeropuerto destino) {
        this.idVuelo = idVuelo;
        this.salida = salida;
        this.origen = origen;
        this.destino = destino;
    }

    public Vuelo(String idVuelo, Date salida, List<Billete> billetes, Aeropuerto origen, Aeropuerto destino) {
        this.idVuelo = idVuelo;
        this.salida = salida;
        this.billetes = billetes;
        this.origen = origen;
        this.destino = destino;


    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public List<Billete> getBilletes() {
        return billetes;
    }

    public void setBilletes(List<Billete> billetes) {
        this.billetes = billetes;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }
}
