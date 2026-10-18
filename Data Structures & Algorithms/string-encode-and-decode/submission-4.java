class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> answer = new ArrayList<>();
        int start = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                int n = Integer.parseInt(str.substring(start, i));
                answer.add(str.substring(i + 1, i + 1 + n));
                i += n;
                start = i + 1;
            }
        }

        return answer;
    }
}
