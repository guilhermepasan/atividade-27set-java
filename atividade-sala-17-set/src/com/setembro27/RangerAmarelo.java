package com.setembro27;

public class RangerAmarelo extends Ranger {
    
    RangerAmarelo(String nome, String cor, String armaPrincipal) {
        this.nome = nome;
        this.cor = cor;
        this.armaPrincipal = armaPrincipal;
    }
    
    public boolean usarPoderAcelerado() {
        return true;
    }
    
    @Override
    public boolean atacar() {
        return true;
    }
    
    @Override
    public boolean transformar() {
        return true;
    }
}
