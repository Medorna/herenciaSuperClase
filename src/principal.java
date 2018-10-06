public class principal {
    
 public static void main(String[]args){
            
    Guerrero player2 = new Guerrero();
            
    player2.tipo="Espartano";
    player2.edad=21;
            
    System.out.println(player2.tipo + " "+ player2.edad +" años");
    
    
    Mago player1 = new Mago();
    
    player1.nombre="Merlin";
    player1.edad= 200;
    player1.agresivo=false;
    
    player1.caminar();
    player1.atacar();
    
        System.out.println(player1.nombre + " " + player1.edad + " años");
    
    }
    
}
