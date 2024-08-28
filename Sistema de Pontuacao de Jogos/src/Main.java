//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pontos jogador01 = new Pontos();

        System.out.println(jogador01.getPontuacao());

        jogador01.adicionarPontos(10);
        jogador01.removerPontos(13);

        System.out.println(jogador01.getPontuacao());
    }
}