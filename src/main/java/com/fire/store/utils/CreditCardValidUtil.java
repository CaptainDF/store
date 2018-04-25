package com.fire.store.utils;

/**
 * Created by DZA on 2018/4/25.
 */
public class CreditCardValidUtil {

    /**
     * 信用卡校验
     * @param card
     * @return
     */
    public static Boolean isValid(String card){
        if(calc(card)%10==0){  // 结果可以被10整除
            return true;
        }else{
            return false;
        }
    }

    public static int calc(String s){
        int odd = 0;
        int even = 0;
        int t = 0;
        char[] c = s.toCharArray();
        if(c.length%2==0){  // 如果位数为偶数个,则第一个数从偶数开始算起
            for(int i=0;i<c.length;i++){
                t = c[i]-'0';
                if(i%2!=0){
                    odd += t;
                }else{       // 第一个数加入到偶数
                    if(t*2>=10){
                        even += t*2-9;
                    }else{
                        even += t*2;
                    }
                }
            }
        }else{       // 如果位数为奇数个,则第一个数从奇数开始算起
            for(int i=0;i<c.length;i++){
                t = c[i]-'0';
                if(i%2==0){ // 第一个数加入到奇数
                    odd += t;
                }else{
                    if(t*2>=10){
                        even += t*2-9;
                    }else{
                        even += t*2;
                    }
                }
            }
        }
        return odd+even;    // 返回奇数位总和加上偶数位总和
    }
}
