import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //cliente
        Cliente carlos = new Cliente(1, "Carlos", "Peres", "Vargas");

        //ciudad
        Ciudad cochabamba = new Ciudad(1, "Cochabamba");
        Ciudad santaCruz = new Ciudad(2, "Santa Cruz");
        Ciudad tarija = new Ciudad(3, "Tarija");

        //categoria
        Categoria turista = new Categoria(1, "Turista");

        //aeropuertos
        Aeropuerto jorgeWilstermann = new Aeropuerto("JW", "Jorge Wilstermann Camcho", cochabamba);
        Aeropuerto viruVuru = new Aeropuerto("VV", "Viru Viru", santaCruz);
        Aeropuerto orielLea = new Aeropuerto("OL", "Oriel Lea Plaza", tarija);

        //vuelos
        List<Vuelo> vuelos = new ArrayList<>();
        Vuelo cochabambaSantacruz = new Vuelo("BOA-158", Calendar.getInstance().getTime(), jorgeWilstermann, viruVuru);
        vuelos.add(cochabambaSantacruz);
        Vuelo santaCruzTarija = new Vuelo("BOA-159", Calendar.getInstance().getTime(), viruVuru, orielLea);
        vuelos.add(santaCruzTarija);

        //billete
        Billete billete = new Billete(1, Calendar.getInstance().getTime(), 650.5, carlos, cochabamba, tarija, turista, vuelos);

        System.out.println("Billete");
        System.out.println("========");
        System.out.println("Id: " + billete.getIdBillete());
        System.out.println("Fecha: " + billete.getFechaEmision());
        System.out.println("Precio total: " + billete.getPresioTotal());
        System.out.println("cliente: " + billete.getCliente().getNombre());
        System.out.println("Origen: " + billete.getOrigen().getNombre());
        System.out.println("Destino: " + billete.getDestino().getNombre());
        System.out.println("Categoria: " + billete.getCategoria().getNombre());
        System.out.println("Vuelos: ");
        for (Vuelo vuelo : billete.getVuelos()) {
            System.out.println("Codigo vuelo: " + vuelo.CodigoVuelo() + "Salida : " + vuelo.getSalida() + "Origen: " + vuelo.getOrigen().getNombre() + "Destino: " + vuelo.getDestino().getNombre()  );

        }

    }
}