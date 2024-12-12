
public class gene{
    private String dna;
    private int geneCount;
    
    public gene(String D){
        dna = D;
        geneCount = D.length();
    }
    public static int findStopCodon(String genome, int start){
        if (genome.length()%3 != 0) return -1;

        for (int i = start; i < genome.length()-2;i+=3){
            if (genome.substring(i,i+3).equals("TAA")
                || genome.substring(i,i+3).equals("TAG")
                || genome.substring(i,i+3).equals("TGA")){
                return i;
           }
        }
        return -1;
    }
    
    public static int countNucleotides(String g, char nucleotide){
        int count = 0;
        for(int c = 0; c<g.length(); c++){
            if(g.charAt(c) == nucleotide){
                count++;
            }
        }
        return count;
    }

    public static String findGenes(String dna, int startIndex){
        int start = 0;
        for(int i=startIndex; i<dna.length()-2; i++){
            if (dna.substring(i,i+3).equals("ATG")){
                start = i;
            }
        }
        int end = findStopCodon(dna,startIndex);
        if (end!= -1){
            return dna.substring(start,end+3);
        }
        return "No gene found";
    }

    public static boolean potentialGene(String dna){
        if(dna.startsWith("ATG") && (dna.endsWith("TAG")||dna.endsWith("TAA")||dna.endsWith("TGA"))){
            if (dna.length()%3 == 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        gene g1 = new gene("TCACATGAGCTATAA");
        String sampleGenome = "TCACATGAGCTATAA";
        System.out.println(findStopCodon(sampleGenome, 0));
        System.out.println(countNucleotides(sampleGenome, 'G'));
        System.out.println(findGenes(sampleGenome, 0));
    }
}