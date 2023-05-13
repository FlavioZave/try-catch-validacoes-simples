import model.Login;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Login!");
        Login usuario1 = new Login("alves@email.com", "alves", "alves");
        Login usuario2 = new Login("pereira@emailcom", "pereira", "pereira22");

        System.out.println("** Teste do método de validar Email - Usuário 1. **");
        System.out.println(usuario1.validarEmail());
        System.out.println("** Teste do método de validar Email - Usuário 2. **");
        System.out.println(usuario2.validarEmail());

        System.out.println("\n** Teste do método de validar Senha = Usuario 1. **");
        System.out.println(usuario1.validarSenha());
        System.out.println("** Teste do método de validar Senha = Usuario 2. **");
        System.out.println(usuario2.validarSenha());
    }
}
