package one.digitalinovation.subsistema.crm;
/**
 * @author WellRL
 */
public class CrmService {
    public static void gravarCliente(String nome, String cep, String cidade, String uf){
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(uf);
    }
}
