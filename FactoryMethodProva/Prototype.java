package FactoryMethodProva;

public class Prototype implements FormaInterface {

    @Override
    public void sobrePadrao() {
        System.out.println("\n\n\n// SOBRE //");
        System.out.println("O padrão de projeto Prototype visa especificar os tipos de objetos a serem criados usando uma instância-protótipo e criar novos objetos pela cópia desse protótipo");
        
    }

    @Override
    public void tipoPadrao() {
        System.out.println("\n// TIPO //");
        System.out.println("Padrão Criacional");

    }

    @Override
    public void vantagens() {
        System.out.println("\n// VANTAGENS //");
        System.out.println("- Permite uma maior flexibilidade de desenvolvimento e manuseabilidade;\n- Evita a criação de novos objetos descartáveis, diminuindo o custo de memória, o que nos permite usar o método Clone( ) para clonar o novo objeto;");
        
    }

    @Override
    public void desvantagens() {
        System.out.println("\n// DESVANTAGENS //");
        System.out.println("- Sempre é necessário implementar o mecanismo de clone em cada subclasse;\n- É um padrão caro para se desenvolver.");
        
    }

}