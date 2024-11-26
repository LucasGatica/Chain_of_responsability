package problemas;

public class SuperBucha extends Suporte{
    @Override
    public void prestarSuporte(String tipoDeProblema) {
       if(tipoDeProblema.equalsIgnoreCase("super bucha")){
           System.out.println("inciando suporte para super bucha");
       }else{
           super.prestarSuporte(tipoDeProblema);
       }
    }
}
