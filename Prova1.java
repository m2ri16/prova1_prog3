public class Prova1 {
    class Empresa{

        private String name;
        private String cnpj;
        private Trabalhador[] trabalhadores;
        private String endereço;
        private int numeroFuncionarios;
        private String ceo;
    
        public Empresa(String name, String cnpj, String endereço, int numeroFuncionarios, String ceo){
            this.name = name;
            this.cnpj = cnpj;
            this.endereço = endereço;
            this.numeroFuncionarios = numeroFuncionarios;
            this.ceo = ceo;
            this.trabalhadores = new Trabalhador[20];
        }

        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getCnpj() {
            return cnpj;
        }
    
        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }
    
        public Trabalhador[] getTrabalhadores() {
            return trabalhadores;
        }
    
        public Prova1.Trabalhador[] setTrabalhadores(Trabalhador[] trabalhadores) {
            return this.trabalhadores = trabalhadores;
        }
    
        public String getEndereço() {
            return endereço;
        }
    
        public void setEndereço(String endereço) {
            this.endereço = endereço;
        }
    
        public int getNumeroFuncionarios() {
            return numeroFuncionarios;
        }
    
        public void setNumeroFuncionarios(int numeroFuncionarios) {
            this.numeroFuncionarios = numeroFuncionarios;
        }
    
        public String getCeo() {
            return ceo;
        }
    
        public void setCeo(String ceo) {
            this.ceo = ceo;
        }
    
        public void contratar(Trabalhador novoTrabalhador) {
            if (numeroFuncionarios < trabalhadores.length) {
                trabalhadores[numeroFuncionarios] = novoTrabalhador;
                numeroFuncionarios++;
            } else {
                System.out.println("Não é necessario a contratação de novos trabalhadores");
            }
        }
        
        public void trabalhar() {
            for (int i = 0; i < numeroFuncionarios; i++) {
                if (!trabalhadores[i].isFerias()) {
                    trabalhadores[i].setHorasTrabalhadas(trabalhadores[i].getHorasTrabalhadas() + 8);
                }
            }
        }
    
        public double calcularPagamento() {
            double pagamentoTotal = 0.0;
            for (int i = 0; i < numeroFuncionarios; i++) {
                Trabalhador trabalhador = trabalhadores[i];
                double salario = trabalhador.getHorasTrabalhadas() * trabalhador.getValorHora();
                pagamentoTotal += salario;
            }
            return pagamentoTotal;
        }
    }

    class Trabalhador {
        private String nome;
        private int idade;
        private double valorHora;
        private int horasTrabalhadas;
        private boolean ferias;
        
        public Trabalhador(String nome, int idade, double valorHora, int horasTrabalhadas, boolean ferias) {
            this.nome = nome;
            this.idade = idade;
            this.valorHora = valorHora;
            this.horasTrabalhadas = horasTrabalhadas;
            this.ferias = ferias;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public int getIdade() {
            return idade;
        }
    
        public void setIdade(int idade) {
            this.idade = idade;
        }
    
        public double getValorHora() {
            return valorHora;
        }
    
        public void setValorHora(double valorHora) {
            this.valorHora = valorHora;
        }
    
        public int getHorasTrabalhadas() {
            return horasTrabalhadas;
        }
    
        public void setHorasTrabalhadas(int horasTrabalhadas) {
            this.horasTrabalhadas = horasTrabalhadas;
        }
    
        public boolean isFerias() {
            return ferias;
        }
    
        public void setFerias(boolean ferias) {
            this.ferias = ferias;
        } 
    
        public void ferias() {
            ferias = !ferias;
        }
    }

    public static void main(String[] args) {
        Trabalhador[] trabalhadores = new Trabalhador[20];
        Empresa minhaEmpresa = new Empresa("Cognitivo", "3534575-096976", "Rua Santana", 2436, "Joao");
        minhaEmpresa.setTrabalhadores(trabalhadores);
        double pagamentoTotal = minhaEmpresa.calcularPagamento();
        System.out.println("O pagamento total a ser efetuado pela empresa é: " + pagamentoTotal);
    }
    
}
