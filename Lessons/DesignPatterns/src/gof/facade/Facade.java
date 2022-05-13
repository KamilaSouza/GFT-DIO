package gof.facade;

import subSystem1.crm.CrmService;
import subSystem2.cep.CepAPI;

public class Facade {

    public void migrateClient(String name, String cep) {

        String city = CepAPI.getInstance().cityFinder(cep);
        String state = CepAPI.getInstance().stateFinder(cep);

        CrmService.persistClient(name, cep, city, state);

    }
}
