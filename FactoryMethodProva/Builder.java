package FactoryMethodProva;

public class Builder implements FormaInterface {

    @Override
    public void sobrePadrao() {
        System.out.println("\n\n\n// SOBRE //");
        System.out.println("A intenção do Builder é separar a construção de um objeto complexo da sua representação de modo que o mesmo processo de construção possa criar diferentes representações.");
        
    }

    @Override
    public void tipoPadrao() {
        System.out.println("\n// TIPO //");
        System.out.println("Padrão Criacional");
        
    }

    @Override
    public void vantagens() {
        System.out.println("\n// VANTAGENS //");
        System.out.println("- Permite a criação de um objeto em etapas;\n- Permite um encadeamento de chamadas de métodos (dentro de um método, podemos chamar outro);\n- O objeto final pode variar de acordo com a necessidade.");
        
    }

    @Override
    public void desvantagens() {
        System.out.println("\n// DESVANTAGENS //");
        System.out.println("- É um padrão complexo para se implementar.");
        
    }
    
}
