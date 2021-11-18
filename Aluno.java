public class Aluno{

    private String nome;
    private int matricula;
    private String curso;
    private String discilina;

    private double nota1;
    private double nota2;
    private double nota3;

    public boolean aprovado(){
        double notaFinal=(nota1+nota2+nota3)/3.0;
        if(notaFinal>=7){
            System.out.println("Aprovado");
            return true;
        }
        else{
            System.out.println("Reprovado");
            return false;
        }
    }

    public Aluno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public Aluno(){

    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getDiscilina() {
        return discilina;
    }
    public void setDiscilina(String discilina) {
        this.discilina = discilina;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}