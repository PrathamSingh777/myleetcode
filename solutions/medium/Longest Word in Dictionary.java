// Title: Longest Word in Dictionary
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-word-in-dictionary/

for( String w: words){
if(w.length()==1|| builtWords.contains(w.substring(0,w.length()-1))){
    if(w.length()>ans.length()){
}
        ans=w;
    }
    builtWords.add(w);
}




 return ans ;
    }
   
String ans = "";
        HashSet<String> builtWords = new HashSet<>();
}
