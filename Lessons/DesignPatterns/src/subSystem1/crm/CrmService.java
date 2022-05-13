package subSystem1.crm;

public class CrmService {

    private CrmService (){
        super();
    }

    public static void persistClient(String name, String cep, String city, String state){
        System.out.println("Client persisted in CRM system.");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(state);

    }
}
