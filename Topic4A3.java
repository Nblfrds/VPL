import java.util.Scanner;
import java.text.DecimalFormat;

public class Topic4A3{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        
        ///final
        int FinalTotalLocal = 0;
        int FinalTotalWestern = 0;
        int FinalTotalSells = 0;
        double FinalWesternRevenue = 0.00;
        double FinalLocalRevenue = 0.00;
        double FinalRevenue = 0.00;
        int FinalBurger = 0;
        int FinalSpaghetti = 0;
        int FinalChickenChop = 0;
        int FinalNasiLemak = 0;
        int FinalNasiGoreng = 0;
        int FinalMeeGoreng = 0;
        double FinalRevBurger = 0.00;
        double FinalRevSpaghetti = 0.00;
        double FinalRevChickenChop = 0.00;
        double FinalRevNasiLemak = 0.00;
        double FinalRevNasiGoreng = 0.00;
        double FinalRevMeeGoreng = 0.00;
        
        int numsOfOpDays = scan.nextInt();
        int numsOfCustomers = 0;
        
        if(numsOfOpDays<=0){
            System.out.println("Invalid input");
            return;
        }
        
        for(int day = 1; day<=numsOfOpDays; day++){
            numsOfCustomers = scan.nextInt();
            if(numsOfCustomers<=0){
                System.out.println("Invalid input");
                return;
            }
            ///Jumlah makanan///
            int quantity = 0;
            int TotalWestern = 0;
            int TotalLocal = 0;
            int Totalsells = 0;
            int burger = 0;
            int spaghetti = 0;
            int chickenchop = 0;
            int NasiLemak = 0;
            int NasiGoreng = 0;
            int MeeGoreng = 0;
            ///Jumlah untung///
            double WesternRevenue = 0.0;
            double LocalRevenue = 0.0;
            double DailyRevenue = 0.0;
            double RevenueBurger = 0.00;
            double RevenueSpaghetti = 0.00;
            double RevenueChickenChop = 0.00;
            double RevenueNasiLemak = 0.00;
            double RevenueNasiGoreng = 0.00;
            double RevenueMeeGoreng = 0.00;
            String promotion = "No Promotion";
            String popularCategory = "";
            
            while(numsOfCustomers>0){
                    int category = scan.nextInt();
                    int menuchoice = scan.nextInt();
                    quantity = scan.nextInt();
                    switch (category){
                        case 1: ///Western///
                            switch(menuchoice){ ///menuchoice///
                                case 1 :///burger///
                                    burger += quantity;
                                    RevenueBurger += quantity*12.00;
                                    break;
                                case 2 ://spaghetti
                                    spaghetti += quantity;
                                    RevenueSpaghetti += quantity*15.00;
                                    break;
                                case 3 : //chickenchop
                                    chickenchop += quantity;
                                    RevenueChickenChop += quantity*18.50;
                                    break;
                                default :
                                    System.out.println("Invalid input");
                                    return;
                            }
                            break;
                        case 2: ///Local////
                            switch(menuchoice){ ///menuchoice///
                                case 1 :///NasiLemak///
                                    NasiLemak += quantity;
                                    RevenueNasiLemak += quantity*5.00;
                                    break;
                                case 2 ://NasiGoreng
                                    NasiGoreng += quantity;
                                    RevenueNasiGoreng += quantity*8.50;
                                    break;
                                case 3 : //MeeGoreng
                                    MeeGoreng += quantity;
                                    RevenueMeeGoreng += quantity*7.00;
                                    break;
                                default :
                                    System.out.println("Invalid input");
                                    return;
                            }
                            break;
                        default :
                            System.out.println("Invalid input");
                            return;
                    }
                    numsOfCustomers--;
            }
            TotalWestern = burger + spaghetti + chickenchop;
            TotalLocal = NasiGoreng + NasiLemak + MeeGoreng;
            Totalsells = TotalWestern + TotalLocal;
            WesternRevenue = RevenueChickenChop+RevenueSpaghetti+RevenueBurger;
            LocalRevenue = RevenueMeeGoreng + RevenueNasiLemak + RevenueNasiGoreng;
            DailyRevenue = WesternRevenue+LocalRevenue;
            ///final
            FinalTotalWestern +=TotalWestern; 
            FinalTotalLocal += TotalLocal;
            FinalTotalSells +=Totalsells;
            FinalLocalRevenue += LocalRevenue;
            FinalWesternRevenue += WesternRevenue;
            FinalRevenue +=DailyRevenue;
            FinalBurger += burger;
            FinalSpaghetti += spaghetti;
            FinalChickenChop += chickenchop;
            FinalNasiLemak += NasiLemak;
            FinalNasiGoreng += NasiGoreng;
            FinalMeeGoreng += MeeGoreng;
            FinalRevBurger += RevenueBurger;
            FinalRevSpaghetti += RevenueSpaghetti;
            FinalRevChickenChop += RevenueChickenChop;
            FinalRevNasiLemak += RevenueNasiLemak;
            FinalRevNasiGoreng += RevenueNasiGoreng;
            FinalRevMeeGoreng += RevenueMeeGoreng;
            
            String dailysales = "";
            if(Totalsells>=100){
                dailysales = "High Sales";
            }else if(50<=Totalsells&&Totalsells<=99){
                dailysales = "Moderate Sales";
            }else{
                dailysales = "Low Sales";
            }
            if(dailysales.equals("High Sales")){
                if(Totalsells>=150){
                    promotion = "Premium Promotion";
                }else{
                    promotion = "Standard Promotion";
                }
            }
            if(FinalTotalWestern>FinalTotalLocal){
                popularCategory = "Western Food";
            }else if(FinalTotalLocal>FinalTotalWestern){
                popularCategory = "Local Food";
            }else{
                popularCategory = "Both categories are equally popular";
            }
            System.out.println(" ");
            System.out.println("Day "+day+" :");
            System.out.println(Totalsells+" items - "+dailysales);
            System.out.println("Daily Revenue: RM"+f.format(DailyRevenue));
            System.out.println("Promotion: "+promotion);
            System.out.println(" ");
            
            if(numsOfOpDays==day){
            System.out.println("MENU SALES REPORT");
            System.out.println("Burger: "+FinalBurger+" items - RM"+f.format(FinalRevBurger));
            System.out.println("Spaghetti: "+FinalSpaghetti+" items - RM"+f.format(FinalRevSpaghetti));
            System.out.println("Chicken Chop: "+FinalChickenChop+" items - RM"+f.format(FinalRevChickenChop));
            System.out.println("Nasi Lemak: "+FinalNasiLemak+" items - RM"+f.format(FinalRevNasiLemak));
            System.out.println("Nasi Goreng: "+FinalNasiGoreng+" items - RM"+f.format(FinalRevNasiGoreng));
            System.out.println("Mee Goreng: "+FinalMeeGoreng+" items - RM"+f.format(FinalRevMeeGoreng));
            System.out.println(" ");
            System.out.println("CATEGORY SALES REPORT");
            System.out.println("Western Food: "+FinalTotalWestern+" items - RM"+f.format(FinalWesternRevenue));
            System.out.println("Local Food: "+FinalTotalLocal+" items - RM"+f.format(FinalLocalRevenue));
            System.out.println("Most Popular Category: "+ popularCategory);
            }
        }
        
    }
}