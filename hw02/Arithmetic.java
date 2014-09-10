//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Chris Mueller
//Arithmetic program for hw02
//
//define a class
public class Arithmetic { 
        
    //Add a main method
    public static void main(String[] args){
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //('S' is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes 
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        //PA sales tax rate
        double taxPercent=0.06;
        //calculate the cost of socks with and without tax
        double socksSubtotal$=(nSocks*sockCost$);
        double socksTotal$=((socksSubtotal$*taxPercent)+socksSubtotal$);
        //calculate the tax on the socks
        double socksTax$=(socksTotal$-socksSubtotal$);
        //calculate the cost of glasses with and without tax
        double glassesSubtotal$=(nGlasses*glassCost$);
        double glassesTotal$=((glassesSubtotal$*taxPercent)+glassesSubtotal$);
        //calculate the tax on the glasses
        double glassesTax$=(glassesTotal$-glassesSubtotal$);
        //calculate the cost of envelopes with and without tax
        double envelopeSubtotal$=(nEnvelopes*envelopeCost$);
        double envelopeTotal$=((envelopeSubtotal$*taxPercent)+envelopeSubtotal$);
        //calculate the tax on the envelope
        double envelopeTax$=(envelopeTotal$-envelopeSubtotal$);
        //calculate the cost of the entire purchase with and without tax
        double costSubtotal$=(socksSubtotal$+glassesSubtotal$+envelopeSubtotal$);
        double costTotal$=(socksTotal$+glassesTotal$+envelopeTotal$);
        double taxTotal$=(socksTax$+glassesTax$+envelopeTax$);
        
        //Print out every statement
        System.out.println("The socks cost "+(socksSubtotal$)+" without tax.");
        System.out.println("The socks cost "+(socksTotal$)+" with tax.");
        System.out.println("The tax on the socks was "+(socksTax$)+".");
        System.out.println("The glasses cost "+(glassesSubtotal$)+" without tax.");
        System.out.println("The glasses cost "+(glassesTotal$)+" with tax.");
        System.out.println("The tax on the glasses was "+(glassesTax$)+".");
        System.out.println("The envelope cost "+(envelopeSubtotal$)+" without tax.");
        System.out.println("The envelope cost "+(envelopeTotal$)+" with tax.");
        System.out.println("The tax on the envelope was "+(envelopeTax$)+".");
        System.out.println("The cost of the purchase was "+(costSubtotal$)+" without tax.");
        System.out.println("The cost of the purchase was "+(costTotal$)+" with tax.");
        System.out.println("The tax on the purchase was "+(taxTotal$)+".");
    }
}    
        
        
        
        
        

        
        
        
        