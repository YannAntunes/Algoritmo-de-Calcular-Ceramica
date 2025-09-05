import java.util.Scanner;

class CalCeramina {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);

        System.out.println("Largura da ceramica: ");
        double larguraCeramica = sc.nextDouble();

        System.out.println("Comprimento da ceramica: ");
        double comprimentoCeramica = sc.nextDouble();

        System.out.println("Largura do terreno: ");
        double larguraTerreno = sc.nextDouble();

        System.out.println("Comprimento do terreno: ");
        double comprimentoTerreno = sc.nextDouble();

        System.err.println("Digite a primeira cor (colunas pares): ");
        String cor1Nome = sc.next();

        System.out.println("Digite a primeira cor (colunas impares): ");
        String cor2Nome = sc.next();

        int qtdColunas = (int) Math.ceil(larguraTerreno / larguraCeramica);
        int qtdLinhas = (int) Math.ceil(comprimentoTerreno / comprimentoCeramica);

        int total = qtdColunas * qtdLinhas;

        int colunasPares = qtdColunas / 2;
        int colunasImpares = qtdColunas - colunasPares;

        int cor1 = colunasPares * qtdLinhas;
        int cor2 = colunasImpares * qtdLinhas;

        System.err.println();
        System.out.println("Quantidade total de ceramicas: " + total);
        System.err.println(cor1Nome + " (colunas pares): " + cor1 + " pecas");
        System.err.println(cor2Nome + " (colunas impares): " + cor2 + " pecas");

        sc.close();
    



    }
}