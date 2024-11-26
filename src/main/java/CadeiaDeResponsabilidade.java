import problemas.Bucha;
import problemas.SuperBucha;
import problemas.Suporte;
import problemas.UltraBucha;

public class CadeiaDeResponsabilidade {
    public static Suporte configurarCadeiaDeSuporte(){
        Suporte suporteBucha = new Bucha();
        Suporte suporteSuperBucha = new SuperBucha();
        Suporte suporteUltraBucha = new UltraBucha();

        suporteBucha.setProximoSuporte(suporteSuperBucha);
        suporteSuperBucha.setProximoSuporte(suporteUltraBucha);

        return suporteBucha;
    }
}
