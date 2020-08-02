public class App {
    public static void main(String[] args) {
        String name = "Jon";

        Thread threadAssinaturas1 = new Thread(
                new TarefaBuscaTextual("assinaturas1.txt", name));
        Thread threadAssinaturas2 = new Thread(
                new TarefaBuscaTextual("assinaturas2.txt", name));
        Thread threadAutores = new Thread(
                new TarefaBuscaTextual("autores.txt", name));

        threadAssinaturas1.start();
        threadAssinaturas2.start();
        threadAutores.start();

        System.out.println("Id da thread Assinaturas1: " + threadAssinaturas1.getId());
        System.out.println("Id da thread Assinaturas: " + threadAssinaturas2.getId());
        System.out.println("Id da thread Autores: " + threadAutores.getId());

        System.out.println("As threads vão executar em paralelo" +
                "\na JVM decide quando executar qual delas" +
                "\n podendo ter que 'voltar'" +
                "Exemplo: primeiro a 1 depois a 2, depois continua a 1, depois a 3, etc" +
                "Esse println, por exemplo, pode ser executado antes das threads" +
                "mesmo estando abaixo delas na linha de código");
    }
}
