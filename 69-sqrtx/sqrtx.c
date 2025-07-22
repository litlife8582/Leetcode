int mySqrt(int x) {
    int i=0;
    for(;i<x;i++){
        long long a=(long long)i*i;
        long long b=(long long)(i+1)*(i+1);
        if(x>=a && x<b){
            break;
        }
    }
    return i;
}