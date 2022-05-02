package FactoryMethodProva;

public class FactoryMethod implements FormaInterface{

    @Override
    public void sobrePadrao() {
        System.out.println("\n\n\n// SOBRE //");
        System.out.println("O Factory Method tem por objetivo definir uma interface para criar um objeto mas deixar que subclasses decidam que classe instanciar. Factory Method permite que uma classe delegue a responsabilidade de instanciamento às subclasses.");
        
    }

    @Override
    public void tipoPadrao() {
        System.out.println("\n// TIPO //");
        System.out.println("Padrão Criacional");

    }

    @Override
    public void vantagens() {
        System.out.println("\n// VANTAGENS //");
        System.out.println("Evita o acoplamento apertado entre o criador e os produtos concretos;\n- Princípio da Responsabilidade Única. Pode mover o código de criação do produto para um local no programa, facilitando o suporte ao código;\n- Princípio Aberto/Fechado. Pode introduzir novos tipos de produtos no programa sem quebrar o código do cliente existente.");        
    }

    @Override
    public void desvantagens() {
        System.out.println("\n// DESVANTAGENS //");
        System.out.println("O código pode se tornar mais complicado, pois você precisa introduzir muitas novas subclasses para implementar o padrão. O melhor cenário é quando você está introduzindo o padrão em uma hierarquia existente de classes de criador.");
        
    }
    
}
