package Algorithm.String;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @Description 反转句子中的单词
 * @Author ubique
 * @Date 2019/7/16 8:39 PM
 */

public class reverseWords {
    public String reverseWords(String s) {
        if(null == s){
            return null;
        }
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : arr){
            sb.append(new StringBuilder(word).reverse());
            sb.append(" ");
        }
        int len = sb.length();
        if(len >= 1){
            sb.deleteCharAt(len - 1);
        }
        return sb.toString();
    }


}
