//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gerador senha01 = new Gerador(true, true, true, true);


        System.out.println(senha01.gerarSenha(20));
    }
}