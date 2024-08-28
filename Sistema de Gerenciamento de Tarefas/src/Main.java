//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tarefa tarefa01 = new Tarefa("estudar", "10 dias");

        System.out.println(tarefa01.getTarefa());

        tarefa01.concluirTarefa();
        tarefa01.alterarPrazo("Semana que vem");
        System.out.println(tarefa01.isConcluida());

        System.out.println(tarefa01.getTarefa());
    }
}