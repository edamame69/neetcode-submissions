class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String str : strs) {
            result.append(str.length()).append("#").append(str);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            String sub = str.substring(i, j);
            int length = Integer.parseInt(sub);
            i = j + 1;
            j = i + length;
            String s = str.substring(i, j);
            strs.add(s);
            i = j;
        }
        return strs;


    }
}
