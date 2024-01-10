package HackerRank;

public class StringCompressionPr {
    public static void main(String[] args) {
        StringCompressionPr scp = new StringCompressionPr();
        String letters = "aabcccccaaa";
        String sol = scp.Compression(letters);
        System.out.println(sol);

    }

    public static String Compression(String s) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }
        if (s.length() > 1) {
            if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2)) {
                count++;
            } else {
                sb.append(s.charAt(s.length() - 2));
                sb.append(count);
                count = 1;
            }
            sb.append(s.charAt(s.length() - 1));
            sb.append(count);
        }
        s = sb.toString();
        return s;
    }

}

