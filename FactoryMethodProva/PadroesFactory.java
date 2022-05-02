package FactoryMethodProva;

public class PadroesFactory {

    public enum padroes{
        Singleton, FactoryMethod, Builder, Prototype
    }

    public FormaInterface getPadroes(padroes padrao) {
        FormaInterface forma = null;

        switch (padrao) {
            case Singleton:
                forma = new Singleton();
                break;
            
            case FactoryMethod:
                forma = new FactoryMethod();
                break;

            case Builder:
                forma = new Builder();
                break;

            case Prototype:
                forma = new Prototype();
                break;
            default:
                break;
        }
        return forma;
    }
}
