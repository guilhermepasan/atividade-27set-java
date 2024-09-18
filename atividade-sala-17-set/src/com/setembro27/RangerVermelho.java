package com.setembro27;

public class RangerVermelho extends Ranger {
    
    RangerVermelho(String nome, String cor, String armaPrincipal) {
        this.nome = nome;
        this.cor = cor;
        this.armaPrincipal = armaPrincipal;
    }
    
    public boolean liderarEquipe() {
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
