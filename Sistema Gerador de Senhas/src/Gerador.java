import java.util.Random;

public class Gerador {
    private boolean caracMin = false;
    private boolean caracMai = false;
    private boolean numeros = false;
    private boolean caracEsp = false;

    public Gerador(boolean caracMin, boolean caracMai, boolean numeros, boolean caracEsp){
        this.caracMin = caracMin;
        this.caracMai = caracMai;
        this.numeros = numeros;
        this.caracEsp = caracEsp;
    }

    private boolean validacao(){
        if(!caracMai && !caracMin && !numeros && !caracEsp){
            return false;
        }else {
            return true;
        }
    }

    private int geradorNum(int max){
        Random random = new Random();
        return random.nextInt(max);
    }

    public String gerarSenha(int caracteresMax) {
        if (validacao()) {
            String caracteresMin = "abcdefghijklmnopqrstuvwxyz";
            String caracteresMai = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String todosNumeros = "123456789";
            String caracteresEsp = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

            String caracteresSelecionados = "";

            if (this.caracMin) {
                caracteresSelecionados += caracteresMin;
            }

            if (this.caracMai) {
                caracteresSelecionados += caracteresMai;
            }

            if (this.numeros) {
                caracteresSelecionados += todosNumeros;
            }

            if (this.caracEsp) {
                caracteresSelecionados += caracteresEsp;
            }

            // Verifica se há algum conjunto de caracteres selecionado
            if (caracteresSelecionados.isEmpty()) {
                return ""; // Retorna string vazia se não houver caracteres selecionados
            }

            String senha = "";
            Random random = new Random();

            for (int i = 0; i < caracteresMax; i++) {
                int index = random.nextInt(caracteresSelecionados.length());
                senha += caracteresSelecionados.charAt(index);
            }

            return senha.toString();
        } else {
            return ""; // Retorna string vazia se a validação falhar
        }
    }



}
