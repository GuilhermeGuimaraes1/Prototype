
package prototype;

public class Violao12Cordas extends ViolaoPrototype {
    
    protected Violao12Cordas(Violao12Cordas violao12Cordas) {
        this.valorCompra = violao12Cordas.getValorCompra();
    }
    
    public Violao12Cordas() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Violao 12 Cordas \n " + "Valor: R$ " + getValorCompra();
    }

    @Override
    public ViolaoPrototype clonar() {
        return new Violao12Cordas(this);
    }
}
