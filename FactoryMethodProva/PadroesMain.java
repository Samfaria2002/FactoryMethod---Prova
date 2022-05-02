package FactoryMethodProva;

public class PadroesMain{
    
    public static void main(String[] args) {


        PadroesFactory pf = new PadroesFactory();

        FormaInterface f1 = pf.getPadroes(PadroesFactory.padroes.Singleton);
        f1.sobrePadrao();
        f1.tipoPadrao();
        f1.vantagens();
        f1.desvantagens();

        FormaInterface f2= pf.getPadroes(PadroesFactory.padroes.Builder);
        f2.sobrePadrao();
        f2.tipoPadrao();
        f2.vantagens();
        f2.desvantagens();
        
        FormaInterface f3 = pf.getPadroes(PadroesFactory.padroes.FactoryMethod);
        f3.sobrePadrao();
        f3.tipoPadrao();
        f3.vantagens();
        f3.desvantagens();

        FormaInterface f4 = pf.getPadroes(PadroesFactory.padroes.Prototype);
        f4.sobrePadrao();
        f4.tipoPadrao();
        f4.vantagens();
        f4.desvantagens();
    }
}