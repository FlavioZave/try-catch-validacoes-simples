package model;
import controller.Erro;

public abstract class Email {
    protected String email;

    public Email(String email) {
        this.email = email;
    }

    //-- tentar validar email ------------
    public String validarEmail()
    {
        try {
            if(email.equals("alves@email.com"))
            {
                return "Email válido";
            }
            else
            {
                throw new Erro("Email fornecido é inválido!");
            }
        } catch (Erro e) {
            return "Ocorreu um ERRO: "+ e.getMessage();
        }
    }
    //--------------------------------------

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public abstract String toString();
}
