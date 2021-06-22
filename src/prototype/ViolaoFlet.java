
package prototype;

public class ViolaoFlet extends ViolaoPrototype{
    protected ViolaoFlet(ViolaoFlet violaoFlet) {
        this.valorCompra = violaoFlet.getValorCompra();
    }
    
    public ViolaoFlet() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Violao Flet\n " + "Valor: R$ " + getValorCompra();
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoFlet(this);
    }
}
