package kyu7;

public class DnaStrand {

    public static String makeComplement(String dna) {

        StringBuilder answer = new StringBuilder();

        for(String s : dna.split("")){

            if(s.equalsIgnoreCase("t")){
                answer.append("A");
            }else if(s.equalsIgnoreCase("a")){
                answer.append("T");
            }else if(s.equalsIgnoreCase("g")){
                answer.append("C");
            }else{
                answer.append("G");
            }

        }

        return answer.toString();
    }


}
