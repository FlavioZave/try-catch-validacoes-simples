package model;
import controller.Erro;

public class Login extends Email{
    private String login, senha;

    public Login(String email, String login, String senha) {
        super(email);
        this.login = login;
        this.senha = senha;
    }

    // validar senha----------------------------------
    public String validarSenha()
    {
        try {
            if(senha.length() > 6 && senha.length() <=15)
            {
                return "Senha válida!";
            }
            else 
            {
                throw new Erro("Senha é menor que 6 ou maior que 15 caractéres!");
            }
        } catch (Exception e) {
         return "Ocorreu um ERRO: "+ e.getMessage();
        }
    }
    //-----------------------------------------------

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Login [email=" + email + ", login=" + login + ", senha=" + senha + "]";
    }
}
