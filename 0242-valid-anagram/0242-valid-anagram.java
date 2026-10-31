class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character , Integer> smap = new HashMap();
        HashMap<Character , Integer> tmap = new HashMap();
        
        for(int i  = 0; i<s.length();i++){
            char sch = s.charAt(i);
            if(smap.containsKey(sch)){
                int freq = smap.get(sch);
                smap.put(sch,freq+1);

            }
            else{
                smap.put(sch,1);
            }
        }
        for(int i  = 0; i<t.length();i++){
            char tch = t.charAt(i);
            if(tmap.containsKey(tch)){
                int freq = tmap.get(tch);
                tmap.put(tch,freq+1);

            }
            else{
                tmap.put(tch,1);
            }
        }

        for(char ch : smap.keySet()){
            if(!tmap.containsKey(ch) || !tmap.get(ch).equals(smap.get(ch))){
                return false;
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna