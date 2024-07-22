class BloodRunner 
{
  public static void main(String[] args)
  {
   System.out.println("running main in Blood");
   char group=Blood.group();
   System.out.println("group return type:"+group);
   String personName=Blood.personName();
   System.out.println("personName return type:"+personName);
   double cost=Blood.cost();
   System.out.println("cost return type:"+cost);
   String hospitalTested=Blood.hospitalTested();
   System.out.println("hospitalTested return type:"+hospitalTested);
   boolean sickness=Blood.sickness();
   System.out.println("sickness return type:"+sickness);
   boolean donate=Blood.donate();
   System.out.println("donate return type:"+donate);
  
  }
}