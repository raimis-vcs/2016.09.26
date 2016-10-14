package lt.vcs.main;

import lt.vcs.child.Dog;
import lt.vcs.child.Cat;
import lt.vcs.interfaces.Actions;

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Object objektas = new Cat();
        
        
        int i = 0 ;
        
        
        Object obj = i ;
        Cat c = new Cat();
        System.out.println(c.getVoice());
        
        Actions action = new Dog();
        System.out.println(action.getVoice());
       
    

    }

}
