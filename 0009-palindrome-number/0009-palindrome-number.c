#include <stdio.h>
#include <stdbool.h>

bool isPalindrome(int x) {
    int originalNum = x;
    long long reversedNum = 0;
    
    while(x>0){
        int digit = x%10;
        reversedNum = reversedNum*10 + digit;
        x = x/10;
    }
    return(long long) originalNum == reversedNum;
}
/*
int main(){
    int x;
    printf("Enter a Number");
    scanf("%d",&x);

    if(isPalindrome(x)==true){
        printf("Entered number %d is a Palindrome",x);
    }
    
    else{
        printf("Entered Number %d is not a palindome",x);
    }
  return 0;  
}*/