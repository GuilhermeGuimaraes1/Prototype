
package prototype;

public class Main {

    public static void main(String[] args) {
        ViolaoClassico violaoClassico = new ViolaoClassico();
        ViolaoFolk violaoFolk = new ViolaoFolk();
        ViolaoFlet violaoFlet = new ViolaoFlet();
        ViolaoJumbo violaoJumbo = new ViolaoJumbo();
        Violao7Cordas violao7Cordas = new Violao7Cordas();
        Violao12Cordas violao12Cordas = new Violao12Cordas();
        ViolaoZeroDuploZeroTriploZero violaoZDZTZ = new ViolaoZeroDuploZeroTriploZero();
        
        
        // ====== violao classico =======
        ViolaoPrototype violaoClassicoNovo = violaoClassico.clonar();
        violaoClassicoNovo.setValorCompra(250.00);
        ViolaoPrototype violaoClassicoUsado = violaoClassico.clonar();
        violaoClassicoUsado.setValorCompra(150.0);
        
        System.out.println( " Novo" + violaoClassicoNovo.exibirInfo());
        System.out.println( " Usado"  + violaoClassicoUsado.exibirInfo());
        
        // ===== violao folk =====
        
        ViolaoPrototype violaoFolkNovo = violaoFolk.clonar();
        violaoFolkNovo.setValorCompra(900.00);
        ViolaoPrototype violaoFolkUsado = violaoFolk.clonar();
        violaoFolkUsado.setValorCompra(646.38);
        
        System.out.println( " Novo" + violaoFolkNovo.exibirInfo());
        System.out.println( " Usado"  + violaoFolkUsado.exibirInfo());
        
        // ===== violao folk =====
        
        ViolaoPrototype violaoFletNovo = violaoFlet.clonar();
        violaoFletNovo.setValorCompra(587.66);
        ViolaoPrototype violaoFletUsado = violaoFlet.clonar();
        violaoFletUsado.setValorCompra(325.38);
        
        System.out.println( " Novo" + violaoFletNovo.exibirInfo());
        System.out.println( " Usado"  + violaoFletUsado.exibirInfo());
        
        // ===== violao Jumbo =====
        
        ViolaoPrototype violaoJumboNovo = violaoJumbo.clonar();
        violaoJumboNovo.setValorCompra(899.00);
        ViolaoPrototype violaoJumboUsado = violaoJumbo.clonar();
        violaoJumboUsado.setValorCompra(526.38);
        
        System.out.println( " Novo" + violaoJumboNovo.exibirInfo());
        System.out.println( " Usado"  + violaoJumboUsado.exibirInfo());
        
        // ===== violao 7 cordas =====
        
        ViolaoPrototype violao7CordasNovo = violao7Cordas.clonar();
        violao7CordasNovo.setValorCompra(900.00);
        ViolaoPrototype violao7CordasUsado = violao7Cordas.clonar();
        violao7CordasUsado.setValorCompra(646.38);
        
        System.out.println( " Novo" + violao7CordasNovo.exibirInfo());
        System.out.println( " Usado"  + violao7CordasUsado.exibirInfo());
        
        //  =====violao 12 cordas =====
        
        ViolaoPrototype violao12CordasNovo = violao12Cordas.clonar();
        violao12CordasNovo.setValorCompra(900.00);
        ViolaoPrototype violao12CordasUsado = violao12Cordas.clonar();
        violao12CordasUsado.setValorCompra(646.38);
        
        System.out.println( " Novo" + violao12CordasNovo.exibirInfo());
        System.out.println( " Usado"  + violao12CordasUsado.exibirInfo());
        
        //  =====violao Zero Duplo Zero e Triplo Zero cordas ===== violaoZDZTZ
        
        ViolaoPrototype violaoZDZTZNovo = violaoZDZTZ.clonar();
        violaoZDZTZNovo.setValorCompra(800.00);
        ViolaoPrototype violaoZDZTZUsado = violaoZDZTZ.clonar();
        violaoZDZTZUsado.setValorCompra(346.38);
        
        System.out.println( " Novo" + violaoZDZTZNovo.exibirInfo());
        System.out.println( " Usado"  + violaoZDZTZUsado.exibirInfo());
        
    }
    
}
