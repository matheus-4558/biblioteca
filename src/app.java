public class app {
    public static void main(String[] args) {
        // Criar objeto aluno Maria, 17 anos, matrícula A123
        aluno maria = new aluno("Maria", 17, "A123");

        // Criar objeto livro Dom Casmurro, autor Machado de Assis, ano 1899
        livro domCasmurro = new livro("Dom Casmurro", "Machado de Assis", 1899);

        // Exibir informações do aluno e do livro
        System.out.println(maria);
        System.out.println(domCasmurro);

        // Alterar idade da Maria para 18 e título do livro para "Memórias Póstumas de Brás Cubas"
        maria.setIdade(18);
        domCasmurro.setTitulo("Memórias Póstumas de Brás Cubas");

        // Exibir novamente os objetos com as alterações
        System.out.println("\nApós alterações:");
        System.out.println(maria);
        System.out.println(domCasmurro);
    }
}
