/*Program name is shopApp
 * Author @Aayush Bhusal
 * Version 10/07/2022
 */
import  java.util.*;

class Product{
    String name;
    int stockLevel;
    double price;
    
    Product(String name, int stockLevel, double price){
        this.name=name;
        this.stockLevel=stockLevel;
        this.price=price;
        
    }
    int  buyStock(int no_of_bought_item){
        if(stockLevel>=no_of_bought_item){
        stockLevel-=no_of_bought_item;
        return stockLevel;    
        } 
       return 0;    }
    
    double sellStock(int no_of_sold_item){
        
            stockLevel+=no_of_sold_item;
         
            return stockLevel;
        
        
      
    }
    
    double setPrice(double price){
        this.price=price;
        return price;
    }
    
    String getName(){
       return name; 
    }
    
    int getStockLevel(){
       return stockLevel ;
    }
    double  getPrice(){
       return price; 
    }
}
    
 class Forcomparison{
   
    Product p1=new Product("Pasta",10,5.5);
       Product p2=new Product("Biscuit",5,3.5);
       Product p3=new Product("Noodles",15,7.0);
       Product p4=new Product("Copy",13,8.5);
       Product p5=new Product("Book",20,20.0);
       
       Product[] myarray={p1,p2,p3,p4,p5};
       
         
    
    void buy(String item){
        Scanner input=new Scanner(System.in);
        int num;
        if(item.equals("Pasta"))
                {
                System.out.println("\nEnter the number of stocks you want to buy: ");
                num=input.nextInt();
                int value= p1.buyStock(num);
                if(value!=0){
                System.out.println("\nCongratulations!!, you have successfully purchased " +num+ " Pasta."
                        +"\nNow shop has "+value+ " Pasta left");
                double cost=num*p1.price;
                System.out.println("You need to pay "+ cost +"Bucks");
                }
               
                else{
                    System.out.println("\nSorry, shop has only "+ p1.stockLevel+" Pasta.");
                }
                    }
        else if(item.equals("Biscuit")){
                System.out.println("\nEnter the number of stocks you want to buy: ");
                num=input.nextInt();
                int value= p2.buyStock(num);
                if(value!=0){
                System.out.println("\nCongratulations!!, you have successfully purchased " +num+ " Biscuits."
                        +"\nNow shop has "+value+ " Biscuits left");
                double cost=num*p2.price;
                System.out.println("You need to pay "+cost+"Bucks");}
                else{
                    System.out.println("\nSorry, shop has only "+ p2.stockLevel+" Biscuits.");
                }
              }
        else if(item.equals("Noodles")){
                System.out.println("\nEnter the number of stocks you want to buy: ");
                num=input.nextInt();
                int value= p3.buyStock(num);
                if(value!=0){
                System.out.println("\nCongratulations!!, you have successfully purchased " +num+ " Noodles."
                        +"\nNow shop has "+value+ " Noodles left");
                double cost=num*p3.price;
                System.out.println("You need to pay "+cost+"Bucks");}
                else{
                    System.out.println("\nSorry, shop has only "+ p3.stockLevel+" Noodles.");
                }
                }
                        
        else if(item.equals("Copy")){
                System.out.println("\nEnter the number of stocks you want to buy: ");
                num=input.nextInt();
                int value= p4.buyStock(num);
                if(value!=0){
                System.out.println("\nCongratulations!!, you have successfully purchased " +num+ " Copy."
                        +"\nNow shop has "+value+ " Copy left");
                double cost=num*p4.price;
                System.out.println("You need to pay "+cost+"Bucks");}
                else{
                    System.out.println("\nSorry, shop has only "+ p4.stockLevel+" Copy.");
                }
                }
                       
        else if(item.equals("Book")){
                System.out.println("\nEnter the number of stocks you want to buy: ");
                num=input.nextInt();
                int value= p5.buyStock(num);
                if(value!=0){
                System.out.println("\nCongratulations!!, you have successfully purchased " +num+ " Books."
                        +"\nNow shop has only "+value+ " Books left");
                double cost=num*p5.price;
                System.out.println("You need to pay "+cost+" Bucks");}
                else{
                    System.out.println("\nSorry, shop has only "+ p5.stockLevel+" Books.");
                }
                }
                
        else{
            System.out.println("Oops!! the item you are trying to purchase is not in the list.");
        }
    }
 
    void sell(String item){
        Scanner input=new Scanner(System.in);
        int num;
        if(item.equals("Pasta"))
                {
                System.out.println("\nEnter the number of stocks you want to sell: ");
                num=input.nextInt();
                int value= (int) p1.sellStock(num);
                if(value!=0){
                System.out.println("\nCongratulations!!, you have successfully sold " +num+ " Pasta."
                        +"\nNow shop has "+value+ " Pasta left");
                double cost=num*p1.price;
                System.out.println("Congratulations!! You have got "+ cost +" Bucks");
                }
               
                
                    }
        else if(item.equals("Biscuit")){
                System.out.println("\nEnter the number of stocks you want to buy: ");
                num=input.nextInt();
                int value= (int) p2.sellStock(num);
                if(value!=0){
                System.out.println("\nCongratulations!!, you have successfully sold " +num+ " Biscuits."
                        +"\nNow shop has "+ value + " Biscuits left");
                double cost=num*p2.price;
                System.out.println("Congratulations!! You have got "+ cost +"Bucks");}
                
              }
        else if(item.equals("Noodles")){
                System.out.println("\nEnter the number of stocks you want to buy: ");
                num=input.nextInt();
                int value= p3.buyStock(num);
                if(value!=0){
                System.out.println("\nCongratulations!!, you have successfully sold " +num+ " Noodles."
                        +"\nNow shop has "+ value + " Noodles left");
                double cost=num*p3.price;
                System.out.println("Congratulations!! You have got "+ cost +"Bucks");}
                
                }
                        
        else if(item.equals("Copy")){
                System.out.println("\nEnter the number of stocks you want to buy: ");
                num=input.nextInt();
                int value= p4.buyStock(num);
                if(value!=0){
                System.out.println("\nCongratulations!!, you have successfully sold " +num+ " Copy."
                        +"\nNow shop has "+value+ " Copy left");
                double cost=num*p4.price;
                System.out.println("Congratulations!! You have got "+ cost +"Bucks");}
                
                }
                       
        else if(item.equals("Book")){
                System.out.println("\nEnter the number of stocks you want to buy: ");
                num=input.nextInt();
                int value= p5.buyStock(num);
                if(value!=0){
                System.out.println("\nCongratulations!!, you have successfully sold " +num+ " Books."
                        +"\nNow shop has only "+value+ " Books left");
                double cost=num*p5.price;
                System.out.println("Congratulations!! You have got "+cost+" Bucks");}
               
                }
                
        else{
            System.out.println("Oops!! the item you are trying to purchase is not in the list.");
        }
    }
 
    
}
public class Shopapp {
     public static void main(String [] args){
         
       System.out.println("!!!!You are hearltly Welcomed To Bhusal General Store!!!!");
       Product p1=new Product("Pasta",10,5.5);
       Product p2=new Product("Biscuit",5,3.5);
       Product p3=new Product("Noodles",15,7.0);
       Product p4=new Product("Copy",13,8.5);
       Product p5=new Product("Book",20,20.0);
       
       Product[] myarray={p1,p2,p3,p4,p5};
       
         
        System.out.println("\nMenu:"+"\nEnter 1 to display all products."+ "\nEnter 2 to buy stocks."+
                 "\nEnter 3 to sell stocks."+ "\nEnter 4 to reprice an item"+ 
                "\nEnter 5 to display the total value of stocks in a shop."+
                   "\nEnter 6 to exit.");
        
        Scanner input=new Scanner(System.in);
        
        
        int choice=getchoice();
        while(choice!=6){
        try{
        switch(choice){
            case 1:
               System.out.println("\nThis is the list of products in our shop!!\n");
               for(Product p: myarray){
                   
                   System.out.println("\nName: "+ p.getName());
                   System.out.println("Stock: "+p.getStockLevel());
                   System.out.println("Price: "+p.getPrice());
                   
               }
               choice=getchoice();
               break;
               
                
            case 2:
                Forcomparison obj=new Forcomparison();
                System.out.println("Enter name of the product you want to purchase: ");
                String item=input.nextLine();      
               
                obj.buy(item);
                choice= getchoice();
                        
                break;
            
            case 3: 
                Forcomparison obj2=new Forcomparison();
                System.out.println("Enter name of the product you want to sell: ");
                String itm=input.nextLine();
                obj2.sell(itm);
                choice=getchoice();
                break;
            
            case 4:
                System.out.println("Enter name of the product you want to reprice: ");
                
                String m=input.nextLine();
                if(m.equals("Pasta"))
                {
                    System.out.println("\nEnter new price of Pasta: ");
                    double new_price= input.nextDouble();
                    //p1.setPrice(new_price);
                    System.out.println("\nNew price for every stock of Pasta is: "+ p1.setPrice(new_price));
                    
                }
               
                    
                else if(m.equals("Biscuit"))
                        {
                         System.out.println("\nEnter new price of Biscuit: ");
                    double new_price= input.nextDouble();
                   // p1.setPrice(new_price);
                    System.out.println("\nNew price for every stock of Biscuit is: "+ p2.setPrice(new_price));

                
                 }
                else if(m.equals("Noodles")){
                    System.out.println("\nEnter new price of Noodles: ");
                    double new_price= input.nextDouble();
                   // p1.setPrice(new_price);
                    System.out.println("\nNew price for every stock of Noodles is: "+ p3.setPrice(new_price));

                }
                        
                else if(m.equals("Copy")){
                    System.out.println("\nEnter new price of Copy: ");
                    double new_price= input.nextDouble();
                   // p1.setPrice(new_price);
                    System.out.println("\nNew price for every stock of Copy is: "+ p4.setPrice(new_price));

                  }
                       
                else if(m.equals("Book")){
                    System.out.println("\nEnter new price of Book: ");
                    double new_price= input.nextDouble();
                   // p1.setPrice(new_price);
                    System.out.println("\nNew price for every stock of Book is: "+ p2.setPrice(new_price));

                                }
                
                else{
                    System.out.println("\nOops!! the item you are trying to purchase is not in the list.");
                        }
                
                choice=getchoice();
                break;
                
            case 5:
                 System.out.println("\nThis is the list of products with their value in our shop!!\n");
               for(Product p: myarray){
                   
                   System.out.println("\nName: "+ p.getName());
                   System.out.println("Price: "+p.getPrice());
                   
                
               }
               double total_value=p1.stockLevel*p1.price+p2.stockLevel*p2.price+
                           p3.stockLevel*p3.price+p4.stockLevel*p4.price+p5.stockLevel*p5.price;
                System.out.println("\nTotal value of all stocks combined is !!"+total_value);
               choice=getchoice();
               break;
               
            default:
                choice=0;
            
 
    }
        
               
        }
        catch(Exception e){
                System.out.println("Input is not valid and an exception has occured");
                }
                
        
        
        }                
     
     }   
        


     
    static int getchoice(){
         System.out.println("\nEnter your choice from the menu: ");
         Scanner input=new Scanner(System.in);
        int choice= input.nextInt();
        return choice;
     }
       
}







