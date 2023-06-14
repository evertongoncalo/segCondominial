package devs.condominio.model;

public interface metodos {

    void cadastrar();
    void atualizar();
    void excluir();
    void consultar();
    void regEntrada();
    void regSaida();
    boolean autentica(String login, String senha);

}
