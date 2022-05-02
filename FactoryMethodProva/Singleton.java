package FactoryMethodProva;

public class Singleton implements FormaInterface{

    public void sobrePadrao() {
        System.out.println("\n\n\n// SOBRE //");
        System.out.println("O Singleton é um padrão de projeto criacional, que garante que apenas um objeto desse tipo exista e forneça um único ponto de acesso a ele para qualquer outro código");
    }

    @Override
    public void tipoPadrao() {
        System.out.println("\n// TIPO //");
        System.out.println("Padrão Criacional");

    }

    @Override
    public void vantagens() {
        System.out.println("\n// VANTAGENS //");
        System.out.println("- Por ter apenas um único objeto criado, ele disponibiliza um acesso central a recursos.");
        
    }

    @Override
    public void desvantagens() {
        System.out.println("\n// DESVANTAGENS //");
        System.out.println("Qualidade e dificuldade de implementação depende da linguagem;\n- É difícil de testar;\n- É difícil de implementar em um ambiente distribuído.");
    }
    
}
