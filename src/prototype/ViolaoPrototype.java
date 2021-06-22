
package prototype;

public abstract class ViolaoPrototype {
    protected double valorCompra;
    
    public abstract String exibirInfo();
    
    public abstract ViolaoPrototype clonar();

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    
    
}
