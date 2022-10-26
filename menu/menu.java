import java.util.*;

class menu {
    public static void main(String args[]) {
        while(true){
            int menuitem;
            String order;
            Scanner or = new Scanner(System.in);
            System.out.println("\n\t\t\tRestaurant");
            System.out.println("\tMenue");
            System.out.println("\n");
            System.out.println("\t\t1.Chicken Karahi:");
            System.out.println("\t\t2.Chicken Qorma:");
            System.out.println("\t\t3.Fish Finger");
            System.out.println("\t\t4.Chicken Fried Rice:");
            System.out.println("\t\t5.Chicken Biryani:");
            System.out.println("\t\t6.Chicken Pulao:");
            System.out.println("\t\t7.Naan:");
            System.out.println("\t\t8.Cold drink:");
            System.out.println("\n\tSelect menu from 1 to 8 for Price of Menu:");
            menuitem = or.nextInt();
            switch (menuitem) {
                case 1: {
                    ;
                    order = "\tChicken Karahi";
                    System.out.println("Chicken Karahi = 600Rs");
                }
                break;
                case 2: {
                    order = "\tChicken Qorma";
                    System.out.println("Chicken Qorma = 600Rs");
                }
                break;
                case 3: {
                    order = "\tFish Finger";
                    System.out.println("Fish Finger = 500Rs");
                }
                break;
                case 4: {
                    order = "\tChicken Fried Rice";
                    System.out.println("\tChicken Fried Rice = 400Rs");
                }
                break;
                case 5: {
                    order = "\tChicken Biryani";
                    System.out.println("\tChicken Biryani = 600Rs");
                }
                break;
                case 6: {
                    order = "\tChicken Pulao";
                    System.out.println("\tChicken Pulao = 500Rs");
                }
                break;
                case 7: {
                    order = "\tNaan";
                    System.out.println("\tNaan = 30Rs");
                }
                break;
                case 8: {
                    order = "\tCold drink";
                    System.out.println("\tCold drink = 70Rs");
                }
                break;
                case 0:{
                    System.exit(0);
                }
                break;
                default: {
                    order = "\tnot in menu";
                    System.out.println("\tYou selected the item which is not in our menu: ");

                }
            }
            System.out.println("\t\t Thanks for coming in to our Restaurant");
        }
    }
}