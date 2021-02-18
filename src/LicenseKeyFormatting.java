public class LicenseKeyFormatting {
    /**
     * ex)
     * input
     * String str1 = "8F3Z-2e-9-w"
     * String str2 = "8-5g-3-J"
     * int k = 4
     * <p>
     * output = 8F3Z-2E9W, 8-5G3J
     * <p>
     * 하이픈을 제거하고 대문자로 변환한다.
     * 끝에서 4자리씩 끊는다.
     */

    public static void main(String[] args) {

        String str1 = "8F3Z-2e-9-wavcdef";
        int k = 4;

        System.out.println(solve(str1, k));
    }

    private static String solve(String str, int k) {

        StringBuilder stringBuilder = new StringBuilder();

        String tmp = str.replaceAll("-", "");
        tmp = tmp.toUpperCase();

        int length = tmp.length();

        for (int i = 0; i < length; i++){
            stringBuilder.append(tmp.charAt(i));
        }
        for (int i = k; i < length; i = i + k) {
            stringBuilder.insert(length - i,'-');
        }


        return stringBuilder.toString();
    }
}
