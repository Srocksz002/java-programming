import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        int choice = sc.nextInt();

        switch(choice){
            case 1:System.out.println("you are beautiful");
                    break;
            case 2:System.out.println("you are intelligent");
                    break;
            case 3:System.out.println("you are humble");
                    break;
            default:System.out.println("you are confident");
        }   

    }
}
