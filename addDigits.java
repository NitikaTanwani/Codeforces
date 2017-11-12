class Solution {
    public int addDigits(int num) {
    int a=100;
        /* Here we calculate sum everytime and check if the sum of digits is a sigle digit number or not, if not we repat the process by putting num=a*/
while(a>9)
{  a=0;
 while(num>0)
 {
     a=a+num%10;
     num=num/10;
 }
 num=a;
}
        return a;
    }
}
