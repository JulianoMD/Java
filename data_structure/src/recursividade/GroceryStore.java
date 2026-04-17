package recursividade;

public class GroceryStore {

    static int indiceMaior = 0, indiceMenor = 0;
    static double maiorValor, menorValor;
    static double soma = 0;

    public static void main(String[] args) {

        double[] revenue = new double[5];

        for (int i = 0; i <revenue.length; i++){
            revenue[i] = (double)(Math.random() * 1000);
        }

        maiorValor = revenue[0];
        menorValor = revenue[0];

        grocerysRevenue(revenue, 0);

        // total vendido
        System.out.printf("Total vendido: %.2f%n", soma);

        // media por caixa
        double average = soma / revenue.length;
        System.out.printf("Media por caixa: R$%.2f%n", average);

        // caixa que vendeu mais
        System.out.printf("Caixa que vendeu mais: %d = R$%.2f%n", (indiceMaior + 1), maiorValor);

        // caixa que vendeu menos
        System.out.printf("Caixa que vendeu menos: %d = R$%.2f%n", (indiceMenor + 1), menorValor);

        // caixas acima da media
        System.out.println("Caixas acima da media: " + aboveAverage(revenue, 0, average, 0));
    }

    public static void grocerysRevenue(double[] revenue, int index){
        // nao foi o melhor nome para o vetor, mas é o que tem no momento

        if (index == revenue.length) return;

        soma += revenue[index];

        if (revenue[index] > maiorValor) {
            maiorValor = revenue[index];
            indiceMaior = index;
        }

        if (revenue[index] < menorValor) {
            menorValor = revenue[index];
            indiceMenor = index;
        }

        grocerysRevenue(revenue, index + 1);
    }

    public static int aboveAverage(double[] revenue, int index, double average, int cont) {
        if (index == revenue.length) return cont;

        if (revenue[index] > average) cont++;

        return aboveAverage(revenue, index + 1, average, cont);
    }
}