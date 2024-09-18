package com.setembro27;

public class MegaZord extends Zord {
    
    MegaZord(String nome, String poder) {
        this.nome = nome;
        this.poder = poder;
    }
    
    public boolean combinarZords() {
        return true;
    }
    
    @Override
    public boolean atacar() {
        return true;
    }
}
