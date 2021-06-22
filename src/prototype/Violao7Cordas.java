
package prototype;

public class Violao7Cordas extends ViolaoPrototype {
    protected Violao7Cordas(Violao7Cordas violao7Cordas) {
        this.valorCompra = violao7Cordas.getValorCompra();
    }
    
    public Violao7Cordas() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Violao 7 Cordas\n " + "Valor: R$ " + getValorCompra();
    }

    @Override
    public ViolaoPrototype clonar() {
        return new Violao7Cordas(this);
    }
}
