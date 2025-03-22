abstract class Carro implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("O Carro está ligando");
    }

    @Override
    public void desligar() {
        System.out.println("O Carro está desligando");
    }

    // Método abstrato que deve ser implementado pelas subsclasses
    public abstract void acelerar();
}
