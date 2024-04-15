package Oops;

public class Interface {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (in all directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right (by 1 step)");
    }
}

interface Herbivore{

}

interface Carnivore{

}

class Beer implements Herbivore,Carnivore{

}


