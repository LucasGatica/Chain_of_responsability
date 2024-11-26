package problemas;

public class Bucha extends Suporte{
    @Override
    public void prestarSuporte(String tipoDeProblema) {
        if (tipoDeProblema.equalsIgnoreCase("bucha")){
            System.out.println("inciando suporte para bucha");
        }else{
            super.prestarSuporte(tipoDeProblema);
        }
    }
}
