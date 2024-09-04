package encap;

public class Carro {

	// Atributos privados
    private String mark;
    private String model;        

    // Construtor
    public Carro(String mark, String model) {
        super(); // Chamada ao construtor da superclasse, opcional se não há herança explícita.
        this.mark = mark;  // Atribuindo o valor do parâmetro 'mark' ao atributo 'mark'
        setModel(model);   // Chamando o setter para 'model'
    }

    // Getter para 'mark'
    public String getMark() {
        return mark;
    }

    // Setter para 'mark'
    public void setMark(String mark) {
        this.mark = mark;
    }

    // Getter para 'model'
    public String getModel() {
        return model;
    }

    // Setter para 'model'
    public void setModel(String model) {
        this.model = model;
    }
}
