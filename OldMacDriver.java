// OldMacDriver.java (Starter File)
// Project: Old Mac’s Barnyard: Classes in Separate Files (with a Driver)
// Description: A driver class coordinates several animal classes. Students will
// add a new animal and ensure outputs match the spec.
//

public class OldMacDriver {
    public static void main(String[] args) {
        // TODO: Create two cows and make them moo.
        // Expected lines:
        // Cow still says moo.
        // Cow still says moo.
        OldMacCow maudine = new OldMacCow();
        OldMacCow pauline = new OldMacCow();
        maudine.moo();
        pauline.moo();
        
       

        // TODO: Create one duck and make it quack.
        // Expected line:
        // Duck still says quack.
        
        OldMacDuck ferdinand =  new OldMacDuck();
        ferdinand.quack();

        // TODO: Create a new animal class and make it make a sound.
        
        OldMacPig snowball = new OldMacPig();
        snowball.oink();
    }
}