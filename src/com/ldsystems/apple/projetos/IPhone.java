package com.ldsystems.apple.projetos;

import java.util.Date;

import com.ldsystems.apple.interfaces.AparelhoTelefonico;
import com.ldsystems.apple.interfaces.NavegadorInternet;
import com.ldsystems.apple.interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private Long numeroSerial;

    private String modelo;

    private String cor;

    private Integer memoriaTotal;

    private Integer tamanhoTela;

    private Date dataFabricacao;

    public IPhone() {
    }

    public IPhone(Long numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    public Long getNumeroSerial() {
        return numeroSerial;
    }

    public void setNumeroSerial(Long numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getMemoriaTotal() {
        return memoriaTotal;
    }

    public void setMemoriaTotal(Integer memoriaTotal) {
        this.memoriaTotal = memoriaTotal;
    }

    public Integer getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(Integer tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void checarBateria() {
        System.out.println("Checando Bateria...");
    }

    public void verificaMemoriaDisponivel() {
        System.out.println("Verificando memória disponível...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página...");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroSerial == null) ? 0 : numeroSerial.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IPhone other = (IPhone) obj;
        if (numeroSerial == null) {
            if (other.numeroSerial != null)
                return false;
        } else if (!numeroSerial.equals(other.numeroSerial))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "IPhone [numeroSerial=" + numeroSerial + ", modelo=" + modelo + ", cor=" + cor + ", memoriaTotal="
                + memoriaTotal + ", tamanhoTela=" + tamanhoTela + ", dataFabricacao=" + dataFabricacao + "]";
    }

}
