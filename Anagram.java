class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int a[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            a[t.charAt(i)]--;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Anagram a = new Anagram();
        String s = "anagram", t = "nagaram";
        boolean valid = a.isAnagram(s, t);
        System.out.println(valid);
    }
}