/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;
public class myCharacter {
    private String role;

   
    public myCharacter() {
        this.role = "No role";
    }

   
    public myCharacter(String role) {
        setRole(role);
    }

    
    public void setRole(String role) {
        switch (role.toLowerCase()) {
            case "wizard":
                this.role = role;
                System.out.println("You chose Wizard! How magical!");
                break;
            case "warrior":
                this.role = role;
                System.out.println("You chose Warrior! How brave!");
                break;
            case "rogue":
                this.role = role;
                System.out.println("You chose Rogue! How cunning!");
                break;
            default:
                System.out.println("Invalid role chosen. Setting role to 'No role'.");
                this.role = "No role";
                break;
        }
    }

    
    public String getRole() {
        return this.role;
    }
}
