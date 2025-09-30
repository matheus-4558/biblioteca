public class emprestimo {
    private aluno aluno;
    private livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    public emprestimo(aluno aluno, livro livro, String dataEmprestimo, String dataDevolucao) {
        this.aluno = aluno;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public aluno getAluno() {
        return aluno;
    }

    public livro getLivro() {
        return livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setAluno(aluno aluno) {
        this.aluno = aluno;
    }

    public void setLivro(livro livro) {
        this.livro = livro;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "emprestimo{" +
                "aluno=" + aluno +
                ", livro=" + livro +
                ", dataEmprestimo='" + dataEmprestimo + '\'' +
                ", dataDevolucao='" + dataDevolucao + '\'' +
                '}';
    }
}
