public class ComplimentCapsule {
    private String location;
    
    public ComplimentCapsule(String location) {
        this.location = location;
    }
    
    public String dispense(int button) {
        String message;
        
        if (button == 1) {
            message = "Capsule 1: Your indentation is so clean it could be in a museum.";
        } else if (button == 2) {
            message = "Capsule 2: Semicolons feel respected around you.";
        } else if (button == 3) {
            message = "Capsule 3: If debugging were a sport, you would be varsity.";
        } else if (button == 4) {
            message = "Capsule 4: Your variable names are chef's kiss.";
        } else if (button == 5) {
            message = "Capsule 5: Today you are 99% caffeine and 1% unstoppable.";
        } else {
            message = "Capsule ERROR: Please choose 1-5.";
        }

        return location + " " + message;
    }
}