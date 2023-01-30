public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        String maxStrand = "";
        int maxNuc = 0;
        for(String strand : strands){
            int nucCounter = 0;
            for(int i = 0; i < strand.length(); i++){
                if(strand.substring(i,i+1).equals(nuc)){
                    nucCounter++;
                }
            }
            if (nucCounter > maxNuc){
                maxNuc = nucCounter;
                maxStrand = strand;
            }
            else if(nucCounter == maxNuc && nucCounter > 0){
                if(strand.length() > maxStrand.length()){
                    maxStrand = strand;
                }
            }
        }
        return maxStrand;
    }
}