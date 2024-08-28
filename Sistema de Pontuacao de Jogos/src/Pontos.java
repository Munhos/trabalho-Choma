public class Pontos {
    private int pontos;

    public Pontos(){
        this.pontos = 0;
    }

    public void adicionarPontos(int numPontos){
        pontos += numPontos;

        System.out.println("Atualmente vc tem: " + pontos);
    }

    public void removerPontos(int numPontos){
        if(pontos - numPontos < 0){
            pontos = 0;
        }else{
            pontos -= numPontos;
        }

        System.out.println("Atualmente vc tem: " + pontos);
    }

    public int getPontuacao(){
        return pontos;
    }




}
