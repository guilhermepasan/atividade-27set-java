package com.setembro27;

public class Principal {
    public static void main(String[] args) {
        
        RangerVermelho rangerVermelho = new RangerVermelho("João", "Vermelho", "ArmaVermelha");
        RangerAmarelo rangerAmarelo = new RangerAmarelo("Zé", "Amarelo", "ArmaAmarela");
        RangerAzul rangerAzul = new RangerAzul("Pedro", "Azul", "ArmaAzul");
        
        MegaZord megaZord = new MegaZord("Mega Zord", "Raio Lazer");
    }
}
