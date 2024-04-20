class RnaTranscription {

    String transcribe(String dnaStrand) {
        char[] allChars = dnaStrand.toCharArray();
        for (int i = 0; i < allChars.length; i++) {
            if (allChars[i] == 'G') allChars[i] = 'C';
            else if (allChars[i] == 'C') allChars[i] = 'G';
            else if (allChars[i] == 'T') allChars[i] = 'A';
            else if (allChars[i] == 'A') allChars[i] = 'U';
        }
        return String.valueOf(allChars);
    }


}
