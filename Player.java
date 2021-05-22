public class Player
{
   private String role;
   private int health;

   public Player(String r)
   {
      role = r;
      if(role.equals("Warrior"))
         health = 15;
      else
         health = 10;
   }

   public String getRole()
   {
      return role;
   }

   public int getH()
   {
      return health;
   }

   public String toString()
   {
      String output = "Role: " + role + "\n";
      output += "Health: " + health;
      return output;
   }
}