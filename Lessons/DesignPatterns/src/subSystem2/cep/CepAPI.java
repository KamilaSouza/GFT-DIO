package subSystem2.cep;

public class CepAPI {

    private static CepAPI instance = new CepAPI();

    private CepAPI() {
        super();
    }

    public static CepAPI getInstance() {
        return instance;
    }

    public String cityFinder(String cep){
        return "Uberlândia";
    }

    public String stateFinder(String cep){
        return "MG";
    }
}
