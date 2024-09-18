package com.setembro27;

public abstract class Ranger {
    String nome;
    String cor;
    String armaPrincipal;
    
    public abstract boolean atacar();
    
    public boolean defender() {
        return true;
    }
    
    public boolean transformar() {
        return true;
    }
}
