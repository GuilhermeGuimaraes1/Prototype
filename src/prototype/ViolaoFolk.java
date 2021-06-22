
package prototype;

public class ViolaoFolk extends ViolaoPrototype{
    protected ViolaoFolk(ViolaoFolk violaoFolk) {
        this.valorCompra = violaoFolk.getValorCompra();
    }
    
    public ViolaoFolk() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Violao Flok\n " + "Valor: R$ " + getValorCompra();
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoFolk(this);
    }
}
