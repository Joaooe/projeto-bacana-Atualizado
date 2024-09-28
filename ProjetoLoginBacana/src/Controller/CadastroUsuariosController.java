package Controller;

import Model.CadastroUsuarioModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroUsuariosController {

    public void criarUsuariosController(String username, String email, String login, String password, String perfil) {

        Boolean sucesso;
        CadastroUsuarioModel novoUsuario = new CadastroUsuarioModel(username,
                email, perfil, login, password);
        sucesso = novoUsuario.enviarDadosDbDAL(novoUsuario);

        if (sucesso) {
            String mensagem = "Registro realizado com sucesso!";
            JOptionPane.showMessageDialog(null, mensagem);
        } else {
            String mensagem = "Falha ao realizar o registro no banco de dados!";
            JOptionPane.showMessageDialog(null, mensagem);
        }

    }

    public ArrayList<CadastroUsuarioModel> listarUsuarios() {
        CadastroUsuarioModel listaUsuarios = new CadastroUsuarioModel();
        return listaUsuarios.listarDadosBanco();
    }

    public ArrayList<CadastroUsuarioModel> filtrarUsuarios(String nome) {
        CadastroUsuarioModel listaUsuarios = new CadastroUsuarioModel();
        return listaUsuarios.filtrasDadosBanco(nome);
    }

    public void deletarUsuariosController(String id_user) {
        CadastroUsuarioModel oper = new CadastroUsuarioModel();
        oper.excluirRegistroBDModel(id_user);
    }

    public void atualizarUsuarioController(String id_user, String username, String email, String login, String perfil) {

        CadastroUsuarioModel usuarioAtualizado = new CadastroUsuarioModel(id_user, username, email, login, null, perfil);
        usuarioAtualizado.AtualizarUsuarioModel(usuarioAtualizado);

    }

    public void alterarSenhaUsuariosBDController(String id_user, String password) {
        CadastroUsuarioModel atualizarSenha = new CadastroUsuarioModel(id_user, null, null, null, password, null);
        atualizarSenha.AtualizarSenhaUsuarioModel(atualizarSenha);
    }

    public ArrayList<CadastroUsuarioModel> filtrarAtualizarUsuariosBD(String id_user) {
        CadastroUsuarioModel usuarioModel = new CadastroUsuarioModel();
        return usuarioModel.filtrarUsuarioAtualizarDadosBanco(id_user);
    }

}
