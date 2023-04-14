package one.digitalinovation.facade;

import one.digitalinovation.subsistema.cep.CepApi;
import one.digitalinovation.subsistema.crm.CrmService;
/**
 * @author WellRL
 */
public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String uf = CepApi.getInstancia().recuperarUf(cep);
        CrmService.gravarCliente(nome, cep, cidade, uf);
    }
}
