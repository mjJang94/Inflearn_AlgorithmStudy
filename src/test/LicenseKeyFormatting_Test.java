package test;

public class LicenseKeyFormatting_Test {
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
        String str = "1sad2nqw13lkqwe3lqw2121";
        int k = 4;

        System.out.println(solve(str, k));
    }

    public static String solve(String str, int k) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();

        String tmp = str.replaceAll("-", "");
        tmp = tmp.toUpperCase();

        for (int i = 0; i < length; i++) {
            stringBuffer.append(tmp.charAt(i));
        }

        for (int i = k; i < length; i = i + k) {
            //** 뒤에서부터 구분하도록 총 길이에서 i 위치에 '-' 넣기 **
            stringBuffer.insert(length - i, "-");
        }

        return stringBuffer.toString();
    }
}
