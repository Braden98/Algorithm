public void printPrimes(int n){  
    //定义arr数组来表示筛选出来的素数  
    boolean arr[] = new boolean[n];  
    //arr数组坐标i不是素数的话就令arr[i]=false  
    for(int k=2;k<n;k++){  
        if(!arr[k]){  
            for(int i=2*k;i<n;i+=k){  
                arr[i] =false;  
            }  
        }  
    }  
    //把求的素数放入数组a中。  
    for(int i=1;i<n;i++){  
        if(arr[i]){  
            System.out.println(i);  
        }  
    }  
}
