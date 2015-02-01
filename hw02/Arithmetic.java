//////////////////////////////////////////////////////////////////////////
//Jason Yang
//HW-02 Arithmetic
//02.03.2015

public class Arithmetic{
    public static void main(String[] args) {
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        //Tax percetage
        double taxPercent=0.06;
        
        //Total Cost and Tax of each items
            //socks
        double TotalsockCost$ = nSocks * sockCost$;
        double sockTax$ = TotalsockCost$ * taxPercent;
        sockTax$ = ((int)(sockTax$*100))/100.0;
        
            //drinking glass
        double TotalglassCost$ = nGlasses * glassCost$;
        double glassTax$ = TotalglassCost$ * taxPercent;
        glassTax$ = ((int)(glassTax$*100))/100.0;
        
            //envelopes
        double TotalenvelopeCost$ = nEnvelopes * envelopeCost$;
        double envelopeTax$ = TotalenvelopeCost$ * taxPercent;
        envelopeTax$ = ((int)(envelopeTax$*100))/100.0;
        
            //Total Cost before tax
        double TotalCost$ = TotalsockCost$ + TotalglassCost$ + TotalenvelopeCost$;
            //Total Cost after tax
        double TotalCostTax$ = TotalCost$ * taxPercent + TotalCost$;
        TotalCostTax$ = ((int)(TotalCostTax$*100))/100.0;
        
        //Print outs
    	    //socks
    	System.out.println("Socks cost $" + TotalsockCost$ + " and sales tax of the socks is $" + sockTax$);
	        //drinking glass
	    System.out.println("Drinking glasses cost $" + TotalglassCost$ + " and sales tax of the drinking glasses is $" + glassTax$);
            //envelopes
        System.out.println("Envelopes cost $" + TotalenvelopeCost$ + " and sales tax of the envelopes $" + envelopeTax$);
    
            //Total cost of purchases (before tax)
        System.out.println("Total cost before tax is $" + TotalCost$);
        
            //Total actually paid with tax
        System.out.println("Total cost is $" + TotalCostTax$);
    }
}
    
