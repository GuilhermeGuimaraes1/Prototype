
package prototype;

public class ViolaoZeroDuploZeroTriploZero extends ViolaoPrototype{
    protected ViolaoZeroDuploZeroTriploZero(ViolaoZeroDuploZeroTriploZero violaoZeroDuploZeroTriploZero) {
        this.valorCompra = violaoZeroDuploZeroTriploZero.getValorCompra();
    }
    
    public ViolaoZeroDuploZeroTriploZero() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Violões Zero, Duplo Zero e Triplo Zero\n " + "Valor: R$ " + getValorCompra();
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoZeroDuploZeroTriploZero(this);
    }
}
