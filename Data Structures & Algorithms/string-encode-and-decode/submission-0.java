class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        // 5#Hello5#World
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                int n = Integer.parseInt(String.valueOf(str.charAt(i - 1)));
                answer.add(str.substring(i + 1, i + 1 + n));
            }
        }

        return answer;
    }
}
