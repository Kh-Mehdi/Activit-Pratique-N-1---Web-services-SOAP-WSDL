import jakarta.xml.ws.Endpoint;
import ma.Mehdi.ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args)  {
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService()); //permet le deploiement d'un serveur http (0.0.0.0 = quelque soit l'adresse ip
        System.out.println("Server started: http://0.0.0.0:9191/");
    }
}
