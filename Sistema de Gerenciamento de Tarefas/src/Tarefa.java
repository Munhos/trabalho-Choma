public class Tarefa {

    private String nomeTarefa;
    private String prazoTarefa;
    private boolean statusTarefa = false;


    public Tarefa(String nomeTarefa, String prazoTarefa){
        this.nomeTarefa = nomeTarefa;
        this.prazoTarefa = prazoTarefa;
    }

    public String getTarefa() {
        return "Nome: " + nomeTarefa + "\nPrazo tarefa: " + prazoTarefa;
    }

    public void concluirTarefa(){
        this.statusTarefa = true;
        System.out.println("Tarefa concluída");
    }

    public void alterarPrazo(String novoPrazo){
        this.prazoTarefa = novoPrazo;
    }

    public boolean isConcluida(){
        return statusTarefa;
    }

}
