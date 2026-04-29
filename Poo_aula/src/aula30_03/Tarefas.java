package aula30_03;

public class Tarefas implements Tablet {
    private String nomeTarefa;
    private int dataLimite;
    private int percentual;
    private String descricao;

    public String getNomeTarefa() {return nomeTarefa;}

    public void setNomeTarefa(String nomeTarefa) {this.nomeTarefa = nomeTarefa;}

    public int getDataLimite() {return dataLimite;}

    public void setDataLimite(int dataLimite) {this.dataLimite = dataLimite;}

    public int getPercentual() {return percentual;}

    public void setPercentual(int percentual) {this.percentual = percentual;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public Tarefas(String nomeTarefa, int dataLimite, int percentual){
        this.setNomeTarefa(nomeTarefa);
        this.setDataLimite(dataLimite);
        this.setPercentual(percentual);
    }
    @Override
    public void exibirTarefaCompleta() {
        System.out.println("Tarefa: " + nomeTarefa);
        System.out.println("Data Limite: " + dataLimite);
        System.out.println("Percentual: " + percentual + "%");
        System.out.println("Status: " + descricao);
    }

    
    
    @Override
    public void percentualConcluido(String nomeTarefa, int percentual) {
        if (nomeTarefa.equalsIgnoreCase(getNomeTarefa()) && percentual == 100) {
            setPercentual(percentual);
            setDescricao("Tarefa concluída com sucesso");
            return;
        }
        if (nomeTarefa.equalsIgnoreCase(getNomeTarefa()) && percentual < 100 && percentual > 0){
            setPercentual(percentual);
            setDescricao("Tarefa em processo de conclusão");
            return;
        }
        if (nomeTarefa.equalsIgnoreCase(getNomeTarefa()) && percentual == 0){
            setPercentual(percentual);
            setDescricao("Tarefa não iniciada");
            return;
        }
        System.out.println("Tarefa não existe na memoria");
    }    
    
    @Override
    public void numeroPrioridade() {

    }
}
