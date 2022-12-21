public abstract class Pessoa { //Pessoa é uma classe abstrata, pois ela nunca é pessoalmente chamada, só
                               //Só seus atributos
    private String nomeAluno;
    private String matricula;

    public String getNomeAluno() {
        return nomeAluno;
    }
    public Pessoa(){

    }
    public Pessoa(String nomeAluno, String matricula) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nomeAluno='" + nomeAluno + '\'' +  ", matricula='" + matricula + '\'' + '}';
    }
}
