class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        boolean isomorphic = true;

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapST.containsKey(a) && mapST.get(a) != b ||
                mapTS.containsKey(b) && mapTS.get(b) != a) {
                isomorphic = false;
                break;
            }

            mapST.put(a, b);
            mapTS.put(b, a);
        }

        return isomorphic;
    }
}