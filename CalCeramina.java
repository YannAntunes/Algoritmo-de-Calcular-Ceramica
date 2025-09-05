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

        int qtdColunas = (int) (larguraTerreno / larguraCeramica);
        int qtdLinhas = (int) (comprimentoTerreno / comprimentoCeramica);

        int total = qtdColunas * qtdLinhas;
        
    



    }
}