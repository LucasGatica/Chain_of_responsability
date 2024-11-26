package problemas;

public abstract class Suporte {
    protected Suporte proximoSuporte;

    public void setProximoSuporte(Suporte proximoSuporte){
        this.proximoSuporte = proximoSuporte;
    }

    public void prestarSuporte(String tipoDeProblema){
        if(proximoSuporte != null){
            proximoSuporte.prestarSuporte(tipoDeProblema);
        }else{
            System.out.println("Nao existe suporte para o seu tipo de problema");
        }
    }
}
