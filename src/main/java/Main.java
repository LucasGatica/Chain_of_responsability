import problemas.Suporte;

public class Main {
    public static void main(String[] args) {
        Suporte cadeiaDeSuporte = CadeiaDeResponsabilidade.configurarCadeiaDeSuporte();

        cadeiaDeSuporte.prestarSuporte("ultra bucha");
        cadeiaDeSuporte.prestarSuporte("bucha");
        cadeiaDeSuporte.prestarSuporte("super bucha");
        cadeiaDeSuporte.prestarSuporte("bucha pro max");
    }
}
