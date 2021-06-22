
package prototype;

public class ViolaoJumbo extends ViolaoPrototype {
    protected ViolaoJumbo(ViolaoJumbo violaoJumbo) {
        this.valorCompra = violaoJumbo.getValorCompra();
    }
    
    public ViolaoJumbo() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Violao Jumbo\n " + "Valor: R$ " + getValorCompra();
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoJumbo(this);
    }
}
