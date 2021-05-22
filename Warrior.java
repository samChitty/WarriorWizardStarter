public class Warrior extends Player
{
   private int armor;

   public Warrior()
   {
      super("Warrior");
      armor = 10;
   }

   // when instructed, add a get method for the armor PIV
    public int getArmor(){
      return armor;
    }

  //when instructed, modify toString to display the armor PIV in the output
   public String toString()
   {
      String output = super.toString()+"\n"+"Armor: "+this.getArmor();
      return output;
   }


}