package problemas;

public class UltraBucha extends Suporte{

    @Override
    public void prestarSuporte(String tipoDeProblema) {
       if(tipoDeProblema.equalsIgnoreCase("ultra bucha")){
           System.out.println("inciando suporte para ultra bucha");
       }else{
           super.prestarSuporte(tipoDeProblema);
       }
    }
}
