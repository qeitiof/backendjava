import java.util.ArrayList;
import java.util.Random;

// Classe base Biocombustivel
class Biocombustivel {
    protected float quilogramas;

    public Biocombustivel() {
        this.quilogramas = 1000;
    }

    public Biocombustivel(float quilogramas) {
        this.quilogramas = quilogramas;
    }

    public float getQuilogramas() {
        return quilogramas;
    }

    public void setQuilogramas(float quilogramas) {
        this.quilogramas = quilogramas;
    }

    public float processar() {
        Random random = new Random();
        int n = random.nextInt(3) + 1; // 1, 2 ou 3
        return this.quilogramas * n;
    }
}

class CanaAcucar extends Biocombustivel {
    public CanaAcucar(float quilogramas) {
        super(quilogramas);
    }

    @Override
    public float processar() {
        return this.quilogramas * 3.5f;
    }
}

class Beterraba extends Biocombustivel {
    public Beterraba(float quilogramas) {
        super(quilogramas);
    }

    @Override
    public float processar() {
        return (this.quilogramas * 1.2f) + 1000;
    }
}

class Milho extends Biocombustivel {
    public Milho(float quilogramas) {
        super(quilogramas);
    }

    @Override
    public float processar() {
        return this.quilogramas + 1000;
    }
}

class GeradorCheioException extends Exception {
    public GeradorCheioException(String mensagem) {
        super(mensagem);
    }
}

class Biogerador {
    private float potenciaAtual;
    private float cargaAtual;
    private final float cargaMaxima;

    public Biogerador() {
        this.potenciaAtual = 0;
        this.cargaAtual = 0;
        this.cargaMaxima = 5;
    }

    public float getPotenciaAtual() {
        return potenciaAtual;
    }

    public void setPotenciaAtual(float potenciaAtual) {
        this.potenciaAtual = potenciaAtual;
    }

    public float getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(float cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void carregar(Biocombustivel b) throws GeradorCheioException {
        if (cargaAtual >= cargaMaxima) {
            throw new GeradorCheioException("O gerador está cheio! Não é possível carregar mais.");
        }
        float energia = b.processar() * 2.36f;
        this.potenciaAtual += energia;
        this.cargaAtual += 1;
    }

    public void esvaziar() {
        this.potenciaAtual = 0;
        this.cargaAtual = 0;
    }
}

// ✅ Classe principal - deve ter o mesmo nome do arquivo: Main.java
public class Main {
    public static void main(String[] args) {
        ArrayList<Biocombustivel> combustiveis = new ArrayList<>();
        combustiveis.add(new CanaAcucar(2000));
        combustiveis.add(new Beterraba(3000));
        combustiveis.add(new Milho(1500));
        combustiveis.add(new Beterraba(3500));
        combustiveis.add(new Beterraba(2000));

        Biogerador gerador01 = new Biogerador();

        for (Biocombustivel b : combustiveis) {
            try {
                gerador01.carregar(b);
            } catch (GeradorCheioException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        System.out.printf("Potência gerada no gerador 01: %.2f\n", gerador01.getPotenciaAtual());
        System.out.printf("Carga atual do gerador 01: %.0f\n", gerador01.getCargaAtual());
    }
}
