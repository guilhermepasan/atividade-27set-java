package com.setembro27;

public class RangerAzul extends Ranger {
    
    RangerAzul(String nome, String cor, String armaPrincipal) {
        this.nome = nome;
        this.cor = cor;
        this.armaPrincipal = armaPrincipal;
    }
    
    public boolean usarPoderAquático() {
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
