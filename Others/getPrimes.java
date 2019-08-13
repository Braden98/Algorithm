public int[] vi(int n){  
    int []a = new int[200];  
    int k=0;  
    int num = 5;  
    a[0]=1;a[1]=2;a[2]=3;a[3]=5;a[4]=7;  
    for(int i=3;i<n;i+=3){  
        for(int j=0;j<2;j++){  
            k = 2*(i+j)-1;  
            if((k<n)&&k%5==0?false:k%7==0?false:true){  
                a[num] = k;  
                num++;  
            }    
        }  
    }  
    return a;
}
