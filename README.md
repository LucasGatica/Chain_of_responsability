## Apresentacao Chain of Responsibility

```java
// 1. criar classe abstrata Suporte
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
```

```java
// 2. criar classe bucha herdadndo suporte
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

```

```java
// 3. criar classe super bucha herdadndo suporte
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

```

```java
// 4. criar classe ultra bucha herdadndo suporte
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

```

```java
// 5 criar nosso chain of responsability(cadeia de possibilidade)
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
```

```java
// 6. classe main
public class Main {
    public static void main(String[] args) {
        Suporte cadeiaDeSuporte = CadeiaDeResponsabilidade.configurarCadeiaDeSuporte();

        cadeiaDeSuporte.prestarSuporte("ultra bucha");
        cadeiaDeSuporte.prestarSuporte("bucha");
        cadeiaDeSuporte.prestarSuporte("super bucha");
    }
}

```

agora vamos tentar adicionar um nivel de dificuldade que ainda nao existe

        cadeiaDeSuporte.prestarSuporte("bucha pro max");
