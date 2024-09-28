package Model;

import DAL.GerenciadorBancoDados;
import java.util.ArrayList;

public class CadastroUsuarioModel extends LoginModel {

    //Atributos
    private String username;
    private String email;
    private String perfil;
    private String id;

    //Contrutores
    public CadastroUsuarioModel() {
    }

    //Construtor utilizado para criar um novo registro no banco
    public CadastroUsuarioModel(String username, String email, String perfil, String login, String password) {
        super(login, password);
        this.username = username;
        this.email = email;
        this.perfil = perfil;
    }

    //Construtor para listar os itens do banco de dados 
    public CadastroUsuarioModel(String id, String username, String email, String login, String password, String perfil) {
        super(login, password);
        this.username = username;
        this.email = email;
        this.perfil = perfil;
        this.id = id;
    }

    //Getters e Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Método para enviar estes dados para o BDb
    public Boolean enviarDadosDbDAL(CadastroUsuarioModel novoUsuario) {

        Boolean sucesso = null;
        GerenciadorBancoDados novoUser = new GerenciadorBancoDados();
        sucesso = novoUser.salvarUsuarioBD(novoUsuario);
        return sucesso;
    }

    //Método para solicitar ao banco de dados TODAS informaões
    public ArrayList<CadastroUsuarioModel> listarDadosBanco() {

        GerenciadorBancoDados oper = new GerenciadorBancoDados();
        return oper.listagemUsuariosBD();
    }

    //Método para solicitar ao banco de dados os dados filtrados
    public ArrayList<CadastroUsuarioModel> filtrasDadosBanco(String nome) {

        GerenciadorBancoDados oper = new GerenciadorBancoDados();
        return oper.filtragemUsuariosBD(nome);
    }

    //Metodo que envia o ID 
    public void excluirRegistroBDModel(String id_user) {
        GerenciadorBancoDados oper = new GerenciadorBancoDados();
        oper.deletarUsuarioBD(id_user);
    }

    public void AtualizarUsuarioModel(CadastroUsuarioModel usuarioAtualizado) {
        GerenciadorBancoDados oper = new GerenciadorBancoDados();
        oper.alterarUsuariosBD(usuarioAtualizado);

    }

    public void AtualizarSenhaUsuarioModel(CadastroUsuarioModel senhaUsuarioAtualizado) {
        GerenciadorBancoDados oper = new GerenciadorBancoDados();
        oper.alterarSenhaUsuariosBD(senhaUsuarioAtualizado);

    }

public ArrayList<CadastroUsuarioModel> filtrarUsuarioAtualizarDadosBanco(String id_user) {
    GerenciadorBancoDados oper = new GerenciadorBancoDados();
    return oper.filtrarUsuarioAtualizarDadosBanco(id_user);
}


}
