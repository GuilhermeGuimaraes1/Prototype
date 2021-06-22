
package prototype;

public class ViolaoClassico extends ViolaoPrototype {
    
    protected ViolaoClassico(ViolaoClassico violaoClassico) {
        this.valorCompra = violaoClassico.getValorCompra();
    }
    
    public ViolaoClassico() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Violao Classico\n " + "Valor: R$ " + getValorCompra();
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoClassico(this);
    }
     
}
